package com.example.lab_01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Date;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox cbox1 = (CheckBox) findViewById(R.id.check_option_1);
        cbox1.setOnClickListener(startListener);

        CheckBox cbox2 = (CheckBox) findViewById(R.id.check_option_2);
        cbox2.setOnClickListener(startListener);

        CheckBox cbox3 = (CheckBox) findViewById(R.id.check_option_3);
        cbox3.setOnClickListener(startListener);
    }

    private View.OnClickListener startListener = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            CheckBox cbox1 = (CheckBox) findViewById(R.id.check_option_1);
            if (cbox1.isChecked())
            {
                Toast.makeText(MainActivity.this, "Option 1", Toast.LENGTH_LONG).show();
            }
        }
    };
}