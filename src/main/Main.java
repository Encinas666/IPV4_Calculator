package main;

import javax.swing.*;

import main.GUI.FramePrincipal;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FramePrincipal();
            }
        });
    }
}
