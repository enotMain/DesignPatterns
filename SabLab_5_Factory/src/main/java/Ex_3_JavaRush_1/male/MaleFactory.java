package Ex_3_JavaRush_1.male;

import Ex_3_JavaRush_1.AbstractFactory;
import Ex_3_JavaRush_1.Human;

public class MaleFactory implements AbstractFactory {

    public Human getPerson(int age) {

        Human human = null;

        if (age <= KidBoy.MAX_AGE) {
            human = new KidBoy();
        }
        else if (age <= TeenBoy.MAX_AGE) {
            human = new TeenBoy();
        }
        else human = new Man();

        return human;
    }
}
