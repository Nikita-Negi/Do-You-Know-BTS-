package com.example.dykbts;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Option3 extends AppCompatActivity
{
    RadioGroup rg1,rg2,rg3;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option3);
        rg1=(RadioGroup)findViewById(R.id.rg1);
        rg2=(RadioGroup)findViewById(R.id.rg2);
        rg3=(RadioGroup)findViewById(R.id.rg3);
        submit=(Button)findViewById(R.id.button);
    }
    public void getscore(View v)
    {
        /*rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if(checkedId==R.id.radioButton4)
                    score=score+1;
            }
        });
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if(checkedId==R.id.radioButton3)
                    score=score+1;
            }
        });
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if(checkedId==R.id.radioButton7) {
                    score = score + 1;
                    Toast.makeText(getApplicationContext(), "Created by Nikita Negi (nikitanegi765@gmail.com)", Toast.LENGTH_SHORT).show();

                }
            }
        });*/
        int score=0;
        if(rg1.getCheckedRadioButtonId()==R.id.radioButton4)
            score=score+1;
        if(rg2.getCheckedRadioButtonId()==R.id.radioButton3)
            score=score+1;
        if(rg3.getCheckedRadioButtonId()==R.id.radioButton7)
            score=score+1;
        submit.setText("Your Score= "+score+"/3");
        submit.setClickable(false);

    }
}
