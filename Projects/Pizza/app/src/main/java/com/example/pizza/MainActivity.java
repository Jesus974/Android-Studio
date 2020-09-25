package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

        // Initialisation de la liste
        MyListData[] myListData = new MyListData[]{
                new MyListData("Margherita", R.drawable.margarita, "12€", Arrays.asList("Tomate", "Mozzarella", "Basilic", "Huile d'Olive")),
                new MyListData("Regina ", R.drawable.regina, "13€", Arrays.asList("Tomate", "Mozzarella", "Jambon", "Champignons")),
                new MyListData("Napolitaine", R.drawable.napolitaine, "14€", Arrays.asList("Tomate", "Mozzarella", "Anchois", "Olives Noires", "Origan", "Huile d'olive")),
                new MyListData("Romaine ", R.drawable.romaine, "13€", Arrays.asList("Tomate", "Emmental", "Jambon")),
                new MyListData("Quatre fromages", R.drawable.fromages, "12€", Arrays.asList("Tomate", "Emmental", "Jambon")),
                new MyListData("Hawaïenne", R.drawable.hawai, "14€", Arrays.asList("Tomate", "Emmental", "Jambon")),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

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