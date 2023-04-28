package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Выберите порядковый номер студента: ");
        System.out.println(getListOfStudents());
        Scanner console = new Scanner(System.in);
        String ch1 = "1";
        int x = 0;
        System.out.println("Для завершения вывода информации введите - stop");
        ArrayList<String> numbers = getPhones();
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
                System.out.println("Неверный формат данных! " + e.getMessage());
            }
        }
    }

    static String getPhoneNumber(ArrayList<String> phones, int i) {
        return phones.get(i);
    }

    static ArrayList<String> getPhones() {

        ArrayList<String> phones = new ArrayList<String>();
        phones.add("+7910-875-37-24");
        phones.add("+7910-357-29-54");
        phones.add("+7910-987-65-43");
        phones.add("+7915-967-65-41");
        phones.add("+7910-900-65-90");
        phones.add("+7910-777-65-65");

        return phones;
    }

    static ArrayList<String> getListOfStudents() {

        ArrayList<String> listOfStudents = new ArrayList<String>();

        listOfStudents.add("1. Мицик Матвей Антонович");
        listOfStudents.add("\n2. Воронова Юлия Павловна");
        listOfStudents.add("\n3. Кузьмин Вячеслав Александрович");
        listOfStudents.add("\n4. Пашков Дмитрий Сергеевич");
        listOfStudents.add("\n5. Орлова Мария Васильевна");
        listOfStudents.add("\n6. Сусликов Иван Михайлович");

        return listOfStudents;
    }

}