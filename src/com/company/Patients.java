package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Patients extends JPanel {

    JLabel profile = new JLabel();
    JLabel sideBar = new JLabel();
    JLabel name = new JLabel("John Smith");
    JLabel Pname = new JLabel("Preferred Name:");
    JLabel body = new JLabel();
    JLabel heartGif = new JLabel();
    JLabel all = new JLabel();

    JLabel ID = new JLabel("ID:"); //TODO: MARCO (POLO) WANTS ALL PATIENTS TO BE SENT TO HIS SERVER WITH AN ID OF '-1'
    JLabel Triage = new JLabel("Level:");
    JLabel Age = new JLabel("Age:");
    JLabel Sex = new JLabel("Sex:");

    JLabel eID = new JLabel();
    JLabel ePName = new JLabel();
    JLabel eLevel = new JLabel();
    JLabel eAge = new JLabel();
    JLabel eSex = new JLabel();
    JLabel eAddress = new JLabel();
    JLabel eNationality = new JLabel();
    JLabel eReligion = new JLabel();
    JLabel eLanguage = new JLabel();
    JLabel eStatus = new JLabel();
    JLabel eDOD = new JLabel();
    JLabel eTOD = new JLabel();
    JLabel eTemp = new JLabel();
    JLabel eBPress = new JLabel();
    JLabel eBType = new JLabel();
    JLabel eHeight = new JLabel();
    JLabel eWeight = new JLabel();
    JLabel eTriage = new JLabel();
    String strBeat = "100";

    ImageIcon profilPic = new ImageIcon(getClass().getResource("profilePic.png"));
    ImageIcon bodyPic = new ImageIcon(getClass().getResource("body.png"));

    ImageIcon PLive = new ImageIcon(getClass().getResource("PLive.gif"));
    ImageIcon allPic;
    ImageIcon heart = new ImageIcon(getClass().getResource("heart.gif"));

    Color sideBlue = Color.decode("#01579B");
    Color Magenta = Color.decode("#E91E63");
    boolean which = false;

    Patients(JPanel topMenu) {

        setLayout(null);

        allPic = imgRescaler(new ImageIcon(getClass().getResource("all.jpg")), 660, 750);

        profile.setIcon(profilPic);
        profile.setOpaque(false);
        profile.setBounds(20, 50, 200, 200);
        add(profile);

        heartGif.setIcon(heart);
        heartGif.setBounds(260, 15, 370, 224);
        add(heartGif);

        body.setIcon(bodyPic);
        body.setOpaque(false);
        body.setBounds(20, 400, 100, 250);
        add(body);

        name.setBounds(0, 250, 240, 50);
        name.setFont(new Font("questrial", Font.BOLD, 25));
        name.setHorizontalAlignment(SwingConstants.CENTER);
        name.setVerticalAlignment(SwingConstants.CENTER);
        name.setForeground(Color.WHITE);
        name.setBackground(Button.sblue);
        add(name);

        Pname.setBounds(20, 280, 120, 50);
        Pname.setFont(new Font("questrial", Font.PLAIN, 15));
        Pname.setForeground(Color.WHITE);
        Pname.setBackground(Button.sblue);
        add(Pname);

        sideBar.setBounds(0, 0, 240, frame.h - topMenu.getHeight());
        sideBar.setBackground(sideBlue);
        sideBar.setOpaque(true);

        ID.setBounds(body.getX()+body.getWidth()-25, body.getY(), 30, 27);
        ID.setFont(new Font("questrial", Font.PLAIN, 16));
        ID.setForeground(Color.WHITE);
        add(ID);

        Triage.setBounds(body.getX()+body.getWidth()-10, body.getY()+40, 50, 27);
        Triage.setFont(new Font("questrial", Font.PLAIN, 16));
        Triage.setForeground(Color.WHITE);
        add(Triage);

        Age.setBounds(body.getX()+body.getWidth()-8, body.getY()+80, 40, 27);
        Age.setFont(new Font("questrial", Font.PLAIN, 16));
        Age.setForeground(Color.WHITE);
        add(Age);

        Sex.setBounds(body.getX()+body.getWidth()+4, body.getY()+120, 35, 27);
        Sex.setFont(new Font("questrial", Font.PLAIN, 16));
        Sex.setForeground(Color.WHITE);
        add(Sex);

        eID.setBounds(ID.getX()+ID.getWidth(), ID.getY(), 100, 27);
        add(eID);

        eLevel.setBounds(Triage.getX()+Triage.getWidth(), Triage.getY(), 70, 27);
        add(eLevel);

        eAge.setBounds(Age.getX() + Age.getWidth(), Age.getY(), 75, 27);
        add(eAge);

        ePName.setBounds(Pname.getX()+Pname.getWidth(), Pname.getY() + 10, 85, 27);
        add(ePName);


        all.setBounds(sideBar.getWidth(), 0, 660, 750);
        all.setIcon(allPic);
        all.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX() + 240;
                int y = e.getY();
                System.out.println(x + "," + y);//these co-ords are relative to the component

            }
        });

        eSex.setBounds(Sex.getX()+ Sex.getWidth(), Sex.getY(), 40, 27);
        add(eSex);

        eAddress.setBounds(400, 270, 100, 27);
        add(eAddress);

        eNationality.setBounds(442, 337, 100, 27);
        add(eNationality);

        eReligion.setBounds(402, 410, 100, 27);
        add(eReligion);

        eLanguage.setBounds(425, 482, 100, 27);
        add(eLanguage);

        eStatus.setBounds(371, 548, 100, 27);
        add(eStatus);

        all.setBounds(sideBar.getWidth(), 0, 660, 750);
        all.setIcon(allPic);

        eDOD.setBounds(473, 614, 100, 27);
        add(eDOD);

        eTOD.setBounds(475, 668, 100, 27);
        add(eTOD);

        eTemp.setBounds(745, 40, 120, 80);
        add(eTemp);

        eBType.setBounds(735, 214, 100, 27);
        add(eBType);

        eBPress.setBounds(777, 248, 100, 27);
        add(eBPress);

        eHeight.setBounds(782, 328, 97, 27);
        add(eHeight);

        eWeight.setBounds(792, 394, 85, 27);
        add(eWeight);

        eTriage.setBounds(713, 596, 120, 80);
        add(eTriage);

        heartGif.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
                if (!which) {

                    heartGif.setIcon(PLive);
                    which = true;

                } else  {

                    heartGif.setIcon(heart);
                    which = false;

                }
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {

            }

            public void mouseExited(MouseEvent e) {
            }
        });

        add(sideBar);
        add(all);

    }

    ImageIcon imgRescaler(ImageIcon img, int w, int h) {

        Image tempImg = img.getImage();
        ImageIcon tempFinal = new ImageIcon(tempImg.getScaledInstance(w, h, Image.SCALE_SMOOTH));
        return tempFinal;
    }


}
