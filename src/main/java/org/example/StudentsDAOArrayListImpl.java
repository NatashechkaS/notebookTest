package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentsDAOArrayListImpl implements StudentDAO {
    private final List<Student> students;

    public List<Student> getAllStudents() {
        return students;
    }

    public StudentsDAOArrayListImpl() {
        this.students = initStudentList(); //Выносим код в отдельные методы, чтобы повысить читаемость кода
    }

    private List<Student> initStudentList() {
        List<Student> listOfStudents = new ArrayList<>();

        listOfStudents.add(new Student("Мицик Матвей Антонович", "+7910-875-37-24"));
        listOfStudents.add(new Student("Воронова Юлия Павловна", "+7913-675-33-34"));
        listOfStudents.add(new Student("Кузьмин Вячеслав Александрович", "+7912-888-11-11"));
        listOfStudents.add(new Student("Пашков Дмитрий Сергеевич", "+7920-999-32-22"));
        listOfStudents.add(new Student("Орлова Мария Васильевна", "+7980-600-30-10"));
        listOfStudents.add(new Student("Сусликов Иван Михайлович", "+7913-815-12-87"));
        return listOfStudents;
    }
}
