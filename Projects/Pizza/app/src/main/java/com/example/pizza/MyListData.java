package com.example.pizza;

import java.util.List;

public class MyListData {
    private String mNomPizza;
    private int imgId;
    private String mPrixPizza;
    private String mIngredients;

    public MyListData(String NomPizza, int imgId, String PrixPizza, List<String> ListIngredients) {
        this.mNomPizza = NomPizza;
        this.imgId = imgId;
        this.mPrixPizza = PrixPizza;
        this.mIngredients = ListIngredients.toString();;
    }

    public String getNomPizza() {
        return mNomPizza;
    }

    public void setNomPizza(String description) {
        this.mNomPizza = description;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getPrixPizza() {
        return mPrixPizza;
    }

    public void setPrixPizza(String prixPizza) {
        mPrixPizza = prixPizza;
    }

    public String getIngredients() {
        return mIngredients;
    }

    public void setIngredients(String ingredients) {
        mIngredients = ingredients;
    }
}
