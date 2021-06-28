public class Main {
    public static void main(String[] args) {
        // Создаем управляющий объект
        Director director = new Director();

        // Создаем строителя
        CarBuilder builder = new CarBuilder();
        // Собираем строителя
        director.constructSportsCar(builder);

        // Создаем мануал
        Car car = builder.getResult();

        // Выводим результат
        //System.out.println("Car built:\n" + manual.print());
    }
}
