package com.mikeschen.www.fitnessapp.simpleActivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mikeschen.www.fitnessapp.BaseActivity;
import com.mikeschen.www.fitnessapp.R;
import com.mikeschen.www.fitnessapp.maps.MapsActivity;
import com.mikeschen.www.fitnessapp.models.Days;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class RealStatsActivity extends BaseActivity implements View.OnClickListener {
    @Bind(R.id.suggestionButton) Button mSuggestionButton;
    @Bind(R.id.caloriesTextView) TextView mCaloriesTextView;
    @Bind(R.id.stepsTextView) TextView mStepsTextView;
    @Bind(R.id.dateTextView) TextView mDateTextView;
    @Bind(R.id.calsConsumedTextView) TextView mCalsConsumedTextView;
    private Days yesterday;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_stats);
        ButterKnife.bind(this);

        mSuggestionButton.setOnClickListener(this);

        //make a Day object
        List<Days> allDays = db.getAllDaysRecords();

        yesterday = allDays.get(allDays.size() - 2);
//        Calendar calendar = Calendar.getInstance();
//        SimpleDateFormat mdformat = new SimpleDateFormat("MM / dd / yyyy");
//        String strDate = mdformat.format(calendar.getTime());
//        mDateTextView.setText("Date: " + yesterday.getDate());
//
        mDateTextView.setText("Date: " + yesterday.getDate());

        mCaloriesTextView.setText("Cal Burned: " + yesterday.getCaloriesBurned());

        mStepsTextView.setText("Steps: " + yesterday.getStepsTaken());

        mCalsConsumedTextView.setText("Cals Consumed:" + yesterday.getCaloriesConsumed());
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.suggestionButton):
                Intent intent = new Intent(RealStatsActivity.this, MapsActivity.class);
                startActivity(intent);
                break;
        }
    }
}







