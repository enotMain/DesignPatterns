package Ex_3_JavaRush_1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        AbstractFactory factory = null;

        Scanner sc = new Scanner(System.in);

        String temp = sc.next();
        int age = sc.nextInt();

        if (temp.equals("MALE")) {
            factory = FactoryProducer.getFactory(FactoryProducer.HumanFactoryType.MALE);
        }
        else if (temp.equals("FEMALE")) {
            factory = FactoryProducer.getFactory(FactoryProducer.HumanFactoryType.FEMALE);
        }

        System.out.println(factory.getPerson(age).toString());
    }
}
