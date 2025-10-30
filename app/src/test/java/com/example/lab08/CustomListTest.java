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
    @Test
    public void testCountCities(){
        //This will fail initially because countCities doesn't exist
        CustomList list = new CustomList();
        //test empty list
        assertEquals(0, list.countCities());

        //add city and ensure it is in list
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));

        //add another and assert it is in list
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);
        assertTrue(list.hasCity(edmonton));

        //check count city after addition
        assertEquals(2, list.countCities());

        //remove city and assert it is gone
        list.deleteCity(edmonton);
        assertFalse(list.hasCity(edmonton));

        //check count after deletion
        assertEquals(1, list.countCities());
}
}