package Visitor_Ex_1_Car;

public class CarVisitor implements Visitor {

    public void visit(SportCar sportCar) {

        print("car");
    }

    public void visit(Engine engine) {

        print("engine");
    }

    public void visit(Wheel wheel) {

        print("wheel");
    }

    private void print(String string) {

        System.out.println(string);
    }
}
