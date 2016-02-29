package com.globussoft.readydoctors.patient.psychological_exercises;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.globussoft.readydoctors.patient.R;
import com.globussoft.readydoctors.patient.Utills.AppData;
import com.globussoft.readydoctors.patient.psychological.PsychologyData;
import com.globussoft.readydoctors.patient.model.ExerciseModel;

public class Exercise1F extends Activity 
{
	RelativeLayout ans1,ans2,ans3,ans4;
	TextView header,question;
	ImageView backImage;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.psychology_exercise_1a);
		InitUI();
	}

	private void InitUI()
	{

		backImage=(ImageView)findViewById(R.id.backImage);
		backImage.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				onBackPressed();
			}
		});
		header=(TextView)findViewById(R.id.edittext);
		header.setText("EXERSISE 1F");
		question=(TextView)findViewById(R.id.question);
		question.setText(AppData.exercise_1f);
		
		ans1=(RelativeLayout)findViewById(R.id.q1_Rlt);
		ans2=(RelativeLayout)findViewById(R.id.q2_Rlt);
		ans3=(RelativeLayout)findViewById(R.id.q3_Rlt);
		ans4=(RelativeLayout)findViewById(R.id.q4_Rlt);
		ans1.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v) 
			{
				PsychologyData.exercise_1f="Not at all";
				ExerciseModel model=new ExerciseModel();
				model.setQuestion("6");
				model.setAnswer("1");
				PsychologyData.exerciseListType1.add(model);
				Intent intent = new Intent(getApplicationContext(),Exercise1G.class);
				startActivity(intent);
			}
		});
		
		ans2.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v) 
			{
				PsychologyData.exercise_1f="Several days";
				ExerciseModel model=new ExerciseModel();
				model.setQuestion("6");
				model.setAnswer("2");
				PsychologyData.exerciseListType1.add(model);
				Intent intent = new Intent(getApplicationContext(),Exercise1G.class);
				startActivity(intent);
			}
		});
		
		ans3.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v) 
			{
				PsychologyData.exercise_1f="More than half the day";
				ExerciseModel model=new ExerciseModel();
				model.setQuestion("6");
				model.setAnswer("3");
				PsychologyData.exerciseListType1.add(model);
				Intent intent = new Intent(getApplicationContext(),Exercise1G.class);
				startActivity(intent);
			}
		});
		
		ans4.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v) 
			{
				PsychologyData.exercise_1f="Nearly everyday";
				ExerciseModel model=new ExerciseModel();
				model.setQuestion("6");
				model.setAnswer("4");
				PsychologyData.exerciseListType1.add(model);
				Intent intent = new Intent(getApplicationContext(),Exercise1G.class);
				startActivity(intent);
			}
		});
		
	}
}
