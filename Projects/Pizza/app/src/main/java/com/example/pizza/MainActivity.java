package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.pizza.model.Pizza;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pizza> mPizzas = new ArrayList<Pizza>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // On appelle la fonction
        createPizzas();
    }

    /*
    Fonction de création de Pizza
     */
    private void createPizzas() {
        mPizzas.add(new Pizza("Reine", 15, Arrays.asList("Tomate", "Emmental", "Jambon"), "Url"));
    }
}