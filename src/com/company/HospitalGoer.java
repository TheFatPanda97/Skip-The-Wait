package com.company;

public class HospitalGoer {
    String patientFName, patientMName, patientLName, patientPrefName, healthcareID, birthday, address, sex, nationality, religion, firstLanguage, status, datefDischarge, timeOfDischarge, height, weight, heartBeat, temperature, bloodType, bloodPressure, triage;

    HospitalGoer() {
    }

    HospitalGoer(String fName, String mName, String lName, String prefName, String ID, String bDay, String addr, String nice, String nation, String relig, String fLang, String stat, String dDisch, String tDisch, String h, String w, String hbpm, String temp, String bType, String bPressure, String vit, String nurse) {//Height, Weight, HeartBeat, Temp, BType, BPressure, Vitals, Triage;
        patientFName = fName;
        patientMName = mName;
        patientLName = lName;
        patientPrefName = prefName;
        healthcareID = ID; //Make -1
        birthday = bDay;
        address = addr;
        sex = nice;
        nationality = nation;
        religion = relig;
        firstLanguage = fLang;
        status = stat;
        datefDischarge = dDisch;
        timeOfDischarge = tDisch;
        height = h;
        weight = w;
        heartBeat = hbpm;
        temperature = temp;
        bloodType = bType;
        bloodPressure = bPressure;
        triage = nurse;
        //Height, Weight, HeartBeat, Temp, BType, BPressure, Vitals, Triage;




    }

}
