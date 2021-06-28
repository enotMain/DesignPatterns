public class USAgentCitizenAdapter implements CitizenInt {

    Agent agent;

    public USAgentCitizenAdapter(Agent agent) {
        this.agent = agent;
    }

    public void walkStreet() {
        agent.hideInCrowd();
    }

    public void readMagazines() {
        System.out.println("Just read");
    }

    public void selfDefence() {
        System.out.println("Just defence");
    }

    public void findFriendInCrowd() {
        agent.findSpies();
    }
}
