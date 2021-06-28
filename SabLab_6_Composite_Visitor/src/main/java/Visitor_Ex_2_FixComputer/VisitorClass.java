package Visitor_Ex_2_FixComputer;

public class VisitorClass implements Visitor {

    public void visit(ProgrWorkshop progrWorkshop) {

        if (!progrWorkshop.getComputer().isWorkable()) System.out.println("Work costs 100 dollars\n");
        else System.out.println("Free\n");
    }

    public void visit(CompCaseWorkshop compCaseWorkshop) {

        if (!compCaseWorkshop.getComputer().isCaseCondition()) System.out.println("Work costs 200 dollars\n");
        else System.out.println("Free\n");
    }
}
