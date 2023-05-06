package org.example;

import java.util.List;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {


        // System.out.println(getListOfStudents());
        var sDAL = new StudentsDAOArrayListImpl();
        sDAL.getAllStudents();
        System.out.println(sDAL);
        System.out.println("Выберите порядковый номер студента: ");
        Scanner console = new Scanner(System.in);
        String ch1 = "1";
        int x = 0;
        System.out.println("Для завершения вывода информации введите - stop");
        List<Student> numbers = sDAL.getAllStudents();   // тут тупик
        while (true) {
            try {
                ch1 = console.nextLine();
                if (ch1.equals("stop")) {
                    System.out.println("Завершение работы...");
                    break;
                }
                x = Integer.parseInt(ch1);
                System.out.println(sDAL);
            } catch (Exception e) {
                System.out.println("Неверный формат данных!" + e.getMessage());
            }
        }
    }

}
