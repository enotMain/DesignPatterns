package Ex_2_AbstractFactory_Guru;

public class ModernFurnitureFactory implements FurnitureFactory {

    public Chair createChair() {
        return new ModernChair();
    }

    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    public Sofa createSofa() {
        return new ModernSofa();
    }
}
