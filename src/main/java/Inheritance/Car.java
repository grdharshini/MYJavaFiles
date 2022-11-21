package Inheritance;

public class Car extends Vehicle{
    String modelName = "mustang";

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.Brand+myCar.modelName+myCar.startingYear);
    }
}
