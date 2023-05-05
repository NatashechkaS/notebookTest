package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentsDAOArrayListImpl {
    private List<Student> students;
    private List<Student> phone;

    public List<Student> getAllStudents(){
        List<Student> listOfStudents = new ArrayList<>();

        listOfStudents.add(new Student("Мицик Матвей Антонович", "+7910-875-37-24"));
        listOfStudents.add(new Student("Воронова Юлия Павловна", "+7913-675-33-34"));
        listOfStudents.add(new Student("Кузьмин Вячеслав Александрович", "+7912-888-11-11"));
        listOfStudents.add(new Student("Пашков Дмитрий Сергеевич", "+7920-999-32-22"));
        listOfStudents.add(new Student("Орлова Мария Васильевна", "+7980-600-30-10"));
        listOfStudents.add(new Student("Сусликов Иван Михайлович", "+7913-815-12-87"));

        this.students = listOfStudents;
        this.phone = listOfStudents;
        System.out.println("Все студенты из списка студнтов: ");
        for (var student: students) {
            System.out.println(student.getFullName());
        }


        return listOfStudents;
    }
}
