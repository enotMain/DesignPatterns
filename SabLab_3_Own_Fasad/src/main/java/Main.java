public class Main {
    public static void main(String[] args) {

        Disk disk = new Disk();
        Computer computer = new Computer();
        Program program = new Program();
        Game game = new Game();
        FeedBack feedBack = new FeedBack();

        Full full = new Full(
                disk,
                computer,
                program,
                game,
                feedBack
        );

        full.buyGame();
        System.out.println();

        full.installing();
        System.out.println();

        full.play();
        System.out.println();

        full.leaveFeedBack();
    }
}
