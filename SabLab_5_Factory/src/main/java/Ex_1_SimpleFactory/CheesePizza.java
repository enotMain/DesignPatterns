package Ex_1_SimpleFactory;

public class CheesePizza implements Pizza {

    public void prepare() {
        System.out.println("Preparing cheese pizza");
    }

    public void bake() {
        System.out.println("Baking");
    }

    public void cut() {
        System.out.println("Cutting");
    }

    public void box() {
        System.out.println("Boxing");
    }
}
