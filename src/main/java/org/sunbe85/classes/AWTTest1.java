package org.sunbe85.classes;

import java.awt.*;

public class AWTTest1 extends Frame {
    public AWTTest1() {
        Button b = new Button("Click Me!!");

        // setting button position on screen
        b.setBounds(30,100,80,30);

        // adding button into frame
        add(b);

        // frame size 300 width and 300 height
        setSize(300,300);

        // setting the title of Frame
        setTitle("This is our basic AWT example");

        // no layout manager
        setLayout(null);

        // now frame will be visible, by default it is not visible
        setVisible(true);
    }
}