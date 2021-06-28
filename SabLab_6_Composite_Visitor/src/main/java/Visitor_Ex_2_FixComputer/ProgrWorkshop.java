package Visitor_Ex_2_FixComputer;

public class ProgrWorkshop implements Fix {

    Computer computer;

    public void fix(Computer computer) {

        this.computer = computer;

        if (computer.isWorkable()) System.out.println(this.getClass().getSimpleName() + " It looks nice yet");
        else System.out.println(this.getClass().getSimpleName() + " We fixed it. Now the computer is workable");
    }

    public void accept(Visitor visitor) {

        visitor.visit(this);
    }

    public Computer getComputer() {

        return computer;
    }
}
