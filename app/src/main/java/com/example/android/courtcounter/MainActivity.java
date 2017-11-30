package com.example.android.courtcounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int pointsA = 0;
    int pointsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void addThreeA(View view)
    {
        pointsA += 3;
        displayTeamAScore(pointsA);
    }

    public void addTwoA(View view)
    {
        pointsA += 2;
        displayTeamAScore(pointsA);
    }

    public void addOneA(View view)
    {
        pointsA++;
        displayTeamAScore(pointsA);
    }

    public void displayTeamAScore(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeB(View view)
    {
        pointsB += 3;
        displayTeamBScore(pointsB);
    }

    public void addTwoB(View view)
    {
        pointsB += 2;
        displayTeamBScore(pointsB);
    }

    public void addOneB(View view) {
        pointsB++;
        displayTeamBScore(pointsB);
    }

    public void displayTeamBScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view)
    {
        pointsA = 0;
        pointsB = 0;
        displayTeamAScore(pointsA);
        displayTeamBScore(pointsB);
    }
}
