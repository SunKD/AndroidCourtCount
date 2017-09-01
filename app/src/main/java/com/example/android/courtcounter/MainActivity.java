package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView2 = (TextView) findViewById(R.id.team_b_score);
        scoreView2.setText(String.valueOf(score));
    }

    public void add3PointsA(View v){
        scoreA+=3;
        displayForTeamA(scoreA);
    }

    public void add2PointsA(View v){
        scoreA+=2;
        displayForTeamA(scoreA);
    }

    public void freeThrowA(View v){
        scoreA+=1;
        displayForTeamA(scoreA);
    }

    public void add3PointsB(View v){
        scoreB+=3;
        displayForTeamB(scoreB);
    }

    public void add2PointsB(View v){
        scoreB+=2;
        displayForTeamB(scoreB);
    }

    public void freeThrowB(View v){
        scoreB+=1;
        displayForTeamB(scoreB);
    }

    public void reset(View v){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
