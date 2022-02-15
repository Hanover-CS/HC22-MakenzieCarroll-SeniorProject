package com.example.seniorproject20;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class StartPage extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.seniorproject20.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
    }
    //Called when user taps the Send button
    public void startButton(View view) {
        Intent intent = new Intent(this, WidthFit.class);
        startActivity(intent);
    }
}