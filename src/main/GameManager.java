package main;

import gui.GuidedUserInterface;
import java.io.File;

public class GameManager {
    public void startGame() {
        GuidedUserInterface gui = new GuidedUserInterface();
        InfrastructureHandler infrastructureHandler = gui.createFrame();

        File consoleLog = new File("src/resources/consoleLog");
        consoleLog.delete();
    }
}
