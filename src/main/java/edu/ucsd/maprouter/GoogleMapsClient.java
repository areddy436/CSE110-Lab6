package edu.ucsd.maprouter;

import java.util.Random;

public class GoogleMapsClient implements IMapsClient {

    @Override
    public double getMinutesEstimate(String start, String end) {
        Random random = new Random();
        double min = 5.0;
        double max = 20.0;
        try {
            // Simulating Network Latency
            System.out.println("[SDK] Querying Google Maps API for route...");
            Thread.sleep(500);

            // Return a dummy estimate in minutes
            return Math.round((min + random.nextFloat() * (max - min)) * 100.0) / 100.0;
        } catch (InterruptedException e) {
            throw new RuntimeException("Request Interrupted");
        }
    }
}