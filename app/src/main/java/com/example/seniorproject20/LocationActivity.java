package com.example.seniorproject20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

//Users specification of the location of run and its generated number
public class LocationActivity extends AppCompatActivity {

    ShoeCalculator shoeCalculator;
    private int curTotal;
    private static final String TAG = "LocationActivity";
    private static final int ROAD_RUN = 10;
    private static final int TRAIL_RUN = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_of_run);

        //Grabs the intent and grabs the shoe
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        curTotal = extras.getInt("curTotal");
        Log.d(TAG, String.valueOf(curTotal));

    }

    //Called when the user taps the button
    //Sets the shoes location of run to a number in the 10s place
    //Moves to the next page (stability)
    public void onRadioLocation(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.roads:
                if (checked) {
                    curTotal += ROAD_RUN;
                }
                break;
            case R.id.trail:
                if (checked) {
                    curTotal += TRAIL_RUN;
                }
                break;
        }

        Log.d(TAG, String.valueOf(curTotal));
        Intent intent = new Intent(this, StabilityActivity.class);
        intent.putExtra("curTotal", curTotal);
        startActivity(intent);
    }
}