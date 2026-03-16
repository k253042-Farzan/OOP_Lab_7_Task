package Lab07Task09;

import java.util.Scanner;
public class Ride {
    void calculateFare(double distance){
        System.out.println("Calculating fare according to ride and distance...");
    }
}

class BikeRide extends Ride {
    @Override
    void calculateFare(double distance){
        System.out.printf("Fare of ride on bike for %.2f Km is %.2f\n",distance, distance * 50);
    }
}

class CarRide extends Ride {
    @Override
    void calculateFare(double distance){
        System.out.printf("Fare of ride on car for %.2f Km is %.2f\n",distance, distance * 70);
    }
}

class LuxuryRide extends Ride {
    @Override
    void calculateFare(double distance){
        System.out.printf("Fare of ride on Luxury vehicle for %.2f Km is %.2f\n",distance, distance * 100);
    }
}

class Main {
    public static void main(String[] args){
        Ride[] ride = new Ride[3];

        ride[0] = new BikeRide();
        ride[1] = new CarRide();
        ride[2] = new LuxuryRide();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance to calculate fare: ");
        double distance = sc.nextDouble();
        for (Ride ride1 : ride){
            ride1.calculateFare(distance);
        }
    }
}