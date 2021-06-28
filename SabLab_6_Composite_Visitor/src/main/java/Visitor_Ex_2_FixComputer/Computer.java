package Visitor_Ex_2_FixComputer;

public class Computer {

    boolean workable;
    boolean caseCondition;

    public Computer(boolean workable, boolean caseCondition) {

        this.workable      = workable;
        this.caseCondition = caseCondition;
    }

    public boolean isWorkable() {

        return workable;
    }

    public boolean isCaseCondition() {

        return caseCondition;
    }
}
