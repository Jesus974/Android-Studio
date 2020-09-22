package com.example.lelab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        // Récupérer l'objet Intent qui a démarré l'Activity et extraire la chaîne identifiée par la constante EXTRA_MESSAGE
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        // Chercher le TextView de cette Activity
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}