package com.globussoft.readydoctors.patient.psychology_static_views;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.globussoft.readydoctors.patient.R;

/**
 * Created by GLB-276 on 10/15/2015.
 */
public class IntroductionPsychology extends Activity
{
    ImageView backImage;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction_psychology);
        backImage=(ImageView)findViewById(R.id.backImage);
        backImage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(),MeetThePsychologists.class);
        startActivity(intent);
        IntroductionPsychology.this.finish();
    }
}
