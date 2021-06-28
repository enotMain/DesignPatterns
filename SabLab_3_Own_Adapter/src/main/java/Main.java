public class Main {
    public static void main(String[] args) {

        SovietSpy sovietSpy = new SovietSpy();
        USAgent usAgent = new USAgent();
        Citizen citizen1 = new Citizen();

        CitizenInt citizenAdapter1 = new USAgentCitizenAdapter(usAgent);
        CitizenInt sovietSpyCitizen = new SovietSpyCitizen(sovietSpy);

        System.out.println("Real US Agent does...");
        usAgent.findSpies();
        usAgent.hideInCrowd();

        System.out.println("\nRead Soviet Spy does...");
        sovietSpy.findSecretInformation();
        sovietSpy.followMan();
        sovietSpy.killMan();

        System.out.println("\nThe citizen does...");
        testCitizen(citizen1);

        System.out.println("\nThe CitizenAdapter(Spy) does...");
        testCitizen(citizenAdapter1);

        System.out.println("\nThe CitizenAdapter(Agent) does");
        testCitizen(sovietSpyCitizen);
    }

    static void testCitizen(CitizenInt citizen) {
        citizen.findFriendInCrowd();
        citizen.readMagazines();
        citizen.selfDefence();
        citizen.walkStreet();
    }
}
