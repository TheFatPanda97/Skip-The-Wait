package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class frame extends JFrame {

    static Color yellow = Color.decode("#FDD835");
    static Color blue = Color.decode("#01579B");

    CardLayout cl = new CardLayout();

    JPanel allContent = new JPanel();

    TopMenu topMenu = new TopMenu();
    FormForData FFD;
    MedicalFormForData MFFD;
    ListOfNames Allpatient = new ListOfNames();
    Patients Profile = new Patients(topMenu);

    Button exit = new Button();
    Button allPatients = new Button();
    Button forms = new Button();
    Button Medical = new Button();
    Button p = new Button();

    static int h = 800;
    static int w = 900;


    frame() {
        super("Hospital Software");
        setSize(w, h);
        setDefaultCloseOperation(3);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setUndecorated(true);
        MFFD = new MedicalFormForData();
        FFD = new FormForData();

        allContent.setBounds(0, topMenu.getHeight(), getWidth(), getHeight());

        FFD.setBounds(0, topMenu.getHeight(), getWidth(), getHeight() - topMenu.getHeight());

        exit.setText("X");
        exit.setFont(new Font("questrial", Font.BOLD, 20));
        exit.setForeground(Color.WHITE);
        exit.setHorizontalAlignment(SwingConstants.CENTER);
        exit.setVerticalAlignment(SwingConstants.CENTER);
        exit.setSize(50, 50);
        exit.setLocation(topMenu.getWidth() - exit.getWidth(), 0);
        exit.setBackground(Button.sblue);
        exit.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
                System.exit(0);
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });

        allPatients.setText("All Patients");
        allPatients.setFont(new Font("questrial", Font.BOLD, 20));
        allPatients.setHorizontalAlignment(SwingConstants.CENTER);
        allPatients.setVerticalAlignment(SwingConstants.CENTER);
        allPatients.setForeground(Color.WHITE);
        allPatients.setSize(150, 50);
        allPatients.setLocation(0, 0);
        allPatients.setBackground(Button.sblue);
        allPatients.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
                cl.show(allContent, "2");
            }

            public void mouseReleased(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });

        forms.setText("General");
        forms.setFont(new Font("questrial", Font.BOLD, 20));
        forms.setHorizontalAlignment(SwingConstants.CENTER);
        forms.setVerticalAlignment(SwingConstants.CENTER);
        forms.setForeground(Color.WHITE);
        forms.setSize(100, 50);
        forms.setLocation(allPatients.getWidth() + 10, 0);
        forms.setBackground(Button.sblue);
        forms.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
                cl.show(allContent, "1");
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });

        Medical.setText("Medical");
        Medical.setFont(new Font("questrial", Font.BOLD, 20));
        Medical.setHorizontalAlignment(SwingConstants.CENTER);
        Medical.setVerticalAlignment(SwingConstants.CENTER);
        Medical.setForeground(Color.WHITE);
        Medical.setSize(100, 50);
        Medical.setLocation(forms.getX() + forms.getWidth() + 10, 0);
        Medical.setBackground(Button.sblue);
        Medical.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
                cl.show(allContent, "3");
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }


        });

        p.setText("Patient");
        p.setFont(new Font("questrial", Font.BOLD, 20));
        p.setHorizontalAlignment(SwingConstants.CENTER);
        p.setVerticalAlignment(SwingConstants.CENTER);
        p.setForeground(Color.WHITE);
        p.setSize(100, 50);
        p.setLocation(Medical.getX() + Medical.getWidth() + 10, 0);
        p.setBackground(Button.sblue);
        p.addMouseListener(new MouseListener() {

                                     public void mouseClicked(MouseEvent e) {
                                     }

                                     public void mousePressed(MouseEvent e) {
                                     }

                                     public void mouseReleased(MouseEvent e) {


                                         cl.show(allContent, "4");
                                     }

                                     public void mouseEntered(MouseEvent e) {
                                     }

                                     public void mouseExited(MouseEvent e) {
                                     }
                                 });

        allContent.setLayout(cl);
        allContent.add(FFD, "1");
        allContent.add(Allpatient, "2");
        allContent.add(MFFD, "3");
        allContent.add(Profile, "4");


        topMenu.add(exit);
        topMenu.add(allPatients);
        topMenu.add(forms);
        topMenu.add(Medical);
        topMenu.add(p);

        cl.show(allContent, "3");

        add(allContent);
        add(topMenu);
    }
}
