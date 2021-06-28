package Composite_Ex_1;

public class Main_Comp_Ex_1 {

    public static void main(String[] args) {

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu        = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu         = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu      = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        // Добавление других элементов

        dinerMenu.add(new MenuItem(

                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59
        ));

        dinerMenu.add(new MenuItem(

                "Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99
        ));

        cafeMenu.add(new MenuItem(

                "Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                3.69
        ));

        // Добавление других элементов

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
