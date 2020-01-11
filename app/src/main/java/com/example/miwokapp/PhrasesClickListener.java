package com.example.miwokapp;

import android.content.Intent;
import android.view.View;

public class PhrasesClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        //new Intent(Cotexto ActivityOrigen, ActivityDestino);
        Intent phrasesIntent = new Intent(view.getContext(), PhrasesActivity.class);
        view.getContext().startActivity(phrasesIntent);
    }
}
