package Constructors;

public class Second {
    public static void main(String[] args) {
        Main myCar = new Main("Swift",1963);
        System.out.println("My car name is "+ myCar.getModelName() + " starting year is "+myCar.startingYear);
    }
}
