package com.example.pizza.model;

import java.util.List;

public class Pizza {

    private String mNom;
    private float mPrix;
    private List<String> mIngredients;
    private String mLinkImage;

    /*
    Constructeur
     */
    public Pizza(String nom, float prix, List<String> ingredients, String linkImage) {
        mNom = nom;
        mPrix = prix;
        mIngredients = ingredients;
        mLinkImage = linkImage;
    }

    public String getNom() {
        return mNom;
    }

    public void setNom(String nom) {
        mNom = nom;
    }

    public float getPrix() {
        return mPrix;
    }

    public void setPrix(float prix) {
        mPrix = prix;
    }

    public List<String> getIngredients() {
        return mIngredients;
    }

    public void setIngredients(List<String> ingredients) {
        mIngredients = ingredients;
    }

    public String getLinkImage() {
        return mLinkImage;
    }

    public void setLinkImage(String linkImage) {
        mLinkImage = linkImage;
    }
}
