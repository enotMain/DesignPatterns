package Ex_3_JavaRush_1;

import Ex_3_JavaRush_1.female.FemaleFactory;
import Ex_3_JavaRush_1.male.MaleFactory;

public class FactoryProducer {

    public enum HumanFactoryType{
        MALE, FEMALE;
    }

    public static AbstractFactory getFactory(HumanFactoryType humanFactoryType) {

        if (humanFactoryType.equals(HumanFactoryType.MALE)) {
            return new MaleFactory();
        }
        else if (humanFactoryType.equals(HumanFactoryType.FEMALE)) {
            return new FemaleFactory();
        }

        return null;
    }
}
