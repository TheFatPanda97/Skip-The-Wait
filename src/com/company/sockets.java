package com.company;

import java.net.*;
import java.io.*;
import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;

import org.json.*;


public class sockets {

    private Socket socket = null;
    private FileOutputStream fos = null;
    private DataInputStream din = null;
    private PrintStream pout = null;
    private Scanner scan = null;


    public sockets(InetAddress address, int port) throws IOException
    {
        System.out.println("Initializing Client");
        socket = new Socket(address, port);
        System.out.println("Initilized Client");
        scan = new Scanner(System.in);
        din = new DataInputStream(socket.getInputStream());
        pout = new PrintStream(socket.getOutputStream());
    }

    public void send(String msg) throws IOException
    {
        pout.print(msg);
        pout.flush();
    }

    public String recv() throws IOException
    {
        byte[] bytes = new byte[1024];
        din.read(bytes);

        String reply = new String(bytes, "UTF-8");
        reply = reply.trim();
        return reply;
    }

    public void closeConnections() throws IOException
    {
        // Clean up when a connection is ended
        socket.close();
        din.close();
        pout.close();
        scan.close();
    }

    public void chat() throws IOException
    {
        String response = "s";

        System.out.println("Initiating Chat Sequence");
        while(!response.equals("QUIT")){
            System.out.print("Client: ");
            String message = scan.nextLine();
            send(message);
            if(message.equals("QUIT"))
                break;
            response = recv();

            System.out.println("Message Recived");
//            String name = process_JSON_key(response, "name");
//            String triage = process_JSON_key(response, "triage");
//            System.out.println("Name: " + name);
//            System.out.println("Triage: " + triage);

        }
        closeConnections();
    }


//    //Method to take a JSON string and reutrn the exracted data in a  map
//    //https://stackoverflow.com/questions/14788002/sending-a-json-object-over-tcp-with-java
//    public Map<String,String> process_JSON_patient_data(String json_string) {
//
//        JSONObject json_dict = new JSONObject(json_string);
//        JSONArray data = json_dict.getJSONArray("patient_data");     //Extract the sent data string
//
//        String[] datastring = new String[data.length()];
//        if (data != null) {
//            for (int i = 0; i < data.length(); i++) {
//                datastring[i] = data.getString(i);
//            }
//        }
//
//
//        String[] patient_data_keys = {"name", "last_name", "triage"};
//
//        Map<String,String> patient_data_map = new HashMap<>();
//        if(patient_data_keys.length == datastring.length){
//            for(int index = 0; index < patient_data_keys.length; index++){
//                patient_data_map.put(patient_data_keys[index], datastring[index]);
//            }
//        }
//
//        return patient_data_map;
//    }

    ////TODO:Add proper keys, and make representation of entire queue with hash map
    //Method to take a JSON string and reutrn the exracted data in a  map
    //https://stackoverflow.com/questions/14788002/sending-a-json-object-over-tcp-with-java
    public Map<String,String> process_JSON_patient_general(String json_string) {

        JSONObject json_dict = new JSONObject(json_string);
        JSONArray data = json_dict.getJSONArray("patient_data");     //Extract the sent data string

        String[] datastring = new String[data.length()];
        if (data != null) {
            for (int i = 0; i < data.length(); i++) {
                datastring[i] = data.getString(i);
            }
        }

        String[] patient_data_keys = {"id_number", "first_name", "middle_name", "last_name", "preferred_name", "sex", "birthday", "age", "time_of_discharge"};
        Map<String,String> patient_data_map = new HashMap<>();
        System.out.println("Any will2i");
        if(patient_data_keys.length == datastring.length){

            System.out.println("");
            for(int index = 0; index < patient_data_keys.length; index++){
                patient_data_map.put(patient_data_keys[index], datastring[index]);

                System.out.println("Any wil2li");
                System.out.println(patient_data_keys[index]);
//                System.out.println(patient_data_map.get(patient_data_keys[index]));
            }
        }

        System.out.println("Returning" + patient_data_map.get("id_number"));
        return patient_data_map;
    }

    ////TODO:Add proper keys, and make representation of entire queue with hash map
    //Method to take a JSON string and reutrn the exracted data in a  map
    //https://stackoverflow.com/questions/14788002/sending-a-json-object-over-tcp-with-java
    public Map<String,String> process_JSON_patient_medical(String json_string) {

        JSONObject json_dict = new JSONObject(json_string);
        JSONArray data = json_dict.getJSONArray("patient_data");     //Extract the sent data string

        String[] datastring = new String[data.length()];
        if (data != null) {
            for (int i = 0; i < data.length(); i++) {
                datastring[i] = data.getString(i);
            }
        }

        //TODO:Add proper keys
        String[] patient_data_keys = {"id_number", "first_name", "middle_name", "last_name", "triage", "sex", "age", "date_admission", "nationality", "religion"};

        Map<String,String> patient_data_map = new HashMap<>();
        if(patient_data_keys.length == datastring.length){
            System.out.println("uiopoo");
            for(int index = 0; index < patient_data_keys.length; index++){
                patient_data_map.put(patient_data_keys[index], datastring[index]);
            }
        }

        return patient_data_map;
    }

    //Method returns an array
    public String[] process_JSON_patient_list(String json_string) {

        JSONObject json_dict = new JSONObject(json_string);
        JSONArray data = json_dict.getJSONArray("patient_data");     //Extract the sent data string

        String[] datastring = new String[data.length()];
        if (data != null) {
            for (int i = 0; i < data.length(); i++) {
                datastring[i] = data.getString(i);
            }
        }

        return datastring;
    }

    // Request a specific file from the server
    //Make it able to work with patient object
    public void getFile(String filename)
    {
        System.out.println("Requested File: "+filename);
        try {
            File file = new File(filename);
            // Create new file if it does not exist
            // Then request the file from server
            if(!file.exists()){
                file.createNewFile();
                System.out.println("Created New File: "+filename);
            }
            fos = new FileOutputStream(file);
            send(filename);

            // Get content in bytes and write to a file
            byte[] buffer = new byte[8192];
            for(int counter=0; (counter = din.read(buffer, 0, buffer.length)) >= 0;)
            {
                fos.write(buffer, 0, counter);
            }
            fos.flush();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
