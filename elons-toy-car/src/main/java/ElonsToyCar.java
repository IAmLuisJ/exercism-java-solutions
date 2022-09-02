public class ElonsToyCar {
    static int battery = 100;
    static int distance = 0;
    
    public static ElonsToyCar buy() {
       return new ElonsToyCar();
    }

    public String distanceDisplay() {
        // "Driven 0 meters"
        String traveled = String.format("Driven %s meters", distance);
        return traveled;
    }

    public String batteryDisplay() {
        if (battery <= 0) {
            return "Battery empty";
        }
        return String.format("Battery at %s%%", battery);

    }

    public void drive() {
        if (battery <= 0) {
            //battery is dead
            System.out.println("Battery empty");
        } else {
            //battery is not dead, drive
            //update distance
            distance += 20;
            //update battery
            battery = battery - 1;
        }
    }
}
