package com.example.lab_01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Activity1 extends Activity
{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Toast.makeText(getBaseContext(), "In Activity 1", Toast.LENGTH_LONG).show();
        //Navigation back is via phones back button

        String stringToReturn = "Edinburgh Napier University";
        Intent returnIntent = new Intent();
        returnIntent.putExtra("String", stringToReturn);
        setResult(1, returnIntent);
        // finish();
        // if you un-comment the line above,
        // the activity will close automatically.


    }
}