package com.example.seniorproject20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

//Users specification of the users foot pronation and its generated number
public class PronationOfFoot extends AppCompatActivity {

    ShoeCalculator shoeCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronation_of_foot);

        //Grabs the intent and grabs the shoe
        Intent intent = getIntent();
        shoeCalculator = intent.getParcelableExtra("radioChosen");
    }

    //Called when the user taps the button
    //Sets the shoes pronation to a number in the 1000s place
    //Moves to the next page (results page)

    public void onRadioPronation(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.neutralPronation:
                if (checked) {
                    shoeCalculator.setPronation(1000);
                }
                break;
            case R.id.overPronation:
                if (checked) {
                    shoeCalculator.setPronation(2000);
                }
                break;
            case R.id.underPronation:
                if (checked) {
                    shoeCalculator.setPronation(3000);
                }
                break;
        }

        Intent intent = new Intent(this, ResultsPage.class);
        shoeCalculator.createSum();
        intent.putExtra("radioChosen", shoeCalculator);
        startActivity(intent);
    }
}