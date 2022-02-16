package com.example.seniorproject20;

import android.os.Parcel;
import android.os.Parcelable;
//Calculates the variables of different numbers and creates an added ID number for the shoe
public class ShoeCalculator implements Parcelable {
    //Variables
    public int width;
    public int location;
    public int stable;
    public int pronation;
    public int total;

    //Empty Constructor
    public ShoeCalculator() {
        this.width = 0;
        this.location = 0;
        this.stable = 0;
        this.pronation = 0;
        this.total = 0;
    }
    //Parcelable Constuctor
    protected ShoeCalculator(Parcel in) {
        width = in.readInt();
        location = in.readInt();
        stable = in.readInt();
        pronation = in.readInt();
        total = in.readInt();
    }
    //Regular Constructor
    public ShoeCalculator(int width, int road, int stable, int pronation) {
        this.width = width;
        this.location = road;
        this.stable = stable;
        this.pronation = pronation;
        this.total = total;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(width);
        dest.writeInt(location);
        dest.writeInt(stable);
        dest.writeInt(pronation);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ShoeCalculator> CREATOR = new Creator<ShoeCalculator>() {
        @Override
        public ShoeCalculator createFromParcel(Parcel in) {
            return new ShoeCalculator(in);
        }

        @Override
        public ShoeCalculator[] newArray(int size) {
            return new ShoeCalculator[size];
        }
    };
    //Getters and Setters
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getStable() {
        return stable;
    }

    public void setStable(int stable) {
        this.stable = stable;
    }

    public int getPronation() {
        return pronation;
    }

    public void setPronation(int pronation) {
        this.pronation = pronation;
    }

    public int getTotal() { return total; }

    public void setTotal(int total) {
        this.total = total;
    }


    //Shoe number adder
    public void createSum() {
        total = this.getLocation() + this.getPronation() + this.getStable() + this.getWidth();
        this.setTotal(total);
    }

//    //Select the shoe
//    public Array result() {
//        String[] recommendation;
//        switch(this.total) {
//            case 1111:
//                switch();
//        }
//    }
}
