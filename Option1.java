package com.example.dykbts;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class Option1 extends AppCompatActivity {

    EditText info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option1);
        info=(EditText)findViewById(R.id.editText);
    }
    public void gotov(View v)
    {
        info.setText("V (뷔): V is the second youngest member of BTS and is a vocalist (he is a bass - lowest male vocal range). He was born on 30th December 1995 with the name of Kim Taehyung (김태형). He also made his acting debut in 2016 in the historical K-Drama 'Hwarang'. His character's name is Han Sung. He has a bubbly nature with multi-dimensional artistic capabilities.");
    }
    public void gotohs(View v)
    {
        info.setText("J-hope (제이흡): J-hope is the third oldest member of BTS and is the main dancer & a rapper. He was born on 18th February 1994 with the name of Jung Hoseok (정호석). Although he had no background in rapping or music production, he has developed his own groovy style of rapping demonstarted in his mixtape 'Hopeworld'. He is the dance leader and also participates in choreography.");
    }
    public void gotopjm(View v) {
        info.setText("Jimin (지민): Jimin is the third youngest member of BTS and he is the lead vocalist. He was born on 13th October 1995 with the name of Park Jimin (박지민). Jimin is classically trained in ballet and is a star performer on stage. He has the voice and personality of an angel. He is often compared to mochi for his soft and cute persona.");
    }
    public void gotojin(View v) {
        info.setText("Jin (진): Jin is the oldest (jangnam) member of BTS and is a vocalist & visual. He was born on 4th December 1992 with the name of Kim Seokjin (김석진). Jin had no ambition of being an idol, but was scouted for his goodlooks. He started his training from scratch and now he can dance and sing like a pro. He cooks and cracks dad jokes, sometimes both at the same time.");
    }
    public void gotojk(View v) {
        info.setText("Jungkook (정국): Jungkook is the youngest (maknae) member of BTS and he is the main vocalist. He was born on 1st September 1997 with the name of Jeon Jungkook (전정국). Jungkook is often called the golden maknae because he can do anything, be it singing, dancing, rapping, painting, sports, cooking, you name it. Since he is the youngest, he looks up to all the memebers who dote on him.");
    }
    public void gotorm(View v) {
        info.setText("RM (램몬스터): RM is the fourth oldest member of BTS and is the main rapper (playlist 'Mono') & leader. Being the leader basically means he is the face of the group/ambassador, who does most of the speeches and takes care of the group. He was born on 12th September 1994 with the name of Kim Namjoon (김남준). He is proficient in English, has an IQ of 148, loves nature and art. ");
    }
    public void gotosg(View v) {
        info.setText("Suga (슈가): Suga is the second oldest member of BTS and is a rapper.He was born on 9th March 1993 with the name of Min Yoongi (민윤기).He also made his own rap-centric mixtape under the name of 'AgustD'. He chose this name because it is 'Suga DT' spelt backwards. DT stands for Daegu Town, which is where he is from. Suga loves producing songs and is a total goofball, earning the name 'lil meow meow'.");
    }
}
