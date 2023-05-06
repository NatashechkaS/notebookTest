package org.example;

import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentsDAOArrayListImpl();
        System.out.println("Вывод информации о студентах");
        List<Student> allStudents = studentDAO.getAllStudents();
        for (int i = 0; i < allStudents.size(); i++) {
            System.out.println(i + ". " + allStudents.get(i).getFullName()); //индекс каждого студента выводится начиная с 0, так как в списке они хранятся начиная с 0 элемента. Если есть желание, то можно сделать вывод в привычном формате, начиная с 1
        }
        System.out.println("Введите id студента, номер телефона которого Вы хотите получить: ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        if (index < 0 || index > allStudents.size() - 1) { //проверка, на корректность данных
            throw new IllegalArgumentException("Ошибка, выход за границы списка!");
        }
        System.out.println("Телефон: " + allStudents.get(index).getPhone());
        System.out.println("Завершение работы...");
    }
}
