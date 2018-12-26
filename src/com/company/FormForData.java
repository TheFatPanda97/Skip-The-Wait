package com.company;

import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;

import java.util.HashMap;
import java.util.Map;

import org.json.*;


import java.net.*;
import java.io.*;

public class FormForData extends JPanel {

    public int port_number = 1778;
    private JTextField textFName, textMName, textLName, textPrefName, textHealthCareID, textBirthday, textAddress, textSex, textNationality, textReligion, textLanguage, textStatus, textDateofDischarge, textTimeOfDischarge;
    private JLabel patientFName, patientMName, patientLName, patientPrefName, healthcareID, birthday, address, sex, nationality, religion, firstLanguage, Status, datefDischarge, timeOfDischarge;

    private JScrollPane patientNames;
    private Button submitAdmission;
    private Button ClearButton;
    private GridBagLayout GBL;
    private String server_IP;
    private JComboBox day, month, year;

    final int space = 45;
    final int xspace = 145;
    final int prespace = 25;

    private String[] listOfMonths = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private String[] listOfDays = {"", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};

    FormForData() {
        //Self-Initialization
        setLayout(null);
        setBackground(Color.WHITE);
        setVisible(true);

        //MAKING JLABELS
        patientFName = new JLabel("First Name:");
        patientFName.setBounds(prespace, prespace, xspace, 20);
        add(patientFName);

        patientMName = new JLabel("Middle Name(s):");
        patientMName.setBounds(prespace, patientFName.getY() + space, xspace, 20);
        add(patientMName);

        patientLName = new JLabel("Last Name:");
        patientLName.setBounds(prespace, patientMName.getY() + space, xspace, 20);
        add(patientLName);

        patientPrefName = new JLabel("Preferred Name:");
        patientPrefName.setBounds(prespace, patientLName.getY() + space, xspace, 20);
        add(patientPrefName);

        healthcareID = new JLabel("Health Care ID:");
        healthcareID.setBounds(prespace, patientPrefName.getY() + space, xspace, 20);
        add(healthcareID);

        birthday = new JLabel("Birthday:");
        birthday.setBounds(prespace, healthcareID.getY() + space, xspace, 20);
        add(birthday);

        address = new JLabel("Address:");
        address.setBounds(prespace, birthday.getY() + space, xspace, 20);
        add(address);

        sex = new JLabel("Sex:");
        sex.setBounds(prespace, address.getY() + space, xspace, 20);
        add(sex);

        nationality = new JLabel("Nationality:");
        nationality.setBounds(prespace, sex.getY() + space, xspace, 20);
        add(nationality);

        religion = new JLabel("Religion:");
        religion.setBounds(prespace, nationality.getY() + space, xspace, 20);
        add(religion);

        firstLanguage = new JLabel("Language:");
        firstLanguage.setBounds(prespace, religion.getY() + space, xspace, 20);
        add(firstLanguage);

        Status = new JLabel("Status:");
        Status.setBounds(prespace, firstLanguage.getY() + space, xspace, 20);
        add(Status);

        datefDischarge = new JLabel("Date of Discharge:");
        datefDischarge.setBounds(prespace, Status.getY() + space, xspace, 20);
        add(datefDischarge);

        timeOfDischarge = new JLabel("Time of Discharge:");
        timeOfDischarge.setBounds(prespace, datefDischarge.getY() + space, xspace, 20);
        add(timeOfDischarge);


        //JTEXTFIELDS
        textFName = new JTextField();
        textFName.setBounds(patientFName.getWidth(), prespace, 700, 25);
        textFName.setVisible(true);
        add(textFName);

        textMName = new JTextField();
        textMName.setBounds(patientMName.getWidth(), textFName.getY() + space, 700, 25);
        textMName.setVisible(true);
        add(textMName);

        textLName = new JTextField();
        textLName.setBounds(patientLName.getWidth(), textMName.getY() + space, 700, 25);
        textLName.setVisible(true);
        add(textLName);

        textPrefName = new JTextField();
        textPrefName.setBounds(patientPrefName.getWidth(), textLName.getY() + space, 700, 25);
        textPrefName.setVisible(true);
        add(textPrefName);

        textHealthCareID = new JTextField();
        textHealthCareID.setBounds(healthcareID.getWidth(), textPrefName.getY() + space, 700, 25);
        textHealthCareID.setVisible(true);
        add(textHealthCareID);

        day = new JComboBox(listOfDays);
        month = new JComboBox(listOfMonths);

        day.setVisible(true);
        month.setVisible(true);

        day.setBounds(birthday.getWidth(), textHealthCareID.getY() + space, 225, 25);
        month.setBounds(day.getX() + day.getWidth(), textHealthCareID.getY() + space, 225, 25);

        add(day);
        add(month);

        textBirthday = new JTextField();
        textBirthday.setBounds(month.getX() + month.getWidth(), textHealthCareID.getY() + space, 250, 25);
        textBirthday.setVisible(true);
        add(textBirthday);

        textAddress = new JTextField();
        textAddress.setBounds(address.getWidth(), textBirthday.getY() + space, 700, 25);
        textAddress.setVisible(true);
        add(textAddress);

        textSex = new JTextField();
        textSex.setBounds(sex.getWidth(), textAddress.getY() + space, 700, 25);
        textSex.setVisible(true);
        add(textSex);

        textNationality = new JTextField();
        textNationality.setBounds(nationality.getWidth(), textSex.getY() + space, 700, 25);
        textNationality.setVisible(true);
        add(textNationality);

        textReligion = new JTextField();
        textReligion.setBounds(religion.getWidth(), textNationality.getY() + space, 700, 25);
        textReligion.setVisible(true);
        add(textReligion);

        textLanguage = new JTextField();
        textLanguage.setBounds(firstLanguage.getWidth(), textReligion.getY() + space, 700, 25);
        textLanguage.setVisible(true);
        add(textLanguage);

        textStatus = new JTextField();
        textStatus.setBounds(Status.getWidth(), textLanguage.getY() + space, 700, 25);
        textStatus.setVisible(true);
        add(textStatus);

        textDateofDischarge = new JTextField();
        textDateofDischarge.setBounds(datefDischarge.getWidth(), textStatus.getY() + space, 700, 25);
        textDateofDischarge.setVisible(true);
        add(textDateofDischarge);

        textTimeOfDischarge = new JTextField();
        textTimeOfDischarge.setBounds(timeOfDischarge.getWidth(), textDateofDischarge.getY() + space, 700, 25);
        textTimeOfDischarge.setVisible(true);
        add(textTimeOfDischarge);

        //Adding submit button
        submitAdmission = new Button();
//        submitAdmission.addMouseListener(new MouseListener() {
//
//            public void mouseClicked(MouseEvent e) {
//            }
//
//            public void mousePressed(MouseEvent e) {
//                //calcAge(birthday.getText());
//
//                send_to_server();
//                //System.out.println(getTimes());
//                clearTextBoxes();
//
//                //System.out.println(calcAge(birthday.getText()));
//                clearTextBoxes();
//            }
//
//            public void mouseReleased(MouseEvent e) {
//            }
//
//            public void mouseEntered(MouseEvent e) {
//            }
//
//            public void mouseExited(MouseEvent e) {
//            }
//        });

        //Adding Clear Button

        ClearButton = new Button();
        ClearButton.setText("Clear");
        ClearButton.setFont(new Font("questrial", Font.PLAIN, 15));
        ClearButton.setHorizontalAlignment(SwingConstants.CENTER);
        ClearButton.setVerticalAlignment(SwingConstants.CENTER);
        ClearButton.setForeground(Color.WHITE);
        ClearButton.setBounds(215, textTimeOfDischarge.getY() + 50, 300, 50);
        ClearButton.setBackground(Button.sblue);
//        ClearButton.addMouseListener(new MouseListener() {
//
//            public void mouseClicked(MouseEvent e) {
//            }
//
//            public void mousePressed(MouseEvent e) {
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                try {
//                    InetAddress iAddress = InetAddress.getLocalHost();
//                    server_IP = iAddress.getHostAddress();
//                    System.out.println("Server IP address : " + server_IP);
//                } catch (UnknownHostException a) {
//                }
//                clearTextBoxes();
//            }
//
//            public void mouseEntered(MouseEvent e) {
//            }
//
//            public void mouseExited(MouseEvent e) {
//            }
//        });

        add(ClearButton);

        submitAdmission.setBounds(ClearButton.getX() + 325, textTimeOfDischarge.getY() + 50, 300, 50);
        submitAdmission.setText("Submit");
        submitAdmission.setFont(new Font("questrial", Font.PLAIN, 15));
        submitAdmission.setHorizontalAlignment(SwingConstants.CENTER);
        submitAdmission.setVerticalAlignment(SwingConstants.CENTER);
        submitAdmission.setForeground(Color.WHITE);
        submitAdmission.setBackground(Button.sblue);
        submitAdmission.setVisible(true);
        add(submitAdmission);
    }

//    public void send_to_server() {
//
//        //Map to store  thehe tstrings
//        System.out.println("In server");
//        Map<String, String> patient_data_map = new HashMap<>();
//
//        patient_data_map.put("first_name", extract_string(textFName.getText()));
//        patient_data_map.put("middle_name", extract_string(textMName.getText()));
//        patient_data_map.put("last_name", extract_string(textLName.getText()));
//        patient_data_map.put("triage", "0");
//        patient_data_map.put("preferred_name", extract_string(textPrefName.getText())); //FIXME
//        patient_data_map.put("healthcare_id", extract_string(textHealthCareID.getText()));
//        patient_data_map.put("birthday", extract_string(textBirthday.getText()));      //TODO: Get age from birthday and add paramter
//        patient_data_map.put("address", extract_string(textAddress.getText()));
//        patient_data_map.put("sex", extract_string(textSex.getText()));
//        patient_data_map.put("nationality", extract_string(textNationality.getText()));
//        patient_data_map.put("religion", extract_string(textReligion.getText()));
//        patient_data_map.put("first_Language", extract_string(textNationality.getText()));
//        patient_data_map.put("status", extract_string(textStatus.getText()));
//        patient_data_map.put("birthday", extract_string(textBirthday.getText()));
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
//
//        public String extract_string (String field){
//            if (field.isEmpty()) {
//                return "N/A";
//            } else {
//                return field;
//            }
//        }

    /*InetAddress addr = null;
        try {
            addr = InetAddress.getByName("0.0.0.0");
        } catch (UnknownHostException h) {
            System.out.println("Bad adress");
        }

        try {
            //To send the JSON string
            cl = new sockets(addr, port_number);
            cl.send(jsonText);
            System.out.println("Sent message!");

        } catch (IOException e) {
            System.out.println("IO exception, chat");
        }
    }
*/
//
//        public String getTimes () {
//            Calendar timeReturn = Calendar.getInstance();
//            return timeReturn.getTime() + "";
//        }
//
//        public void clearTextBoxes () {
//
//            textFName.setText("");
//            textMName.setText("");
//            textLName.setText("");
//            textPrefName.setText("");
//            textHealthCareID.setText("");
//            textBirthday.setText("");
//
//            textAddress.setText("");
//            textSex.setText("");
//            textNationality.setText("");
//            textReligion.setText("");
//            textLanguage.setText("");
//            textStatus.setText("");
//            textDateofDischarge.setText("");
//            textTimeOfDischarge.setText("");
//        }
//    }
}
