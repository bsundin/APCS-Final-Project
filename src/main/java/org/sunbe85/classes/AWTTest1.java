package org.sunbe85.classes;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTTest1 extends Frame {
    public AWTTest1() {
        addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                dispose();
            }
        });
        Button b = new Button("Click Me!!");

        // setting button position on screen
        b.setBounds(30,100,80,30);

        // adding button into frame
        add(b);

        // frame size 300 width and 300 height
        setSize(300,300);

        // setting the title of Frame
        setTitle("This is the basic AWT example");

        // no layout manager
        setLayout(null);

        // now frame will be visible, by default it is not visible
        setVisible(true);
    }
}
