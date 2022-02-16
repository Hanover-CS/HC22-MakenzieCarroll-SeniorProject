package com.example.seniorproject20;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

//Users specification of the shoes width fit and its generated number
public class WidthActivity extends AppCompatActivity {

    //public ShoeCalculator shoeCalculator = new ShoeCalculator();
    private int widthValue;
    private RadioGroup radioGroup;
    private static final String TAG = "WidthActivity";
    private static final int REG_WIDTH = 1;
    private static final int WIDE_WIDTH = 2;
    private static final int NARROW_WIDTH = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_width_fit);
        radioGroup = findViewById(R.id.widthGroup);

        //Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(StartActivity.EXTRA_MESSAGE);

    }

    //Called when the user taps the button
    //Sets the shoes width to a number in the 1s place
    //Moves to the next page (location)
    public void onRadioWidthClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.regularWidth:
                if (checked) {
                    widthValue = REG_WIDTH;
                }
                break;
            case R.id.wideWidth:
                if (checked) {
                    widthValue = WIDE_WIDTH;
                }
                break;
            case R.id.narrowWidth:
                if (checked) {
                    widthValue = NARROW_WIDTH;
                }
                break;
        }

        Log.d(TAG, String.valueOf(widthValue));
        Intent intent = new Intent(this, LocationActivity.class);
        intent.putExtra("curTotal", widthValue);
        startActivity(intent);
    }
}