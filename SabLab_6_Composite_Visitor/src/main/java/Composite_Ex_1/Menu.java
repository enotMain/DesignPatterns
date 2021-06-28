package Composite_Ex_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {

    ArrayList menuComponents = new ArrayList();

    String name;
    String description;

    public Menu(String name, String description) {

        this.name        = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {

        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {

        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {

        return (MenuComponent) menuComponents.get(i);
    }

    public String getName() {

        return name;
    }

    public String getDescription() {

        return description;
    }

    public void print() {

        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        for (int i = 0; i < menuComponents.size(); i++) {

            MenuComponent menuComponent = (MenuComponent) menuComponents.get(i);
            menuComponent.print();
        }

        /*
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {

            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
        */
    }
}
