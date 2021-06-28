package Visitor_Ex_1_Car;

public interface Visitor {

    void visit(SportCar sportCar);
    void visit(Engine engine);
    void visit(Wheel wheel);
}