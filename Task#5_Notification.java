package Lab07Task05;

public class Notification {
    void send(){
        System.out.println("Notification received.");
    }
}

class EmailNotification extends Notification {
    @Override
    void send(){
        System.out.println("Email received");
    }

}

class SMSNotification extends Notification {
    @Override
    void send(){
        System.out.println("SMS received");
    }

}


class PushNotification extends Notification {
    @Override
    void send(){
        System.out.println("Push notification");
    }

}

class Main {
    public static void main(String[] args){
        Notification n;

        n = new EmailNotification();
        n.send();

        n = new SMSNotification();
        n.send();

        n = new PushNotification();
        n.send();

    }
}
