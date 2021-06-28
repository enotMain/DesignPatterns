package Ex_2_AbstractFactory_Guru;

public class Main1 {
    public static void main(String[] args) {

        FurnitureFactory factory = new ModernFurnitureFactory();

        Chair chair = factory.createChair();
        CoffeeTable coffeeTable = factory.createCoffeeTable();
        Sofa sofa = factory.createSofa();
    }
}
