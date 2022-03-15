import java.sql.SQLOutput;
import java.util.Scanner;

public class BusApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bus autobus = new Bus(41, 15, "DPMLJ");
        for(int i = 1; i < 5; i++){
            System.out.println( i +". zastávka\n" + autobus.getBus());
            System.out.println("Kolik lidí vystoupí a kolik nastoupí:");
            int minus = sc.nextInt();
            int plus = sc.nextInt();

            if (minus > (autobus.getPassengers())) {
                System.out.println("Vystoupilo: " + autobus.getPassengers());
                autobus.clear();
            }
            else {
                autobus.remove(minus);
            }
            if (plus > (autobus.getSeats() - autobus.getPassengers())) {

                System.out.println("Nastoupilo: " + (autobus.getSeats()-autobus.getPassengers()));
                autobus.add(autobus.getSeats() - autobus.getPassengers());
            }
            else {
                autobus.add(plus);
            }
        }
        System.out.println("5. zastávka, konečná");
        System.out.println(autobus.getBus());
        autobus.clear();
        System.out.println(autobus.getBus());


    }
}
