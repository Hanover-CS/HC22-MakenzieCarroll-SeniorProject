package com.example.seniorproject20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

//Produces the shoes that match the users ideal shoe based on their answers for the questions
//Pulls the shoe from the database using an ID number that matches the users ID number
public class ResultsPage extends AppCompatActivity {

    private int totalShoeScore;
    private static final String TAG = "ResultsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_page);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        totalShoeScore = extras.getInt("curTotal");
        Log.d(TAG, String.valueOf(totalShoeScore));
        TextView shoeRec = (TextView) findViewById(R.id.results_text);
        String finalText = "This is your shoe recommendation based on your needs " + String.valueOf(totalShoeScore);
        shoeRec.setText(finalText);

    }



}