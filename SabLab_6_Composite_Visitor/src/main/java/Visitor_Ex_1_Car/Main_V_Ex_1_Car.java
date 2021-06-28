package Visitor_Ex_1_Car;

public class Main_V_Ex_1_Car {

    public static void main(String[] args) {

        Car car = new SportCar();
        car.accept(new CarVisitor());
    }
}
