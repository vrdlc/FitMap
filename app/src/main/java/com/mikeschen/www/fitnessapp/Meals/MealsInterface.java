package com.mikeschen.www.fitnessapp.Meals;

import com.mikeschen.www.fitnessapp.models.Calories;

import java.util.ArrayList;

/**
 * Created by alexnenchev on 6/21/16.
 */
public interface MealsInterface {

    interface View {
        void showFoodItem(String foodItem);
        void saveFoodItem(String foodItem);
        void showCalories(Calories calories);
        void refresh();
        void displayFoodByUPC(ArrayList<Food> foods);
        void displayFoodByItem(ArrayList<Food> foods);
//        void saveCalories(Integer calories);
    }

    interface Presenter {
//        void loadCalories();
        void loadFoodItem();
        void searchFoods(String foodItem);
        void searchUPC(String upc);
        void scanUpc();
    }
}
