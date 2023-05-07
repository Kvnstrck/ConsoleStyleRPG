import gui.GuidedUserInterface;

public class GameManager {
    public void startGame() {
        GuidedUserInterface gui = new GuidedUserInterface();
        gui.createFrame();
        InfrastructureHandler.consoleOutput("test1");
    }
}
