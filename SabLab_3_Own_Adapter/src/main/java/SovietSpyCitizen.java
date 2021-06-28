public class SovietSpyCitizen implements CitizenInt {

    Spy spy;

    SovietSpyCitizen(Spy spy) {
        this.spy = spy;
    }

    public void walkStreet() {
        spy.followMan();
    }

    public void readMagazines() {
        spy.findSecretInformation();
    }

    public void selfDefence() {
        spy.killMan();
    }

    public void findFriendInCrowd() {
        spy.followMan();
    }
}
