/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpaproject;

import static gpaproject.Student.print;
import java.util.Scanner;
import static javax.management.Query.and;
import static gpaproject.Student.isAlphabetic;
import static gpaproject.Subject.isValidName;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author SHEREF ZEDAN
 */
public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of students:");
//        int numStudents = scanner.nextInt();
//
//        String[] studentNames = new String[numStudents];
//        String[] studentNumbers = new String[numStudents];
//        int[] oralMarks = new int[numStudents];
//        int[] activitiesMarks = new int[numStudents];
//        int[] midtermMarks = new int[numStudents];
//        int[] finalMarks = new int[numStudents];
//        String SubjectCode = null;
//        String Subject = null;
//        System.out.println("Enter name of Subject :");
//        scanner.nextLine();
//        Subject = scanner.nextLine();
//        if (Subject.isEmpty() && !isAlphabetic(Subject)) {
//            System.out.println("Error: name cannot be empty.");
//
//        }
//        System.out.println("Enter name of Subject code :");
//        SubjectCode = scanner.nextLine();
//        boolean x = isValidName(SubjectCode);
//        while (!x) {
//            x = true;
//
//            int i = 0;
//            System.out.println("Error: subject code cannot be empty or not writing correct ");
//            i++; // retry input for this student
//            System.out.println("Enter name of Subject code :");
//            SubjectCode = scanner.nextLine();
//            x = isValidName(SubjectCode);
//            continue;
//        }
//
//        for (int i = 0; i < numStudents; i++) {
//            System.out.println("Enter name of student " + (i + 1) + ":");
//            String name = scanner.nextLine();
//            if (name.isEmpty() && !isAlphabetic(name)) {
//                System.out.println("Error: name cannot be empty.");
//                i--; // retry input for this student
//                continue;
//            }
//            studentNames[i] = name;
//
//            System.out.println("Enter student number for " + name + ":");
//            String number = scanner.nextLine();
//            if (number.isEmpty()) {
//                System.out.println("Error: number cannot be empty.");
//                i--;
//                continue;
//            }
//            studentNumbers[i] = number;
//
//            System.out.println("Enter activities mark for " + name + ":");
//            int activitiesMark = scanner.nextInt();
//            if (activitiesMark < 0 || activitiesMark > 10) {
//                System.out.println("Error: mark must be between 0 and 100.");
//                i--;
//                continue;
//            }
//            activitiesMarks[i] = activitiesMark;
//
//            System.out.println("Enter oral mark for " + name + ":");
//            int oralMark = scanner.nextInt();
//            if (oralMark < 0 || oralMark > 10) {
//                System.out.println("Error: mark must be between 0 and 100.");
//                i--;
//                continue;
//            }
//            oralMarks[i] = oralMark;
//
//            System.out.println("Enter midterm mark for " + name + ":");
//            int midtermMark = scanner.nextInt();
//            if (midtermMark < 0 || midtermMark > 20) {
//                System.out.println("Error: mark must be between 0 and 100.");
//                i--;
//                continue;
//            }
//            midtermMarks[i] = midtermMark;
//
//            System.out.println("Enter final mark for " + name + ":");
//            int finalMark = scanner.nextInt();
//            if (finalMark < 0 || finalMark > 100) {
//                System.out.println("err");
//                i--;
//                continue;
//            }
//            finalMarks[i] = finalMark;
//
//        }
//
//        Student[] students = new Student[numStudents];
//        print(students, numStudents, studentNames, studentNumbers, activitiesMarks, oralMarks, midtermMarks, finalMarks, Subject, SubjectCode);
//
//    }
    try {

            FileDataProcessor dataParser = new FileDataProcessor("C:\\Users\\SHEREF ZEDAN\\Downloads\\input.txt");


            List<String> lines = dataParser.readFile();

            Subject subject = dataParser.parseSubject(lines.get(0));

            List<Student> students = dataParser.parseStudents(lines.subList(1, lines.size()));

            dataParser.writeOutputToFile(subject, students);

			
            
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

}
