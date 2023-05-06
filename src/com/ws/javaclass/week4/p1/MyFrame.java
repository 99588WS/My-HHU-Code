package com.ws.javaclass.week4.p1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author WS
 * @CreateTime 16:25
 */
public class MyFrame extends JFrame {
    JLabel jl = new JLabel();

    JTextField jt = new JTextField(30);

    public MyFrame() {
        setLayout(new FlowLayout());

        JButton button = new JButton("Show");

        this.add(jt);
        this.add(button);
        this.add(jl);

        MyListener ml = new MyListener(jl, jt);

        button.addActionListener((ActionListener) ml);
    }
}
