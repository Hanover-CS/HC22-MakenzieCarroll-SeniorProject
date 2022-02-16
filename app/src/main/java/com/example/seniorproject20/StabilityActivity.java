package com.example.seniorproject20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

//Users specification of the shoes stability fit and its generated number
public class StabilityActivity extends AppCompatActivity {

    private int curTotal;
    private static final String TAG = "StabilityActivity";
    private static final int STABLE = 100;
    private static final int NEUTRAL = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stability_of_shoe);

        //Grabs the intent and grabs the shoe
        Intent intent = getIntent();
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
                    curTotal += STABLE;
                }
                break;
            case R.id.unstable:
                if (checked) {
                    curTotal += NEUTRAL;
                }
                break;
        }

        Log.d(TAG, String.valueOf(curTotal));
        Intent intent = new Intent(this, PronationActivity.class);
        intent.putExtra("curTotal", curTotal);
        startActivity(intent);
    }
}