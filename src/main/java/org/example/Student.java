package org.example;

import java.util.List;

class Student{
    private String phone;
    private String fullName;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    Student(String fullName, String phone){
        this.fullName = fullName;
        this.phone = phone;
    }
}
