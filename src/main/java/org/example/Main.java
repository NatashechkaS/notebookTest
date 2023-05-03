package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Выберите порядковый номер студента: ");
        // System.out.println(getListOfStudents());
        Student b1 = new Student();
        b1.getAllStudents();
        Scanner console = new Scanner(System.in);
        String ch1 = "1";
        int x = 0;
        System.out.println("Для завершения вывода информации введите - stop");
        String[] numbers = getPhones();
        while (true) {
            try {
                ch1 = console.nextLine();
                if (ch1.equals("stop")) {
                    System.out.println("Завершение работы...");
                    break;
                }
                x = Integer.parseInt(ch1);
                System.out.println(getPhoneNumber(numbers, x - 1));

            } catch (Exception e) {
                System.out.println("Неверный формат данных!" + e.getMessage());
            }
        }
    }

    static String getPhoneNumber(String[] phones, int i) {
        return (phones[i]);
    }

    static String[] getPhones() {

        String[] phones = new String[6];
        phones[0] = "+7910-875-37-24";
        phones[1] = "+7910-357-29-54";
        phones[2] = "+7910-987-65-43";
        phones[3] = "+7915-967-65-41";
        phones[4] = "+7910-900-65-90";
        phones[5] = "+7910-777-65-65";

        return phones;
    }

    static ArrayList<String> getListOfStudents() {

        ArrayList<String> listOfStudents = new ArrayList<String>();

        listOfStudents.add("Мицик Матвей Антонович");
        listOfStudents.add("Воронова Юлия Павловна");
        listOfStudents.add("Кузьмин Вячеслав Александрович");
        listOfStudents.add("Пашков Дмитрий Сергеевич");
        listOfStudents.add("Орлова Мария Васильевна");
        listOfStudents.add("Сусликов Иван Михайлович");

        return listOfStudents;
    }
}

interface StudentDAO {
    void getAllStudents();
}

class Student implements StudentDAO {
    private String phone;
    private String fullName;

    String getFullName() {
        return fullName;
    }

    Student() {
        fullName = Main.getListOfStudents().toString();
    }
    public void getAllStudents() {
        System.out.println(fullName);
    }
}