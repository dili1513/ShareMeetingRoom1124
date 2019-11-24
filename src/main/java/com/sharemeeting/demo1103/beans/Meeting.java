package com.sharemeeting.demo1103.beans;

public class Meeting {
    private int ID;
    private String Name;
    private String Sponsor;
    private String StartTime;
    private String EndTime;
    private int Headcount;
    private int Projector;
    private int Microphone;
    private String Status;//申请状态，为null或地点；
    private String UserID;//申请人ID,数据库中设varchar(30)；
    private String AdmName;
    private Integer RoomID;

    @Override
    public String toString() {
        return "Meeting{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Sponsor='" + Sponsor + '\'' +
                ", StartTime='" + StartTime + '\'' +
                ", EndTime='" + EndTime + '\'' +
                ", Headcount=" + Headcount +
                ", Projector=" + Projector +
                ", Microphone=" + Microphone +
                ", Status='" + Status + '\'' +
                ", UserID='" + UserID + '\'' +
                ", AdmName='" + AdmName + '\'' +
                ", RoomID=" + RoomID +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSponsor() {
        return Sponsor;
    }

    public void setSponsor(String sponsor) {
        Sponsor = sponsor;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public int getHeadcount() {
        return Headcount;
    }

    public void setHeadcount(int headcount) {
        Headcount = headcount;
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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getAdmName() {
        return AdmName;
    }

    public void setAdmName(String admName) {
        AdmName = admName;
    }

    public Integer getRoomID() {
        return RoomID;
    }

    public void setRoomID(Integer roomID) {
        RoomID = roomID;
    }
}
