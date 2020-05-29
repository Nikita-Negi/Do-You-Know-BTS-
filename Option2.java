package com.example.dykbts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class Option2 extends AppCompatActivity {

    MediaPlayer btsddaeng,btsdimple,btseuphoria,btshome,btsmicdrop,btsmytime,btssingularity,btstrivialove,btsugh,btsuhgood;
    ImageButton ddaeng,dimple,euphoria,home,micdrop,mytime,singularity,trivialove,ugh,uhgood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option2);
        btsddaeng=MediaPlayer.create(this,R.raw.ddaeng);
        btsdimple=MediaPlayer.create(this,R.raw.dimple);
        btseuphoria=MediaPlayer.create(this,R.raw.euphoria);
        btshome=MediaPlayer.create(this,R.raw.home);
        btsmicdrop=MediaPlayer.create(this,R.raw.micdrop);
        btsmytime=MediaPlayer.create(this,R.raw.mytime);
        btssingularity=MediaPlayer.create(this,R.raw.singularity);
        btstrivialove=MediaPlayer.create(this,R.raw.trivialove);
        btsugh=MediaPlayer.create(this,R.raw.ugh);
        btsuhgood=MediaPlayer.create(this,R.raw.uhgood);
        ddaeng=(ImageButton)findViewById(R.id.imageButton);
        dimple=(ImageButton)findViewById(R.id.imageButton21);
        euphoria=(ImageButton)findViewById(R.id.imageButton23);
        home=(ImageButton)findViewById(R.id.imageButton25);
        micdrop=(ImageButton)findViewById(R.id.imageButton27);
        mytime=(ImageButton)findViewById(R.id.imageButton29);
        singularity=(ImageButton)findViewById(R.id.imageButton31);
        trivialove=(ImageButton)findViewById(R.id.imageButton33);
        ugh=(ImageButton)findViewById(R.id.imageButton35);
        uhgood=(ImageButton)findViewById(R.id.imageButton37);
    }
    public void playmusicddaeng(View v)
    {btsddaeng.start(); ddaeng.setBackgroundColor(Color.parseColor("#7FFF00"));}
    public void pausemusicddaeng(View v)
    {btsddaeng.pause();ddaeng.setBackgroundColor(Color.parseColor("#00FFFFFF"));}

    public void playmusicdimple(View v)
    {btsdimple.start();dimple.setBackgroundColor(Color.parseColor("#7FFF00"));}
    public void pausemusicdimple(View v)
    {btsdimple.pause();dimple.setBackgroundColor(Color.parseColor("#00FFFFFF"));}

    public void playmusiceuphoria(View v)
    {btseuphoria.start();euphoria.setBackgroundColor(Color.parseColor("#7FFF00"));}
    public void pausemusiceuphoria(View v)
    {btseuphoria.pause();euphoria.setBackgroundColor(Color.parseColor("#00FFFFFF"));}

    public void playmusichome(View v)
    {btshome.start();home.setBackgroundColor(Color.parseColor("#7FFF00"));}
    public void pausemusichome(View v)
    {btshome.pause();home.setBackgroundColor(Color.parseColor("#00FFFFFF"));}

    public void playmusicmicdrop(View v)
    {btsmicdrop.start();micdrop.setBackgroundColor(Color.parseColor("#7FFF00"));}
    public void pausemusicmicdrop(View v)
    {btsmicdrop.pause();micdrop.setBackgroundColor(Color.parseColor("#00FFFFFF"));}

    public void playmusicmytime(View v)
    {btsmytime.start();mytime.setBackgroundColor(Color.parseColor("#7FFF00"));}
    public void pausemusicmytime(View v)
    {btsmytime.pause();mytime.setBackgroundColor(Color.parseColor("#00FFFFFF"));}

    public void playmusicsingularity(View v)
    {btssingularity.start();singularity.setBackgroundColor(Color.parseColor("#7FFF00"));}
    public void pausemusicsingularity(View v)
    {btssingularity.pause();singularity.setBackgroundColor(Color.parseColor("#00FFFFFF"));}

    public void playmusictrivialove(View v)
    {btstrivialove.start();trivialove.setBackgroundColor(Color.parseColor("#7FFF00"));}
    public void pausemusictrivialove(View v)
    {btstrivialove.pause();trivialove.setBackgroundColor(Color.parseColor("#00FFFFFF"));}

    public void playmusicugh(View v)
    {btsugh.start();ugh.setBackgroundColor(Color.parseColor("#7FFF00"));}
    public void pausemusicugh(View v)
    {btsugh.pause();ugh.setBackgroundColor(Color.parseColor("#00FFFFFF"));}

    public void playmusicuhgood(View v)
    {btsuhgood.start();uhgood.setBackgroundColor(Color.parseColor("#7FFF00"));}
    public void pausemusicuhgood(View v)
    {btsuhgood.pause();uhgood.setBackgroundColor(Color.parseColor("#00FFFFFF"));}
}
