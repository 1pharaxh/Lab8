package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import android.util.Log;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    public CustomList mocklist;
    @Test
    public void add(){
        mocklist =  new CustomList(null, new ArrayList<City>());
        City city = new City("Toronto", "Ontario");
        mocklist.addCity(city);
        assertEquals(1, mocklist.getCount());
    }

    @Test
    public void has() {
        mocklist =  new CustomList(null, new ArrayList<City>());
        City city = new City("Toronto", "Ontario");
        mocklist.addCity(city);
        assertEquals(true, mocklist.hasCity(city));
    }



}
