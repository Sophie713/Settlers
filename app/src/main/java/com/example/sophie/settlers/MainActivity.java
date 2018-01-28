package com.example.sophie.settlers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        displayForSophie(scoreA);
        displayForMarek(scoreB);
    }

    public void displayForSophie (int scoreA) {

        TextView scoreView = (TextView) findViewById(R.id.SophieScore);

        scoreView.setText(String.valueOf(scoreA));

    }
    public void displayForMarek (int scoreB) {

        TextView scoreView = (TextView) findViewById(R.id.MarekScore);

        scoreView.setText(String.valueOf(scoreB));

    }

    public void addOneSophie (View view) {
        scoreA = (scoreA + 1);
        displayForSophie(scoreA);
    }
    public void addTwoSophie (View view) {
        scoreA = (scoreA + 2);
        displayForSophie(scoreA);
    }
    public void minusOneSophie (View view) {
        if(scoreA>0){
        scoreA = (scoreA - 1);
        displayForSophie(scoreA);}
    }
    public void resetSophie (View view) {
        scoreA = (0);
        displayForSophie(scoreA);
    }

    public void addOneMarek (View view) {
        scoreB = (scoreB + 1);
        displayForMarek(scoreB);
    }
    public void addTwoMarek (View view) {
        scoreB = (scoreB + 2);
        displayForMarek(scoreB);
    }
    public void minusOneMarek (View view) {
        if(scoreB>0){
        scoreB = (scoreB - 1);
        displayForMarek(scoreB);}
    }
    public void resetMarek (View view) {
        scoreB = (0);
        displayForMarek(scoreB);
    }
}

