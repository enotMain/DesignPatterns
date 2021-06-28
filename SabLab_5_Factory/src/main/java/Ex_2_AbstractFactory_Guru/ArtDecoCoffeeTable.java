package Ex_2_AbstractFactory_Guru;

public class ArtDecoCoffeeTable implements CoffeeTable {

    public boolean hasLegs() {
        return true;
    }

    public boolean sitOn() {
        return false;
    }
}
