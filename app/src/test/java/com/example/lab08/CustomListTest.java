package com.example.lab08;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity(){
        // This will fail initially because deleteCity() doesn't exist
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
        //delete test
        list.deleteCity(calgary);
        // This will fail initially because deleteCity() doesn't exist
        assertFalse(list.hasCity(calgary));
    }

}