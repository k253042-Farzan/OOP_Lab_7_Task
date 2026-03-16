package Lab07Task04;

public class Employee {
    void calculateSalary(){
        System.out.println("Salary is 10000.");
    }
}

class Manager extends Employee {
    @Override
    void calculateSalary(){
        System.out.println("Salary is 1000");
    }

}

class Developer extends Employee {
    @Override
    void calculateSalary(){
        System.out.println("Salary is 100");
    }

}


class Intern extends Employee {
    @Override
    void calculateSalary(){
        System.out.println("Salary is 10");
    }

}

class Main {
    public static void main(String[] args){
        Employee e;

        e = new Developer();
        e.calculateSalary();

        e = new Manager();
        e.calculateSalary();

        e = new Intern();
        e.calculateSalary();

        e.calculateSalary();
    }
}