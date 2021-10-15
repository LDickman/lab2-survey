package com.zybooks.lab2_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionsActivity extends AppCompatActivity {

    //private surveyCalculations score;
    private RadioGroup SinRadioGroup;
    public surveyCalculations calc_pride = new surveyCalculations(0, surveyCalculations.SinLevel.PRIDE);
    public surveyCalculations calc_sloth = new surveyCalculations(0, surveyCalculations.SinLevel.SLOTH);
    public surveyCalculations calc_gluttony = new surveyCalculations(0, surveyCalculations.SinLevel.GLUTTONY);
    public surveyCalculations calc_greed = new surveyCalculations(0, surveyCalculations.SinLevel.GREED);
    public surveyCalculations calc_lust = new surveyCalculations(0, surveyCalculations.SinLevel.LUST);
    public surveyCalculations calc_wrath = new surveyCalculations(0, surveyCalculations.SinLevel.WRATH);
    public surveyCalculations calc_envy = new surveyCalculations(0, surveyCalculations.SinLevel.ENVY);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        SinRadioGroup = findViewById(R.id.sin_radio_group);
    }

    public void onRadioButtonClicked(View view) {
        surveyCalculations.SinLevel sinLevel;
        // Which radio button was selected?
        switch (view.getId()) {
            case R.id.gluttony_radio_button:
                sinLevel = surveyCalculations.SinLevel.GLUTTONY;
                calc_gluttony.addPointsToSin(3, sinLevel);
                surveyCalculations.setAnswer_for_1("Gluttony");
                break;
            case R.id.pride_radio_button:
                sinLevel = surveyCalculations.SinLevel.PRIDE;
                calc_pride.addPointsToSin(3, sinLevel);
                surveyCalculations.setAnswer_for_1("Pride");
                break;
            case R.id.lust_radio_button:
                sinLevel = surveyCalculations.SinLevel.LUST;
                calc_lust.addPointsToSin(3, sinLevel);
                surveyCalculations.setAnswer_for_1("Lust");
                break;
            case R.id.envy_radio_button:
                sinLevel = surveyCalculations.SinLevel.ENVY;
                calc_envy.addPointsToSin(3, sinLevel);
                surveyCalculations.setAnswer_for_1("Envy");
                break;
            case R.id.sloth_radio_button:
                sinLevel = surveyCalculations.SinLevel.SLOTH;
                calc_sloth.addPointsToSin(3, sinLevel);
                surveyCalculations.setAnswer_for_1("Sloth");
                break;
            case R.id.wrath_radio_button:
                sinLevel = surveyCalculations.SinLevel.WRATH;
                calc_wrath.addPointsToSin(3, sinLevel);
                surveyCalculations.setAnswer_for_1("Wrath");
                break;
            case R.id.greed_radio_button:
                sinLevel = surveyCalculations.SinLevel.GREED;
                calc_greed.addPointsToSin(3, sinLevel);
                surveyCalculations.setAnswer_for_1("Greed");
                break;
        }
    }

    public void onNextClick(View view) {
        Intent intent = new Intent(this, RatingActivity.class);
        startActivity(intent);
    }
}