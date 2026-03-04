package edu.ucsd.maprouter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class MapRouterTest {
    /**
     * Test for calculateTravelTime method in MapRouter class.
     */
    @Test
    void testCalculateTravelTime() {

        MockMapsClient mockMapsClient = new MockMapsClient(12.5);

        MapRouter router = new MapRouter(mockMapsClient);

        double result = router.calculateTravelTime("UCSD", "Airport");

        assertEquals(12.5, result, "The travel time should be 12.5");
    }

    /**
     * Test for calculateTravelTime method in MapRouter class with different travel
     * times.
     */
    @Test
    void testDifferentTravelTime() {

        MockMapsClient mockMapsClient = new MockMapsClient(12.5);

        MapRouter router = new MapRouter(mockMapsClient);

        double result = router.calculateTravelTime("UCSD", "Airport");

        assertEquals(12.5, result, "The travel time should be 12.5");

        mockMapsClient.setFixedTime(20);
        result = router.calculateTravelTime("UCSD", "Airport");

        assertEquals(20, result, "The travel time should be 20");
    }
}
