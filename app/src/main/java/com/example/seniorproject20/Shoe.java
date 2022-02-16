package com.example.seniorproject20;

//Class for holding the name and a description of a shoe
public class Shoe {

    //Variables
    public String shoeName;
    public String shoeDefinition;

    //Constructor
    public Shoe(String shoeName, String shoeDefinition) {
        this.shoeName = shoeName;
        this.shoeDefinition = shoeDefinition;
    }

    public String getShoeName() {
        return shoeName;
    }

    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

    public String getShoeDefinition() {
        return shoeDefinition;
    }

    public void setShoeDefinition(String shoeDefinition) {
        this.shoeDefinition = shoeDefinition;
    }


}
