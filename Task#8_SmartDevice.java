package Lab07Task08;

public class SmartDevice {
    void turnOn (){
        System.out.println("Smart devices turning on...");
    }
}

class SmartLight extends SmartDevice {
    @Override
    void turnOn(){
        System.out.println("Light turned on.");
    }
}

class SmartFan extends SmartDevice {
    @Override
    void turnOn (){
        System.out.println("Fan turned on.");
    }
}

class SmartAC extends SmartDevice {
    @Override
    void turnOn(){
        System.out.println("AC turned on.");
    }
}

class Main {
    public static void main(String[] args){
        SmartDevice[] SD = new SmartDevice[4];
        SD[3] = new SmartLight();
        SD[1] = new SmartFan();
        SD[2] = new SmartAC();
        SD[0] = new SmartDevice();

//        for (int i = 0; i < SD.length; i++){
//            SD[i].turnOn();
//        }

        for (SmartDevice SDs : SD) {
            SDs.turnOn();
        }
    }
}