package Lab07Task06;

public class Transport {
    void fare(){
        System.out.println("Pay fare for transport.");
    }
}

class Bus extends Transport {
    @Override
    void fare(){
        System.out.println("Bus fare: 100");
    }

}

class Train extends Transport {
    @Override
    void fare(){
        System.out.println("Train fare: 80");
    }

}


class Taxi extends Transport {
    @Override
    void fare(){
        System.out.println("Taxi fare: 120");
    }

}

class Main {
    public static void main(String[] args){
        Transport t;

        t = new Bus();
        t.fare();

        t = new Train();
        t.fare();

        t = new Taxi();
        t.fare();

    }
}