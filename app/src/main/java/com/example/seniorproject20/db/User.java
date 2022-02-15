package com.example.seniorproject20.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "shoe_name")
    public String shoeName;

    @ColumnInfo(name = "description")
    public String description;
}