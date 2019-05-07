package com.example.ashleyshorter.carwashapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double exteriorDiscount = 8.99;
    double exteriorNoDiscount = 10.99;
    double exteriorVacuumDiscount = 12.99;
    double exteriorVacuumNoDiscount = 15.99;
    int numberWashes;
    double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  final EditText numWashes = (EditText) findViewById(R.id.editText);
       // final RadioButton exterior = (RadioButton) findViewById(R.id.radioButton);
        final RadioButton exteriorVacuum = (RadioButton) findViewById(R.id.radioButton2);
        //final TextView message = (TextView) findViewById(R.id.textView3);
        Button calculate = (Button) findViewById(R.id.button);
/*
        calculate.setonClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(exterior.isChecked()) {
                    if( numberWashes >= 12) {
                        total = numberWashes * exteriorDiscount;
                        message.setText("$" + total + " for " + numberWashes + " washes");
                    }
                    else {
                        Toast.makeText(MainActivity.this, "You must purchaes 12 washes in order to receive a discount", Toast.LENGTH_SHORT).show();
                        total = numberWashes * exteriorNoDiscount;
                        message.setText("$" + total + " for " + numberWashes + " washes");
                    }
                }
                else {
                    if(exteriorVacuum.isChecked()) {
                        if( numberWashes >= 12) {
                            total = numberWashes * exteriorVacuumDiscount;
                            message.setText("$" + total + " for " + numberWashes + " washes");
                        }
                        else {
                            total = numberWashes * exteriorVacuumNoDiscount;
                            message.setText("$" + total + " for " + numberWashes + " washes");
                        }
                    }
                }
            }
        );
*/
    }
}

