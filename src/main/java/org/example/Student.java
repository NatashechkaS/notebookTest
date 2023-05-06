package org.example;

class Student {
    private String phone; //переменные должны быть приватными всегда, за исключением случаев, когда необходимо иметь публичный доступ
    private String fullName; //переменные должны быть приватными всегда, за исключением случаев, когда необходимо иметь публичный доступ

    public Student(String fullName, String phone) { //конструктор должен находиться после переменных, для повышения читаемости кода
        this.fullName = fullName;
        this.phone = phone;
    }

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
}
