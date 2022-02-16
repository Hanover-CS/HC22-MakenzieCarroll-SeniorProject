package com.example.seniorproject20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

//Users specification of the users foot pronation and its generated number
public class PronationOfFoot extends AppCompatActivity {

    ShoeCalculator shoeCalculator;
    private int curTotal;
    private static final String TAG = "PronationActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronation_of_foot);

        //Grabs the intent and grabs the shoe
        Intent intent = getIntent();
        //shoeCalculator = intent.getParcelableExtra("radioChosen");
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
                    curTotal += 1000;
                    //shoeCalculator.setPronation(1000);
                }
                break;
            case R.id.overPronation:
                if (checked) {
                    curTotal += 2000;
                    //shoeCalculator.setPronation(2000);
                }
                break;
            case R.id.underPronation:
                if (checked) {
                    curTotal += 3000;
                    //shoeCalculator.setPronation(3000);
                }
                break;
        }

        Log.d(TAG, String.valueOf(curTotal));
        Intent intent = new Intent(this, ResultsPage.class);
        //shoeCalculator.createSum();
//        int total = shoeCalculator.getTotal();
//        String s = String.valueOf(total);
//        Log.d(TAG, s);
        intent.putExtra("curTotal", curTotal);
        startActivity(intent);
    }
}