package Package1;

public class PlaneCode {
    public static void main (String... args) {
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
            thatPlane.setPassengers("6");
            System.out.println("Number of passengers for last plane is " + lastPlane.passengers + ", because it's VIP Aircraft");

            String[] richPassengers = new String[6];
            richPassengers[0] = "Rich Dude";
            richPassengers[1] = "Some Dude";
            richPassengers[2] = "Any Dude";
            richPassengers[3] = "This Dude";
            richPassengers[4] = "That Dude";
            richPassengers[5] = "Last Dude";
            lastPlane.setPassengersNames(richPassengers);

            for (int i = 0; i < lastPlane.getPassengersNames().length; i++) { // какая разница, если эффект тот же?
            System.out.println(lastPlane.getPassengersNames()[i]);}
            System.out.println("________________________________________________________________________________________________");

            for (int i = 0; i < lastPlane.getPassengersNames().length; i++) {
                     System.out.println(lastPlane.getPassenger(i)); // можно закомментить строку, чтобы чисто свич запустился
                    switch (lastPlane.getPassenger(i)){
                            case "Rich Dude":
                                    System.out.println("This is Rich Dude");
                                    break;
                            case "Some Dude":
                                    System.out.println("This is Some Dude");
                                    break;
                            case "Last Dude":
                                    System.out.println("This is Last Dude");
                                    break;
                            default: System.out.println("There are no dudes on plane");
                    }
            }


            }

            }