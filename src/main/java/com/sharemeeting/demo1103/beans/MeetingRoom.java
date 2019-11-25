package com.sharemeeting.demo1103.beans;

public class MeetingRoom {
    private int ID;
    private String Address;
    private String Name;
    private int Capacity;
    private int Projector;
    private int Microphone;
    private String Username;

    public String getAdmname() {
        return Admname;
    }

    public void setAdmname(String admname) {
        Admname = admname;
    }

    private String Admname;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public int getProjector() {
        return Projector;
    }

    public void setProjector(int projector) {
        Projector = projector;
    }

    public int getMicrophone() {
        return Microphone;
    }

    public void setMicrophone(int microphone) {
        Microphone = microphone;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }


}
