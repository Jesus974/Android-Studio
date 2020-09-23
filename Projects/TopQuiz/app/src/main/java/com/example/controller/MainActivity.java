package com.example.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.model.User;
import com.example.topquiz.R;

public class MainActivity extends AppCompatActivity {

    private Button mPlayButton;
    private EditText mEditText;
    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // On instancie user
        mUser = new User();

        // Initialisitaion Button
        mPlayButton = findViewById(R.id.play);
        // Disable Play Button
        mPlayButton.setEnabled(false);

        // Initialisation Edit Text
        mEditText = findViewById(R.id.editTextTextPersonName);

        // Ajout d'un listener
        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mPlayButton.setEnabled(s.toString().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        // On click Play
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GameActivity.class);
                mUser.setFirstName(mEditText.getText().toString());
                startActivity(intent);

            }

        });

    }
}