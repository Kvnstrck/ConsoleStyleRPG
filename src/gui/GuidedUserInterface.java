package gui;

import javax.swing.*;
import java.awt.*;

public class GuidedUserInterface {
    ComponentBuilder componentBuilder = new ComponentBuilder();
    String[] strings = {"foo", "bar"};
    public  JTextArea outPutTextArea = componentBuilder.buildOutputTextArea(strings);
    JFrame frame = new JFrame();

    public void createFrame() {
        GridLayout gridLayout = new GridLayout(2, 1);


        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(gridLayout);
        frame.add(outPutTextArea);
        frame.add(componentBuilder.buildInputField());
        frame.setVisible(true);
    }


}
