package Package1;

public class PlaneCode {
    public static void main (String... args){
Plane thisPlane = new Plane("Boeing747");
System.out.println("This plane model is " + thisPlane.model);
thisPlane.setPassengers("300");
System.out.println("Number of passengers for this plane is " + thisPlane.passengers);

System.out.println("________________________________________________________________________________________________");

Plane thatPlane = new Plane("F11");
System.out.println("That plane model is " + thatPlane.model);
thatPlane.setPassengers("0");
System.out.println("Number of passengers for that plane is " + thatPlane.passengers + ", because it is fight get");

System.out.println("________________________________________________________________________________________________");
        Plane lastPlane = new Plane("Boeing777");
        System.out.println("This plane model is " + lastPlane.model);

        final String[] passengers = new String[6];
        passengers [0] = "Rich Dude";
        passengers [1] = "Some Dude";
        passengers [2] = "Any Dude";
        passengers [3] = "This Dude";
        passengers [4] = "That Dude";
        passengers [5] = "Last Dude";


    }
}
