package gui;


import main.InfrastructureHandler;
import javax.swing.*;
import java.awt.*;

public class GuidedUserInterface {
    ComponentBuilder componentBuilder = new ComponentBuilder();
    String[] strings = {"This is a new Game instance!"};
    public  JTextArea console = componentBuilder.buildOutputTextArea(strings);
    JFrame frame = new JFrame();

    public InfrastructureHandler createFrame() {
        GridLayout gridLayout = new GridLayout(2, 1);
        InfrastructureHandler handler = new InfrastructureHandler(this);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(gridLayout);
        frame.add(console);
        frame.add(componentBuilder.buildInputField(handler));
        frame.setVisible(true);
        return handler;
    }

    public void putCommandOntoConsole(String string) {
        this.console.append(string + "\n");
        System.out.println(string);

    }
    public void clearConsole(){
        this.console.setText("");
        this.console.repaint();
    }


}
