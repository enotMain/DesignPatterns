package Visitor_Ex_2_FixComputer;

public class CompCaseWorkshop implements Fix {

    Computer computer;

    public void fix(Computer computer) {

        this.computer = computer;

        if (computer.isCaseCondition()) System.out.println(this.getClass().getSimpleName() + " It is workable yet");
        else System.out.println(this.getClass().getSimpleName() + " We fixed it. Now the computer case looks nice");
    }

    public void accept(Visitor visitor) {

        visitor.visit(this);
    }

    public Computer getComputer() {

        return computer;
    }
}
