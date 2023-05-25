package main;
import infrastructure.*;
import gui.GuidedUserInterface;

public class InfrastructureHandler {


    GuidedUserInterface gui;

    public InfrastructureHandler(GuidedUserInterface gui) {
        this.gui = gui;
    }

    public void consoleOutput(String string) {
        gui.putCommandOntoConsole(string);
    }

    public void clearConsole() {
        gui.clearConsole();
    }
}
