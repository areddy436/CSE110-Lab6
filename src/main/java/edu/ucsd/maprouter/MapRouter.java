package edu.ucsd.maprouter;

public class MapRouter {
    IMapsClient mapClient; 
    
    public MapRouter(IMapsClient mapClient){
        this.mapClient = mapClient;
    }
    /**
     * Calculates travel time between two points.
     */
    public double calculateTravelTime(String start, String end) {
        
        double time = mapClient.getMinutesEstimate(start, end);

        System.out.println("Route found: " + time + " minutes.");
        return time;
    }
}