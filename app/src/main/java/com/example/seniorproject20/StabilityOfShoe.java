package com.example.seniorproject20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
//Users specification of the shoes stability fit and its generated number
public class StabilityOfShoe extends AppCompatActivity {

    ShoeCalculator shoeCalculator;
    private int curTotal;
    private static final String TAG = "StabilityActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stability_of_shoe);

        //Grabs the intent and grabs the shoe
        Intent intent = getIntent();
        //shoeCalculator = intent.getParcelableExtra("radioChosen");
        Bundle extras = intent.getExtras();
        curTotal = extras.getInt("curTotal");
        Log.d(TAG, String.valueOf(curTotal));
    }

//    //Called when the user taps the button
//    //Sets the shoes need stability to a number in the 100s place
//    //Moves to the next page (pronation)
    public void onRadioStability(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.stable:
                if (checked) {
                    curTotal += 100;
                    //shoeCalculator.setStable(100);
                }
                break;
            case R.id.unstable:
                if (checked) {
                    curTotal += 200;
                    //shoeCalculator.setStable(200);
                }
                break;
        }

        Log.d(TAG, String.valueOf(curTotal));
        Intent intent = new Intent(this, PronationOfFoot.class);
        intent.putExtra("curTotal", curTotal);
        startActivity(intent);
    }
}