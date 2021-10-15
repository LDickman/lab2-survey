package com.zybooks.lab2_survey;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ResultActivity extends AppCompatActivity {

    private TextView answer1TextView;
    private TextView answer2TextView;
    private TextView answer3TextView;
    private TextView answer4TextView;
    private TextView reportTextView;
    private TextView UserResult;
    //ImageView wrathImage = (ImageView)findViewById(R.id.avatar_wrath);
//    private ImageView lustImage = (ImageView)findViewById(R.id.avatar_lust);
//    private ImageView prideImage = (ImageView)findViewById(R.id.avatar_pride);
//    private ImageView slothImage = (ImageView)findViewById(R.id.avatar_sloth);
//    private ImageView envyImage = (ImageView)findViewById(R.id.avatar_envy);
//    private ImageView greedImage = (ImageView)findViewById(R.id.avatar_greed);
//    private ImageView gluttonyImage = (ImageView)findViewById(R.id.avatar_gluttony);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        getSupportActionBar().setTitle("Report");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        answer1TextView = findViewById(R.id.anwser_1);
        answer2TextView = findViewById(R.id.anwser_2);
        answer3TextView = findViewById(R.id.anwser_3);
        answer4TextView = findViewById(R.id.anwser_4);
        reportTextView = findViewById(R.id.report);
        UserResult = findViewById(R.id.user_name);

        UserResult.setText(surveyCalculations.getUser_Name());
        answer1TextView.setText(surveyCalculations.getAnswer_for_1());
        answer2TextView.setText(surveyCalculations.getAnswer_for_2());
        answer3TextView.setText(surveyCalculations.getAnswer_for_3());
        answer4TextView.setText(surveyCalculations.getAnswer_for_4());
        surveyCalculations.calculateResults();
        reportTextView.setText("The Avatar of "+ surveyCalculations.getName() + " with "+ surveyCalculations.getResultPoints() + " points");
        //wrathImage.setVisibility(View.VISIBLE);
        //showImage();
    }

//    public void showImage() {
//        String name = surveyCalculations.getName();
//        switch (name) {
////            case "Lust":
////                lustImage.setVisibility(View.VISIBLE);
////                wrathImage.setVisibility(View.GONE);
////                slothImage.setVisibility(View.GONE);
////                greedImage.setVisibility(View.GONE);
////                prideImage.setVisibility(View.GONE);
////                envyImage.setVisibility(View.GONE);
////                gluttonyImage.setVisibility(View.GONE);
////                break;
////            case "Envy":
////                envyImage.setVisibility(View.VISIBLE);
////                wrathImage.setVisibility(View.GONE);
////                slothImage.setVisibility(View.GONE);
////                greedImage.setVisibility(View.GONE);
////                prideImage.setVisibility(View.GONE);
////                gluttonyImage.setVisibility(View.GONE);
////                lustImage.setVisibility(View.GONE);
////
////                break;
////            case "Pride":
////                prideImage.setVisibility(View.VISIBLE);
////                wrathImage.setVisibility(View.GONE);
////                slothImage.setVisibility(View.GONE);
////                greedImage.setVisibility(View.GONE);
////                envyImage.setVisibility(View.GONE);
////                gluttonyImage.setVisibility(View.GONE);
////                lustImage.setVisibility(View.GONE);
////
////                break;
////            case "Gluttony":
////                gluttonyImage.setVisibility(View.VISIBLE);
////                wrathImage.setVisibility(View.GONE);
////                slothImage.setVisibility(View.GONE);
////                greedImage.setVisibility(View.GONE);
////                prideImage.setVisibility(View.GONE);
////                envyImage.setVisibility(View.GONE);
////                lustImage.setVisibility(View.GONE);
////
////                break;
//            case "Wrath":
//                wrathImage.setVisibility(View.VISIBLE);
////                slothImage.setVisibility(View.GONE);
////                greedImage.setVisibility(View.GONE);
////                prideImage.setVisibility(View.GONE);
////                envyImage.setVisibility(View.GONE);
////                gluttonyImage.setVisibility(View.GONE);
////                lustImage.setVisibility(View.GONE);
//                break;
////            case "Sloth":
////                slothImage.setVisibility(View.VISIBLE);
////                greedImage.setVisibility(View.GONE);
////                prideImage.setVisibility(View.GONE);
////                envyImage.setVisibility(View.GONE);
////                gluttonyImage.setVisibility(View.GONE);
////                lustImage.setVisibility(View.GONE);
////                wrathImage.setVisibility(View.GONE);
////
////                break;
////            case "Greed":
////                greedImage.setVisibility(View.VISIBLE);
////                slothImage.setVisibility(View.GONE);
////                prideImage.setVisibility(View.GONE);
////                envyImage.setVisibility(View.GONE);
////                gluttonyImage.setVisibility(View.GONE);
////                lustImage.setVisibility(View.GONE);
////                wrathImage.setVisibility(View.GONE);
////                break;
//        }
//    }
}