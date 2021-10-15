package com.zybooks.lab2_survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    Button manageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = findViewById(R.id.submit_name);
        String user_Name = userName.getHint().toString();
        surveyCalculations.setUser_Name(user_Name);
    }

    public void onStartClick(View view) {
//        Intent intent = new Intent(this, QuestionsActivity.class);
//        startActivity(intent);
        Intent intent = new Intent(this, QuestionsActivity.class);
        startActivity(intent);
    }

    public void onSubmitClick(View view) {
        manageButton = findViewById(R.id.submit_button);
        manageButton.setOnClickListener(view1 ->{
            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            startActivity(intent);
        });
    }
}