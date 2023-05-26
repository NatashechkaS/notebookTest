package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class StudentsDAOFileImpl implements StudentDAO {
    private File file;

    public StudentsDAOFileImpl(File file) {
        this.file = file;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try {

            for (String line: Files.readAllLines(file.toPath())) {
                students.add(convertStringToStudent(line));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    private Student convertStringToStudent( String line){
        String[] args = line.split(",");
        return new Student(args[0], args[1]);
    }


}
