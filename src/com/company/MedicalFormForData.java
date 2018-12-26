package com.company;

import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

public class MedicalFormForData extends JPanel {
    private JTextField textHeight, textWeight, textHeartBeat, textTemp, textBType, textBPressure, textTriage;
    private JLabel Height, Weight, HeartBeat, Temp, BType, BPressure, Triage;

    private Button submitAdmission;
    private Button ClearButton;

    final int space = 45;
    final int xspace = 145;
    final int prespace = 25;

    MedicalFormForData(){
        setLayout(null);
        setBackground(Color.WHITE);
        setVisible(true);

        //Making Jlabels
        Height = new JLabel("Height:");
        Height.setBounds(prespace, prespace,xspace,20);
        add(Height);

        Weight = new JLabel("Weight:");
        Weight.setBounds(prespace, Height.getY() + space,xspace,20);
        add(Weight);

        HeartBeat = new JLabel("Heart Beat:");
        HeartBeat.setBounds(prespace,Weight.getY() + space,xspace,20);
        add(HeartBeat);

        Temp = new JLabel("Temperature:");
        Temp.setBounds(prespace,HeartBeat.getY() + space, xspace, 20);
        add(Temp);

        BType = new JLabel("Blood Type:");
        BType.setBounds(prespace, Temp.getY() + space,xspace,20);
        add(BType);

        BPressure = new JLabel("Blood Pressure:");
        BPressure.setBounds(prespace,BType.getY()+ space,xspace,20);
        add(BPressure);

        Triage = new JLabel("Triage:");
        Triage.setBounds(prespace,BPressure.getY() + space, xspace,20);
        add(Triage);

        //Making JTextFields

        textHeight = new JTextField();
        textHeight.setBounds(Height.getWidth(), prespace,700 ,25);
        textHeight.setVisible(true);
        add(textHeight);

        textWeight = new JTextField();
        textWeight.setBounds(Weight.getWidth(), textHeight.getY() + space, 700,25);
        textWeight.setVisible(true);
        add(textWeight);

        textHeartBeat = new JTextField();
        textHeartBeat.setBounds(HeartBeat.getWidth(), textWeight.getY() + space, 700, 25);
        textHeartBeat.setVisible(true);
        add(textHeartBeat);

        textTemp = new JTextField();
        textTemp.setBounds(Temp.getWidth(), textHeartBeat.getY() + space, 700, 25);
        textTemp.setVisible(true);
        add(textTemp);

        textBType = new JTextField();
        textBType.setBounds(BType.getWidth(), textTemp.getY() + space,700, 25);
        textBType.setVisible(true);
        add(textBType);


        textBPressure = new JTextField();
        textBPressure.setBounds(BPressure.getWidth(), textBType.getY() + space, 700, 25);
        textBPressure.setVisible(true);
        add(textBPressure);

        textTriage = new JTextField();
        textTriage.setBounds(Triage.getWidth(), textBPressure.getY() + space, 700, 25);
        textTriage.setVisible(true);
        add(textTriage);

        //Adding submitAdmission button
        submitAdmission = new Button();
        submitAdmission.addMouseListener(new MouseListener() { //TODO MARKO DO YOUR SERVER THING

            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
                try {
                    InetAddress testmeeee = InetAddress.getLocalHost();
                    System.out.println("Name + IP" + testmeeee.toString() + "\nName" + testmeeee.getHostName() + "\nIP Address " + testmeeee.getHostAddress() + "\nCanon IP " + testmeeee.getCanonicalHostName());
                }
                catch (UnknownHostException v){

                    System.out.println("lose");
                }

                //    send_to_server();
                //System.out.println(getTimes());
                //clearTextBoxes();

                //System.out.println(calcAge(birthday.getText()));
            }


            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });

        //Adding Clear Button

        ClearButton = new Button();
        ClearButton.setText("Clear");
        ClearButton.setFont(new Font("questrial", Font.PLAIN, 15));
        ClearButton.setHorizontalAlignment(SwingConstants.CENTER);
        ClearButton.setVerticalAlignment(SwingConstants.CENTER);
        ClearButton.setForeground(Color.WHITE);
        ClearButton.setBounds(215, textTriage.getY() + 50, 300, 50);
        ClearButton.setBackground(Button.sblue);
        ClearButton.setVisible(true);
        ClearButton.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
                clearTextBoxes();
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });
        add(ClearButton);

        submitAdmission.setBounds(ClearButton.getX() + 325, ClearButton.getY(), 300, 50);
        submitAdmission.setText("Submit");
        submitAdmission.setFont(new Font("questrial", Font.PLAIN, 15));
        submitAdmission.setHorizontalAlignment(SwingConstants.CENTER);
        submitAdmission.setVerticalAlignment(SwingConstants.CENTER);
        submitAdmission.setForeground(Color.WHITE);
        submitAdmission.setBackground(Button.sblue);
        submitAdmission.setHorizontalAlignment(SwingConstants.CENTER);
        submitAdmission.setVerticalAlignment(SwingConstants.CENTER);
        submitAdmission.setVisible(true);
        add(submitAdmission);
    }

    public void clearTextBoxes(){

        textHeight.setText("");
        textWeight.setText("");
        textHeartBeat.setText("");
        textTemp.setText("");
        textBType.setText("");
        textBPressure.setText("");
        textTriage.setText("");
    }
//    public void send_to_server(){
//
//        //Map to store  thehe tstrings
//        System.out.println("In server");
//        Map<String, String> patient_data_map = new HashMap<>();
//
//
//        patient_data_map.put("first_name", extract_string(textFName.getText()));
//        patient_data_map.put("middle_name", extract_string(textMName.getText()));
//        patient_data_map.put("last_name", extract_string(textLName.getText()));
//        patient_data_map.put("triage", "0");
//        patient_data_map.put("preferred_name", extract_string(textPrefName.getText())); //FIXME
//        patient_data_map.put("healthcare_id", extract_string(textHealthCareID.getText()));
//        patient_data_map.put("birthday", extract_string(textBirthday.getText()));      //TODO: Get age from birthday and add paramter
//        patient_data_map.put("address",extract_string(textAddress.getText()));
//        patient_data_map.put("sex", extract_string(textSex.getText()));
//        patient_data_map.put("nationality", extract_string(textNationality.getText()));
//        patient_data_map.put("religion", extract_string(textReligion.getText()));
//        patient_data_map.put("first_Language", extract_string(textNationality.getText()));
//        patient_data_map.put("status", extract_string(textStatus.getText()));
//        //patient_data_map.put("age", extract_string(calcAge(textBirthday.getText())));
//        //patient_data_map.put("date_admission", extract_string(getTimes()));
//        patient_data_map.put("civil_status", extract_string(textStatus.getText()));
//        patient_data_map.put("time_of_discharge", extract_string(textTimeOfDischarge.getText()));     //TODO: Distarch time
//        JSONObject send_json_object = new JSONObject();
//        send_json_object.put("action", new java.lang.String("sending_general"));
//        send_json_object.put("id_number", new java.lang.String("-1")); //Shouldn't this be -1?
//        send_json_object.put("patient_data", new JSONObject(patient_data_map));
//
//
//        //Client connect
//        String jsonText = send_json_object.toString();
//        sockets cl = null;
//
//        InetAddress addr = null;
//        try {
//            addr = InetAddress.getByName("0.0.0.0");
//        }
//        catch(UnknownHostException h) {
//            System.out.println("Bad adress");
//        }
//
//        try {
//            //To send the JSON string
//            cl = new sockets(addr, port_number);
//            cl.send(jsonText);
//            System.out.println("Sent message!");
//
//        }
//        catch (IOException e) {
//            System.out.println("IO exception, chat");
//        }
//    }
}
