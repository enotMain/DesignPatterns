public class Full {

    Disk disk;
    Computer computer;
    Program program;
    Game game;
    FeedBack feedBack;

    Full(
            Disk disk,
            Computer computer,
            Program program,
            Game game,
            FeedBack feedBack
    ) {

        this.disk = disk;
        this.computer = computer;
        this.program = program;
        this.game = game;
        this.feedBack = feedBack;
    }

    public void buyGame() {
        System.out.println("--buyGame--");
        disk.goShop();
        disk.chooseGame();
        disk.takeGame();
        disk.buyGame();
        disk.goHome();
    }

    public void installing() {
        System.out.println("--installing--");
        computer.turnOnComp();
        disk.insertDisk();
        program.openProgram();
        program.followInstructions();
        program.finishInstalling();
        disk.insertBackDisk();
    }


    public void play() {
        System.out.println("--play--");
        computer.turnOnComp();
        disk.insertDisk();
        game.openGame();
        game.playGame();
        game.finishPlaying();
        disk.insertBackDisk();
        computer.turnOffComp();
    }

    public void leaveFeedBack() {
        System.out.println("--leaveFeedBack--");
        computer.turnOnComp();
        disk.insertDisk();
        game.openGame();
        game.playGame();
        game.finishPlaying();
        feedBack.openBrowser();
        feedBack.leaveFeedback();
        feedBack.closeBrowser();
        disk.insertBackDisk();
        computer.turnOffComp();
    }
}
