package com.example.seniorproject20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

//Users specification of the users foot pronation and its generated number
public class PronationActivity extends AppCompatActivity {

    ShoeCalculator shoeCalculator;
    private int curTotal;
    private static final String TAG = "PronationActivity";
    private static final int NORM_PRONATION = 1000;
    private static final int OVER_PRONATION = 2000;
    private static final int UNDER_PRONATION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronation_of_foot);

        //Grabs the intent and grabs the shoe
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        curTotal = extras.getInt("curTotal");
        Log.d(TAG, String.valueOf(curTotal));
    }

    //Called when the user taps the button
    //Sets the shoes pronation to a number in the 1000s place
    //Moves to the next page (results page)

    public void onRadioPronation(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.neutralPronation:
                if (checked) {
                    curTotal += NORM_PRONATION;
                }
                break;
            case R.id.overPronation:
                if (checked) {
                    curTotal += OVER_PRONATION;
                }
                break;
            case R.id.underPronation:
                if (checked) {
                    curTotal += UNDER_PRONATION;
                }
                break;
        }

        Log.d(TAG, String.valueOf(curTotal));
        Intent intent = new Intent(this, ResultsPage.class);
        intent.putExtra("curTotal", curTotal);
        startActivity(intent);
    }
}