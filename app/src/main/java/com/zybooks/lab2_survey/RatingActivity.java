package com.zybooks.lab2_survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RatingActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private surveyCalculations calc_envy = new surveyCalculations(surveyCalculations.getEnvyPoints(), surveyCalculations.SinLevel.ENVY);
    private surveyCalculations calc_pride = new surveyCalculations(surveyCalculations.getPridePoints(), surveyCalculations.SinLevel.PRIDE);
    private surveyCalculations calc_sloth = new surveyCalculations(surveyCalculations.getSlothPoints(), surveyCalculations.SinLevel.SLOTH);
    private surveyCalculations calc_gluttony = new surveyCalculations(surveyCalculations.getGluttonyPoints(), surveyCalculations.SinLevel.GLUTTONY);
    private surveyCalculations calc_greed = new surveyCalculations(surveyCalculations.getGreedPoints(), surveyCalculations.SinLevel.GREED);
    private surveyCalculations calc_lust = new surveyCalculations(surveyCalculations.getLustPoints(), surveyCalculations.SinLevel.LUST);
    private surveyCalculations calc_wrath = new surveyCalculations(surveyCalculations.getWrathPoints(), surveyCalculations.SinLevel.WRATH);
    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        spinner1 = findViewById(R.id.spinner_question_1);
        spinner2 = findViewById(R.id.spinner_question_2);
        spinner3 = findViewById(R.id.spinner_question_3);


        if (spinner1 != null) {
            spinner1.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.number_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if (spinner1 != null) {
            spinner1.setAdapter(adapter);
        }

        if (spinner2 != null) {
            spinner2.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.number_array, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if (spinner2 != null) {
            spinner2.setAdapter(adapter2);
        }

        if (spinner3 != null) {
            spinner3.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.number_array, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if (spinner3 != null) {
            spinner3.setAdapter(adapter3);
        }
    }

    public void onSubmitClick(View view) {
        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        String spinner = (String) parent.getItemAtPosition(position);
        calPoints_Question1(position);
        calPoints_Question2(position);
        calPoints_Question3(position);
    }


    private void calPoints_Question1(int position) {
        if (position == 0) {
            calc_envy.addPointsToSin(2, surveyCalculations.SinLevel.ENVY);
            calc_sloth.addPointsToSin(3, surveyCalculations.SinLevel.SLOTH);
            surveyCalculations.setAnswer_for_2(spinner1.getSelectedItem().toString());
        } else if (position == 1) {
            calc_wrath.addPointsToSin(2, surveyCalculations.SinLevel.WRATH);
            surveyCalculations.setAnswer_for_2(spinner1.getSelectedItem().toString());
        } else if (position == 2) {
            calc_lust.addPointsToSin(2, surveyCalculations.SinLevel.LUST);
            surveyCalculations.setAnswer_for_2(spinner1.getSelectedItem().toString());
        } else if (position == 3) {
            calc_greed.addPointsToSin(2, surveyCalculations.SinLevel.GREED);
            surveyCalculations.setAnswer_for_2(spinner1.getSelectedItem().toString());
        } else if (position == 4) {
            calc_pride.addPointsToSin(2, surveyCalculations.SinLevel.PRIDE);
            surveyCalculations.setAnswer_for_2(spinner1.getSelectedItem().toString());
        } else if (position == 5) {
            calc_gluttony.addPointsToSin(2, surveyCalculations.SinLevel.GLUTTONY);
            surveyCalculations.setAnswer_for_2(spinner1.getSelectedItem().toString());
        }
    }

    private void calPoints_Question2(int position) {
        if (position == 0) {
            calc_pride.addPointsToSin(3, surveyCalculations.SinLevel.PRIDE);
            surveyCalculations.setAnswer_for_3(spinner2.getSelectedItem().toString());
        } else if (position == 1) {
            calc_greed.addPointsToSin(2, surveyCalculations.SinLevel.GREED);
            surveyCalculations.setAnswer_for_3(spinner2.getSelectedItem().toString());
        } else if (position == 2) {
            calc_lust.addPointsToSin(2, surveyCalculations.SinLevel.LUST);
            surveyCalculations.setAnswer_for_3(spinner2.getSelectedItem().toString());
        } else if (position == 3) {
            calc_wrath.addPointsToSin(2, surveyCalculations.SinLevel.WRATH);
            surveyCalculations.setAnswer_for_3(spinner2.getSelectedItem().toString());
        } else if (position == 4) {
            calc_gluttony.addPointsToSin(2, surveyCalculations.SinLevel.GLUTTONY);
            surveyCalculations.setAnswer_for_3(spinner2.getSelectedItem().toString());
        } else if (position == 5) {
            calc_envy.addPointsToSin(2, surveyCalculations.SinLevel.ENVY);
            calc_sloth.addPointsToSin(3, surveyCalculations.SinLevel.SLOTH);
            surveyCalculations.setAnswer_for_3(spinner2.getSelectedItem().toString());
        }
    }

    private void calPoints_Question3(int position) {
        if (position == 0) {
            calc_sloth.addPointsToSin(3, surveyCalculations.SinLevel.SLOTH);
            surveyCalculations.setAnswer_for_4(spinner3.getSelectedItem().toString());
        } else if (position == 1) {
            calc_envy.addPointsToSin(2, surveyCalculations.SinLevel.ENVY);
            surveyCalculations.setAnswer_for_4(spinner3.getSelectedItem().toString());
        } else if (position == 2) {
            calc_gluttony.addPointsToSin(2, surveyCalculations.SinLevel.GLUTTONY);
            surveyCalculations.setAnswer_for_4(spinner3.getSelectedItem().toString());
        } else if (position == 3) {
            calc_wrath.addPointsToSin(2, surveyCalculations.SinLevel.WRATH);
            surveyCalculations.setAnswer_for_4(spinner3.getSelectedItem().toString());
        } else if (position == 4) {
            calc_greed.addPointsToSin(2, surveyCalculations.SinLevel.GREED);
            surveyCalculations.setAnswer_for_4(spinner3.getSelectedItem().toString());
        } else if (position == 5) {
            calc_lust.addPointsToSin(2, surveyCalculations.SinLevel.LUST);
            calc_pride.addPointsToSin(3, surveyCalculations.SinLevel.PRIDE);
            surveyCalculations.setAnswer_for_4(spinner3.getSelectedItem().toString());
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}