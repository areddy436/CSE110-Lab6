package edu.ucsd.maprouter;

public class MockMapsClient implements IMapsClient {
    private double fixedTime; 

    public MockMapsClient(double fixedTime){
        this.fixedTime = fixedTime;
    }

    @Override 
    public double getMinutesEstimate(String start, String end){
        return fixedTime; 
    }

    public void setFixedTime(double fixedTime){
        this.fixedTime = fixedTime; 
    }
    
}
