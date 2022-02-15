package com.example.seniorproject20;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class WidthFit extends AppCompatActivity {

    public Shoe shoe = new Shoe();
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_width_fit);
        radioGroup = findViewById(R.id.widthGroup);

        //Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(StartPage.EXTRA_MESSAGE);

    }

    //Called when the user taps the button
    //Sets the shoes width to a number in the 1s place
    //Moves to the next page (location)
    public void onRadioWidthClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.regularWidth:
                if (checked) {
                    shoe.setWidth(1);
                }
                break;
            case R.id.wideWidth:
                if (checked) {
                    shoe.setWidth(2);
                }
                break;
            case R.id.narrowWidth:
                if (checked) {
                    shoe.setWidth(3);
                }
                break;
        }

        Intent intent = new Intent(this, LocationOfRun.class);
        intent.putExtra("radioChosen", shoe);
        startActivity(intent);
    }
}