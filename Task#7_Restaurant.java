package Lab07Task07;

public class Restaurant {
    void calculateDeliveryFee(double distance){
        System.out.printf("Calculating delivery fee for %.2f distance\n",distance);
    }
}

class FastFoodRestaurant extends Restaurant{
    @Override
    void calculateDeliveryFee(double distance){
        System.out.printf("Delivery fee for Fast Food Restaurant is: %.2f\n",distance * 80);
    }
}

class FineDiningRestaurant extends Restaurant{
    @Override
    void calculateDeliveryFee(double distance){
        System.out.printf("Delivery fee for Fine Dining Restaurant is: %.2f\n",distance * 60);
    }
}

class CafeRestaurant extends Restaurant{
    @Override
    void calculateDeliveryFee(double distance){
        System.out.printf("Delivery fee Cafe Restaurant is: %.2f\n",distance * 40);
    }
}

class Main {
    public static void main(String[] args){
        Restaurant FFS = new FastFoodRestaurant();
        Restaurant FDR = new FineDiningRestaurant();
        Restaurant CR = new CafeRestaurant();

        FFS.calculateDeliveryFee(6);
        FDR.calculateDeliveryFee(9);
        CR.calculateDeliveryFee(4.5);

        Restaurant r = new Restaurant();
        r.calculateDeliveryFee(2);
    }
}

