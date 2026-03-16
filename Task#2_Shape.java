package Lab07Task02;

public class Shape {
    void area(){
        System.out.println("Area.");
    }
}

class Circle extends Shape {

    @Override
    void area(){
        System.out.println("3.14 * r^2");
    }
}

class Rectangle extends Shape{

    @Override
    void area(){
        System.out.println("w * l");
    }
}

class Triangle extends Shape {

    @Override
    void area(){
        System.out.println("1/2 a * b");
    }
}

class Main{
    public static void main(String[] args){
        Shape c = new Circle();
        Shape r = new Rectangle();
        Shape t = new Triangle();

        c.area();
        r.area();
        t.area();
    }
}