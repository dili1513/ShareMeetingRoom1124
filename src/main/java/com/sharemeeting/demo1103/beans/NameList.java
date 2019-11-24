package com.sharemeeting.demo1103.beans;

public class NameList {
    private int ID;
    private String Name;
    private String Department;

    @Override
    public String toString() {
        return "NameList{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Department='" + Department + '\'' +
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

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
