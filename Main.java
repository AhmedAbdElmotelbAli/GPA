
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpaproject;

import static gpaproject.Student.print;
import java.util.Scanner;
import static javax.management.Query.and;
import static gpaproject.Student.isAlphabetic;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author SHEREF ZEDAN
 */
public class Main {

    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\SHEREF ZEDAN\\Downloads\\testcase\\testcase 24 BB.txt");
            if (!file.exists() || !file.isFile()) {
                throw new IllegalArgumentException("Invalid file path or name.");
            }
            String fileName = file.getName();
            String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
            if (!extension.equalsIgnoreCase("TXT")) {
                throw new IllegalArgumentException("File must have .TXT extension.");
            }

            FileDataProcessor dataParser = new FileDataProcessor(file.getPath());

            List<String> lines = dataParser.readFile();

            Subject subject = dataParser.parseSubject(lines.get(0));

            List<Student> students = dataParser.parseStudents(lines.subList(1, lines.size()));

            dataParser.writeOutputToFile(subject, students);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
