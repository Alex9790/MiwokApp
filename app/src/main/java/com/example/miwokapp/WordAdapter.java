package com.example.miwokapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorBackground;

    public WordAdapter (Activity context, ArrayList<Word> words, int colorBackground){
        super(context, 0, words);
        this.colorBackground = colorBackground;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        //creo q esto es por lo de reciclar vistas
        View listItemView = convertView;
        if(listItemView == null) {
            //supongo q inflate es para asignarle el custom layout que creamos, al iniciar el app, a una view vacia
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        //segun entiendo obtiene el objeto "word" como tal que se encuentra ubicado en esta posicion de la lista
        Word palabra = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        //eeeehhh creo q de la nueva "word" a asignarle esta vista, se le busca el contenido para luego sobreescribir el que se encuentra presente en el momento
        //para ello busca el TextView dentro del custom layout y le asigna el nuevo dato
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwokWord);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(palabra.getMiwokWord());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defaultWord);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(palabra.getDefaultWord());


            // Find the ImageView in the list_item.xml layout with the ID list_item_icon
            ImageView iconView = (ImageView) listItemView.findViewById(R.id.imageExample);
        if(palabra.hasImage()){
            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView
            iconView.setImageResource(palabra.getImageResource());
        }else{
            //elimina el elemnto en caso de no necesitarlo
            iconView.setVisibility(View.GONE);
        }

        //colocar backgornd de cada categoria
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.Textos);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), colorBackground);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        //se retorna la nueva vista con la informacion nueva
        return listItemView;
    }
}
