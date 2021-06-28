package Visitor_Ex_2_FixComputer;

public class Main_V_Ex_2_FC {

    public static void main(String[] args) {

        Computer computer1 = new Computer(true, false);
        Computer computer2 = new Computer(false, false);

        ProgrWorkshop progrWorkshop = new ProgrWorkshop();
        CompCaseWorkshop compCaseWorkshop = new CompCaseWorkshop();

        progrWorkshop.fix(computer1);
        progrWorkshop.accept(new VisitorClass());
        compCaseWorkshop.fix(computer1);
        compCaseWorkshop.accept(new VisitorClass());

        progrWorkshop.fix(computer2);
        progrWorkshop.accept(new VisitorClass());
        compCaseWorkshop.fix(computer2);
        compCaseWorkshop.accept(new VisitorClass());
    }
}