package com.example.seniorproject20;

import android.os.Parcel;
import android.os.Parcelable;

import java.lang.reflect.Array;

public class Shoe implements Parcelable {
    //Variables
    public int width;
    public int location;
    public int miles;
    public int stable;
    public int pronation;
    public int total;

    //Empty Constructor
    public Shoe() {
        this.width = 0;
        this.location = 0;
        this.miles = 0;
        this.stable = 0;
        this.pronation = 0;
        this.total = 0;
    }
    //Parcelable Constuctor
    protected Shoe(Parcel in) {
        width = in.readInt();
        location = in.readInt();
        miles = in.readInt();
        stable = in.readInt();
        pronation = in.readInt();
        total = in.readInt();
    }
    //Regular Constructor
    public Shoe(int width, int road, int miles, int stable, int pronation) {
        this.width = width;
        this.location = road;
        this.miles = miles;
        this.stable = stable;
        this.pronation = pronation;
        this.total = total;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(width);
        dest.writeInt(location);
        dest.writeInt(miles);
        dest.writeInt(stable);
        dest.writeInt(pronation);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Shoe> CREATOR = new Creator<Shoe>() {
        @Override
        public Shoe createFromParcel(Parcel in) {
            return new Shoe(in);
        }

        @Override
        public Shoe[] newArray(int size) {
            return new Shoe[size];
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

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
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
