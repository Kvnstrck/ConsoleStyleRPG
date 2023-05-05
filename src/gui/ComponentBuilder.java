package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ComponentBuilder {

    JTextArea textArea = new JTextArea();

    public JTextField buildInputField() {
        JTextField inputField = new JTextField();
        inputField.setHorizontalAlignment(SwingConstants.CENTER);
        inputField.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
        inputField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
                if (keyEvent.getKeyChar() == '\n') {
                    putCommandOntoConsole(inputField.getText(), textArea);
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
            textArea.append(string + "\n");
        }
        textArea.setFont(new Font(Font.DIALOG, Font.BOLD, 20));

        return textArea;

    }

    public void putCommandOntoConsole(String string, JTextArea console) {
        console.append(string+"\n");
        System.out.println(string);

    }

}
