package com.example.seniorproject20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class LocationOfRun extends AppCompatActivity {

    Shoe shoe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_of_run);

        //Grabs the intent and grabs the shoe
        Intent intent = getIntent();
        shoe = intent.getParcelableExtra("radioChosen");
    }

    //Called when the user taps the button
    //Sets the shoes location of run to a number in the 10s place
    //Moves to the next page (stability)
    public void onRadioLocation(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.roads:
                if (checked) {
                    shoe.setLocation(10);
                }
                break;
            case R.id.trail:
                if (checked) {
                    shoe.setLocation(20);
                }
                break;
        }
        Intent intent = new Intent(this, StabilityOfShoe.class);
        intent.putExtra("radioChosen", shoe);
        startActivity(intent);
    }
}