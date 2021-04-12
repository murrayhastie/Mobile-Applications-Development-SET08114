package com.example.lab_01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Activity0 extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_0);

        ListView attractionDetails = (ListView) findViewById (R.id.attraction_list);
        
        Toast.makeText(getBaseContext(), "In Activity 0", Toast.LENGTH_LONG).show();
        //Navigation back is via phones back button
        
        final String[] attractionDetailsArray = new String[] {"1", "2", "3", "4", "5", "6"};
        
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                attractionDetailsArray);
        
        attractionDetails.setAdapter(adapter);
        String stringToReturn = "Message received from Activity0";
        Intent returnIntent = new Intent();
        returnIntent.putExtra("Hello, this is Activity0 speaking.", stringToReturn);
        setResult(1, returnIntent);
        // finish();
        // if you un-comment the line above,
        // the activity will close automatically.


    }
}