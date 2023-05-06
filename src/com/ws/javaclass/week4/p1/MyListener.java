package com.ws.javaclass.week4.p1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author WS
 * @CreateTime 16:26
 */
public class MyListener implements ActionListener {

    JLabel l;
    JTextField t;

    MyListener(JLabel jl, JTextField jt) {
        this.l = jl;
        this.t = jt;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.l.setText(t.getText());
    }
}
