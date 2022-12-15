package Package1;

public class Plane {
    public static String model;
    public String passengers;

    public Plane(String params) {
        model = params;
    }
    public void setPassengers(String setPassengers) {
        passengers = setPassengers;
    }

    private String[] passengersNames = new String[6];

    public String[] getPassengersNames() {
        return passengersNames;
    }
    public void setPassengersNames(String[] passengersNames) {
        this.passengersNames = passengersNames;
    }
    public String getPassenger(int index) {
        return passengersNames[index];
    }

    //  public boolean isPassengerOnPlane () {
   //     return true;}


}

