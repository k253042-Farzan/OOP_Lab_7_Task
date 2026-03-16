package Lab07Task03;

public class Payment {
    void processPayment (){
        System.out.println("Payment is being processed..");
    }

}

class CreditCard extends Payment {
    @Override
    void processPayment (){
        System.out.println("Paying via credit card.");
    }
}

class DebitCard extends Payment {
    @Override
    void processPayment (){
        System.out.println("Paying via debit card.");
    }
}

class PayPal extends Payment {
    @Override
    void processPayment (){
        System.out.println("Paying via pay pal.");
    }
}

class Main {
    public static void main (String[] args){
        Payment p;

        p = new CreditCard();
        p.processPayment();

        p = new DebitCard();
        p.processPayment();

        p = new PayPal();
        p.processPayment();
    }
}