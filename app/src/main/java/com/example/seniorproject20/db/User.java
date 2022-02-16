package com.example.seniorproject20.db;

import android.graphics.Bitmap;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

//Anatomy of an entity
//Define a primary key
//Ignore fields
//Provide table search support
//Index specific columns 
@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "shoe_name")
    public String shoeName;

    @ColumnInfo(name = "description")
    public String description;

    @Entity(primaryKeys = {"shoe_name", "description"})
    public class User {
        public String shoe_name;
        public String description;
    }

    @Ignore
    Bitmap picture;

    @Entity(ignoredColumns = "picture")
    public class RemoteUser extends User {
        @PrimaryKey
        public int uid;

        public boolean hasVpn;
    }
}