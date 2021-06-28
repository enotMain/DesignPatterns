package Ex_3_JavaRush_1.female;

import Ex_3_JavaRush_1.AbstractFactory;
import Ex_3_JavaRush_1.Human;

public class FemaleFactory implements AbstractFactory {

    public Human getPerson(int age) {

        Human human = null;

        if (age <= KidGirl.MAX_AGE) {
            human = new KidGirl();
        }
        else if (age <= TeenGirl.MAX_AGE) {
            human = new TeenGirl();
        }
        else human = new Woman();

        return human;
    }
}
