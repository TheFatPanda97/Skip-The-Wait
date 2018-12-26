package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Button extends JLabel {

    static Color sblue = Color.decode("#039BE5");
    static Color cblue = Color.decode("#0277BD");
    static Color hblue = Color.decode("#03A9F4");

    Button() {
        setOpaque(true);
        addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }
            public void mousePressed(MouseEvent e) {
                setBackground(cblue);
            }
            public void mouseReleased(MouseEvent e) {
                setBackground(sblue);
            }
            public void mouseEntered(MouseEvent e) {
                setBackground(hblue);
            }
            public void mouseExited(MouseEvent e) {
                setBackground(sblue);
            }
        });
    }
}
