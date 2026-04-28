package no3.util;

import java.util.ArrayList;

public class DataManager<T> {

    private ArrayList<T> data = new ArrayList<>();

    public void addData(T d) {
        data.add(d);
    }

    public void showData() {
        for (T d : data) {
            System.out.println(d);
        }
    }
}