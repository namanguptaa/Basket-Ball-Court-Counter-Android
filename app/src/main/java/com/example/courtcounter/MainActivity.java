package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int  scoreCountTeamA=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(8);
    }
    /**
     * Displays the given score of Team A
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    // to offer team A 3-Points
    public void addThreeForTeamA(View view)
    {   scoreCountTeamA= scoreCountTeamA + 3;
        displayForTeamA(scoreCountTeamA);
    }
    // giving Team A 2-Points
    public void addTwoForTeamA(View view)
    {   scoreCountTeamA = scoreCountTeamA + 2;
        displayForTeamA(scoreCountTeamA);
    }
    // giving Team A a Free Throw point
    public void addOneForTeamA(View view)
    {   scoreCountTeamA = scoreCountTeamA + 1;
        displayForTeamA(scoreCountTeamA);
    }

}