package com.rk;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TabListener extends KeyAdapter {

    JTextArea textArea;

    public TabListener(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_TAB) {
            textArea.transferFocus();
            e.consume();
        }
    }
}
