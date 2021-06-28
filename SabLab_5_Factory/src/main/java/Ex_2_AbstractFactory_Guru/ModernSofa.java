package Ex_2_AbstractFactory_Guru;

public class ModernSofa implements Sofa {

    public boolean hasLegs() {
        return false;
    }

    public boolean sitOn() {
        return true;
    }
}
