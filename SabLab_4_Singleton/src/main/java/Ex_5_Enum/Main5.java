package Ex_5_Enum;

public class Main5 {
    public static void main(String[] args) {

        Singleton singleton = Singleton.INSTANCE;
        System.out.println(singleton.getValue());

        singleton.setValue(2);

        Singleton singleton1 = Singleton.INSTANCE;
        System.out.println(singleton1.getValue());
    }
}
