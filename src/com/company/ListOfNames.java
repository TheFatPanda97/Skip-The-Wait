package com.company;

import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Map;

public class ListOfNames extends JPanel {

//    public int port_number = 1778;
//    public String address = "0.0.0.0";
//    private JList list;
//    JScrollPane ScrollView = new JScrollPane();

    JLabel s = new JLabel();

    ListOfNames() {

        s.setText("Shawn Hu");
        s.setFont(new Font("questrial", Font.PLAIN, 15));


        add(s);

//        ArrayList<String[]> name_ids_arraylist =  populate_id_name();
//        String[] name_ids_array;
//        System.out.println(name_ids_arraylist.get(0)[0]);
//        System.out.println("hear");
//
//        String temp;
//        String[] PatientAndID = new String[name_ids_arraylist.size()];
//        for(int i = 0; i < name_ids_arraylist.size(); i++) {
//            name_ids_array = name_ids_arraylist.get(i);
//            temp = "Patient id: " + name_ids_array[0] + " Name: " + name_ids_array[1] + " " +  name_ids_array[2];
//            System.out.println(temp);
//            PatientAndID[i] = temp;
//           }

//        String[] PatientAndID = new String[2];
//
//        for (int i = 0; i < PatientAndID.length; i++){
//            PatientAndID[i] = "a";
//        }

//        list = new JList(PatientAndID);
//
//        list.addListSelectionListener(e -> {
//        });
//
//        ScrollView.setViewportView(list);
//        ScrollView.setVisible(true);
//        list.setPreferredSize(new Dimension(1300, 800));
//
//        add(ScrollView);
    }

    //Returns a list with the patient id and name, more can be added
//    public ArrayList<String[]> populate_id_name() {
//
//        ArrayList<String[]> patiet_data = new ArrayList<String[]>();
//
//        //Reqesut patient list, see patient_data still
//        JSONObject send_json_list_req = new JSONObject();
//        send_json_list_req.put("action", new java.lang.String("request_patients"));
//        send_json_list_req.put("id_number", new java.lang.String("-1"));
//
//        //Client connect
//        String jsonText = send_json_list_req.toString();
//        String json_response = "";
//
//        sockets cl = null;
//        //Initial connection
//        InetAddress addr = null;
//        try {
//            addr = InetAddress.getByName(address);
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
//            json_response = cl.recv();
//        }
//
//        catch (IOException e) {
//            System.out.println("IO exception, chat");
//        }
//
//    String[] patient_ids = cl.process_JSON_patient_list(json_response);
//
//
//    System.out.println("Here 1");
//    System.out.println(patient_ids[0]);
//
//    for (int i = 0; i < patient_ids.length; i++) {
//        String[] temp_hold = new String[3];   //TODO:However many parameters to add
//
//        Map<String, String> patient_data_map;
//
//        send_json_list_req = new JSONObject();
//        send_json_list_req.put("action", new java.lang.String("request_general"));
//        send_json_list_req.put("id_number", patient_ids[i]);
//        jsonText = send_json_list_req.toString();
//
//
//            //Try to send reqesut for specific patient info from id
//            try {
//                //To send the JSON string
//                cl = new sockets(addr, port_number);
//                cl.send(jsonText);
//                System.out.println("Sent message!");
//
//                json_response = cl.recv();
//            }
//
//            catch (IOException e) {
//                System.out.println("IO exception, chat");
//            }
//
//        System.out.println(json_response);
//
//            patient_data_map = cl.process_JSON_patient_general(json_response);  //Returns a map
//
//            System.out.println("json patien");
//            temp_hold[0] = patient_data_map.get("id_number");
//        System.out.println("AAAAAAAAAASAJSOJAOSJAOSJOAJSA");
//            System.out.println(temp_hold[0]);
//            temp_hold[1] = patient_data_map.get("first_name");
//            temp_hold[2] = patient_data_map.get("last_name");
//            patiet_data.add(temp_hold);
//
//        }
//        return patiet_data;
    }




