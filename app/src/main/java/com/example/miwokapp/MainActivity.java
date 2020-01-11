package com.example.miwokapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // encontar la vista que muestra "Family Members"
        TextView family = (TextView) findViewById(R.id.family);

        // click listener del elemento
        family.setOnClickListener(new View.OnClickListener() {
            // se ejecutara esto cuando click en el elemento
            @Override
            public void onClick(View view) {
                //new Intent(Cotexto ActivityOrigen, ActivityDestino);
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        TextView colors = (TextView) findViewById(R.id.colors);

        // click listener del elemento
        colors.setOnClickListener(new View.OnClickListener() {
            // se ejecutara esto cuando click en el elemento
            @Override
            public void onClick(View view) {
                //new Intent(Cotexto ActivityOrigen, ActivityDestino);
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        //Otra forma de enlazar vistas, creando el override de OnClickListener en otra clase aparte e instanciadola
        TextView phrases = (TextView) findViewById(R.id.phrases);
        PhrasesClickListener PhrasesClickListener = new PhrasesClickListener();
        phrases.setOnClickListener(PhrasesClickListener);
    }

    /**Intents para invocar las otras vistas de la app*/
    /*public void openNumberList(View view){
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }*/

}
