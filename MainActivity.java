package com.example.dykbts;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttoncreatorinfo,buttonrater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttoncreatorinfo=(Button) findViewById(R.id.button4);
        buttonrater=(Button) findViewById(R.id.button5);
    }

    public void creatorinfofunc(View v) {
        Toast.makeText(getApplicationContext(), "Created by Nikita Negi (nikitanegi765@gmail.com)", Toast.LENGTH_SHORT).show();
    }
    public void raterfunc(View v)
    {
        RatingBar rater=(RatingBar)findViewById(R.id.ratingBar);
        float rating=rater.getRating();
        buttonrater.setText("Your Rating= "+rating+" stars.");
        buttonrater.setClickable(false);
    }
    public void gotofirstoption(View v)
    {
        Intent gotofirstpage=new Intent();
        gotofirstpage.setClass(this,Option1.class);
        startActivity(gotofirstpage);
    }
    public void gotosecondoption(View v)
    {
        Intent gotosecondpage=new Intent();
        gotosecondpage.setClass(this,Option2.class);
        startActivity(gotosecondpage);
    }
    public void gotothirdoption(View v)
    {
        Intent gotothirdpage=new Intent();
        gotothirdpage.setClass(this,Option3.class);
        startActivity(gotothirdpage);
    }


}
