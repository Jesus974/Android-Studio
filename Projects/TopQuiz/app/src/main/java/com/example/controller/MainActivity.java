package com.example.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.model.User;
import com.example.topquiz.R;

public class MainActivity extends AppCompatActivity {

    private Button mPlayButton;
    private EditText mEditText;
    private User mUser;

    public static final int GAME_ACTIVITY_REQUEST_CODE = 42;
    private SharedPreferences mPreferences;

    public static final String PREF_KEY_SCORE = "PREF_KEY_SCORE";
    public static final String PREF_KEY_FIRSTNAME = "PREF_KEY_FIRSTNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // On instancie user
        mUser = new User();

        // ???
        mPreferences = getPreferences(MODE_PRIVATE);

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