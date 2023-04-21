package com.example.adapter;

public class Dog {

    // поля сущности
    private String breedName;
    private String dogsDescription;
    private int dogResource;

    // конструктор
    public Dog(String breedName, String dogsDescription, int dogResource) {
        this.breedName = breedName;
        this.dogsDescription = dogsDescription;
        this.dogResource = dogResource;
    }

    // геттеры и сеттеры
    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    public String getDogsDescription() {
        return dogsDescription;
    }

    public void setDogsDescription(String dogsDescription) {
        this.dogsDescription = dogsDescription;
    }

    public int getDogResource() {
        return dogResource;
    }

    public void setDogResource(int dogResource) {
        this.dogResource = dogResource;
    }
}