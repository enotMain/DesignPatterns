package Visitor_Ex_1_Car;

public class Wheel implements Car{

    public void accept(Visitor visitor) {

        visitor.visit(this);
    }
}
