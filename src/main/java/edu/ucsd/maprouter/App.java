package edu.ucsd.maprouter;

public class App {
    public static void main(String[] args) {
        IMapsClient mapClient = new GoogleMapsClient();
        MapRouter router = new MapRouter(mapClient);

        System.out.println("--- Starting Navigation System ---");

        double time = router.calculateTravelTime("Price Center", "Geisel Library");

        System.out.println("Estimated arrival in: " + time + " minutes.");
    }
}
