package com.mikeschen.www.fitnessapp;

/**
 * Created by Ramon on 6/10/16.
 */
public interface MapInterface {

    interface View {
        void updatePermissionStatus(boolean permissionStatus);
        void showMap();
    }

    interface Presenter {
        void loadMap();
    }
}