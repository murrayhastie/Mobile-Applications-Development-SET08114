package com.example.lab_01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton rb0 = (RadioButton) findViewById(R.id.radioButton0);
        rb0.setOnClickListener(radioGroupClick);

        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1);
        rb1.setOnClickListener(radioGroupClick);

        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb2.setOnClickListener(radioGroupClick);


    }

    private View.OnClickListener radioGroupClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            RadioButton rb = (RadioButton) v;
            ImageView iv = (ImageView) findViewById(R.id.imageView);

            if (rb.getText().equals("Option 1"))
            {
                iv.setImageResource(R.mipmap.hopewell_rocks);
            }
            else if (rb.getText().equals("Option 2"))
            {
                iv.setImageResource(R.mipmap.niagara_falls);
            }
            else if (rb.getText().equals("Option 3"))
            {
                iv.setImageResource(R.mipmap.parliament_hill);
            }
        }
    };
}