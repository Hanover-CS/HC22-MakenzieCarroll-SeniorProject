package com.example.seniorproject20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//Produces the shoes that match the users ideal shoe based on their answers for the questions
//Pulls the shoe from the database using an ID number that matches the users ID number
public class ResultsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_page);
    }
}