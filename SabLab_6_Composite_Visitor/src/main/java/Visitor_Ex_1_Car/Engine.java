package Visitor_Ex_1_Car;

public class Engine implements Car {

    public void accept(Visitor visitor) {

        visitor.visit(this);
    }
}
