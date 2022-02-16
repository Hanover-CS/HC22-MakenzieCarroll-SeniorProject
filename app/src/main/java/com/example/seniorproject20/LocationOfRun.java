package com.example.seniorproject20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

//Users specification of the location of run and its generated number
public class LocationOfRun extends AppCompatActivity {

    ShoeCalculator shoeCalculator;
    private int curTotal;
    private static final String TAG = "LocationActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_of_run);

        //Grabs the intent and grabs the shoe
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        curTotal = extras.getInt("curTotal");
        Log.d(TAG, String.valueOf(curTotal));

        //shoeCalculator = intent.getParcelableExtra("radioChosen");
    }

    //Called when the user taps the button
    //Sets the shoes location of run to a number in the 10s place
    //Moves to the next page (stability)
    public void onRadioLocation(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.roads:
                if (checked) {
                    curTotal += 10;
                    //shoeCalculator.setLocation(10);
                }
                break;
            case R.id.trail:
                if (checked) {
                    curTotal += 20;
                    //shoeCalculator.setLocation(20);
                }
                break;
        }

        Log.d(TAG, String.valueOf(curTotal));
        Intent intent = new Intent(this, StabilityOfShoe.class);
        intent.putExtra("curTotal", curTotal);
        startActivity(intent);
    }
}