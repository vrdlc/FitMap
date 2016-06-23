package com.mikeschen.www.fitnessapp.Meals;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mikeschen.www.fitnessapp.Calories;
import com.mikeschen.www.fitnessapp.R;

import java.util.ArrayList;

import butterknife.Bind;

public class MealsSearchResultActivity extends AppCompatActivity implements MealsInterface.View {
    @Bind(R.id.foodItemRecyclerView)
    RecyclerView mFoodItemRecyclerView;
    private SearchListAdapter mAdapter;
    private Context mContext;
    public ArrayList<Food> mFoods = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals_search_result);
    }


    @Override
    public void showFoodItem(String foodItem) {

    }

    @Override
    public void saveFoodItem(String foodItem) {

    }

    @Override
    public void showCalories(Calories calories) {

    }

    @Override
    public void refresh() {

    }

    @Override
    public void displayFood(ArrayList<Food> foods) {

    }

    @Override
    public void displayFoodByItem(ArrayList<Food> foods) {
        MealsSearchResultActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mAdapter = new SearchListAdapter(getApplicationContext(), mFoods);
                mFoodItemRecyclerView.setAdapter(mAdapter);
                LinearLayoutManager layoutManager = new LinearLayoutManager(MealsSearchResultActivity.this);
                mFoodItemRecyclerView.setLayoutManager(layoutManager);
                Intent intent = new Intent(mContext, MealsSearchResultActivity.class);
                mContext.startActivity(intent);
            }
        });
    }

}
