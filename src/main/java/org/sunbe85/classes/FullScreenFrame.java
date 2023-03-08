package org.sunbe85.classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FullScreenFrame extends JFrame {
    public FullScreenFrame() {
        // Set the frame to full screen
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);

        // Disable the default close operation
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Set the background color
        this.getContentPane().setBackground(Color.BLACK);

        // Add a key listener to ignore all keystrokes
        Toolkit.getDefaultToolkit().addAWTEventListener(new AWTEventListener() {
            @Override
            public void eventDispatched(AWTEvent event) {
                KeyEvent ke = (KeyEvent) event;
                Robot robot = null;
                try {
                    robot = new Robot();
                } catch (AWTException e) {
                    throw new RuntimeException(e);
                }
                if (ke.isControlDown() && ke.isMetaDown() && (ke.getKeyCode() == KeyEvent.VK_LEFT)) {
                    robot.keyPress(KeyEvent.VK_CONTROL);
                    robot.keyPress(KeyEvent.VK_WINDOWS);
                    robot.keyPress(KeyEvent.VK_RIGHT);
                    robot.keyRelease(KeyEvent.VK_RIGHT);
                    robot.keyRelease(KeyEvent.VK_WINDOWS);
                    robot.keyRelease(KeyEvent.VK_CONTROL);
                } else if (ke.isControlDown() && ke.isMetaDown() && (ke.getKeyCode() == KeyEvent.VK_RIGHT)) {
                    robot.keyPress(KeyEvent.VK_CONTROL);
                    robot.keyPress(KeyEvent.VK_WINDOWS);
                    robot.keyPress(KeyEvent.VK_LEFT);
                    robot.keyRelease(KeyEvent.VK_LEFT);
                    robot.keyRelease(KeyEvent.VK_WINDOWS);
                    robot.keyRelease(KeyEvent.VK_CONTROL);
                }
            }
        }, AWTEvent.KEY_EVENT_MASK);

        // Show the frame
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FullScreenFrame();
    }
}
