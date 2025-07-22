class TrafficLight extends Thread {
    String direction;

    TrafficLight(String direction) {
        this.direction = direction;
    }

    public void run() {
        System.out.println(direction + " light is GREEN");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(direction + " light is RED");
    }
}

public class TrafficMain {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            TrafficLight north = new TrafficLight("NORTH");
            TrafficLight south = new TrafficLight("SOUTH");
            TrafficLight east = new TrafficLight("EAST");
            TrafficLight west = new TrafficLight("WEST");

            north.start(); north.join();
            south.start(); south.join();
            east.start();  east.join();
            west.start();  west.join();
        }
    }
}
