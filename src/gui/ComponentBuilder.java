package gui;

import main.InfrastructureHandler;
import infrastructure.ConsoleLogWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ComponentBuilder {

    JTextArea console = new JTextArea();
    ConsoleLogWriter logWriter = new ConsoleLogWriter();


    public JTextField buildInputField(InfrastructureHandler handler) {


        JTextField inputField = new JTextField();
        inputField.setHorizontalAlignment(SwingConstants.CENTER);
        inputField.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
        inputField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
                if (keyEvent.getKeyChar() == '\n') {

                    logWriter.writeInFile(inputField.getText());

                    handler.consoleOutput(inputField.getText());
                    inputField.setText("");
                }
            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {

            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });
        return inputField;
    }

    public JTextArea buildOutputTextArea(String[] strings) {

        for (String string : strings) {
            console.append(string + "\n");
            logWriter.writeInFile(string + "\n");
        }
        console.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        console.setEditable(false);

        return console;

    }

}



