/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpaproject;

import gpaproject.Subject;
import java.util.Scanner;

/**
 *
 * @author SHEREF ZEDAN
 */
public class Student {

    private String name;
    private String number;
    private int activitiesMark;
    private int oralMark;
    private int midtermMark;
    private int finalMark;
    int maxActiveOrOralMark = 10;
    int maxMidtermMark = 20;
    int maxFinalMark = 60;
    int minMark = 0;

    public Student() {
    }

    public Student(String name, String number, int activitiesMark, int oralMark, int midtermMark, int finalMark) throws IllegalArgumentException {
        // Call the setter methods to assign the values to the variables
        setName(name);
        setNumber(number);
        setActivitiesMark(activitiesMark);
        setOralMark(oralMark);
        setMidtermMark(midtermMark);
        setFinalMark(finalMark);
    }

    public boolean validateStudentNumber() {
        return number.matches("^[a-zA-Z0-9]*$");
    }

    public static boolean isAlphabetic(String name) {
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean validateActivitiesMark() {
        return activitiesMark >= minMark && activitiesMark <= maxActiveOrOralMark;
    }

    public boolean validateOralMark() {
        return oralMark >= minMark && oralMark <= maxActiveOrOralMark;
    }

    public boolean validateMidtermMark() {
        return midtermMark >= minMark && midtermMark <= maxMidtermMark;
    }

    public boolean validateFinalMark() {
        return finalMark >= minMark && finalMark <= maxFinalMark;
    }

    public String getName() {

        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getActivitiesMark() {
        return activitiesMark;
    }

    public int getOralMark() {
        return oralMark;
    }

    public int getMidtermMark() {
        return midtermMark;
    }

    public int getFinalMark() {
        return finalMark;
    }

    private void validateParameter(String name, int value, int min, int max) throws IllegalArgumentException {
        // Check if the value is between min and max
        if (value < min || value > max) {
            throw new IllegalArgumentException("Invalid " + name + ": " + name + " must be between " + min + " and " + max + ".");
        }
    }

    // Setter method for student name
    public void setName(String name) throws IllegalArgumentException {
        // Check if the name is null or empty
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid name: Name cannot be null or empty.");
        }
        // Check if the name starts with a space
        if (name.charAt(0) == ' ') {
            throw new IllegalArgumentException("Invalid name: Name cannot start with a space.");
        }
        // Check if the name contains only alphabetic characters and spaces
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!Character.isLetter(c) && c != ' ') {
                throw new IllegalArgumentException("Invalid name: Name can only contain alphabetic characters and spaces.");
            }
        }
        // If all checks pass, assign the name to the variable
        this.name = name;
    }

    // Setter method for student number
    public void setNumber(String number) throws IllegalArgumentException {
        // Check if the number is null or empty
        if (number == null || number.isEmpty()) {
            throw new IllegalArgumentException("Invalid number: Number cannot be null or empty.");
        }
        // Check if the number has exactly 8 characters
        if (number.length() != 8) {
            throw new IllegalArgumentException("Invalid number: Number must have exactly 8 characters");
        }
        // Check if the first 7 characters are digits
        for (int i = 0; i < 7; i++) {
            char c = number.charAt(i);
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Invalid number: Number must start with digits.");
            }
            this.number = number;
        }
    }
    // Setter method for student activities mark

    public void setActivitiesMark(int activitiesMark) throws IllegalArgumentException {

        validateParameter("activities mark", activitiesMark, 0, 10);

        this.activitiesMark = activitiesMark;
    }

    // Setter method for student oral/practical mark
    public void setOralMark(int oralMark) throws IllegalArgumentException {

        validateParameter("oral mark", oralMark, 0, 10);

        this.oralMark = oralMark;
    }

    public void setMidtermMark(int midtermMark) throws IllegalArgumentException {

        validateParameter("midterm mark", midtermMark, 0, 20);

        this.midtermMark = midtermMark;
    }

    public void setFinalMark(int finalMark) throws IllegalArgumentException {

        validateParameter("final mark", finalMark, 0, 60);

        this.finalMark = finalMark;
    }

    public static void print(Student[] student, int numStudents, String[] studentNames, String[] studentNumbers, int[] oralMarks, int[] activitiesMarks, int[] midtermMarks, int[] finalMarks, String name, String code) {
        int n = numStudents;
        Subject x = new Subject(name, code, 100);

        for (int i = 0; i < n; i++) {

            student[i] = new Student(studentNames[i], studentNumbers[i], activitiesMarks[i], oralMarks[i], midtermMarks[i], finalMarks[i]);
            System.out.println(x.getName() + ": \t" + x.getCode() + "\n" + studentNames[i] + ": \t" + student[i].getLetterGrade());
        }

        System.out.println("Do you want details about student ");
        Scanner scanner = new Scanner(System.in);
        String details = scanner.nextLine();

        if (details.matches("yes") || details.matches("Yes")) {
            System.out.println("name\t number");
            for (int i = 0; i < n; i++) {
                System.out.println(studentNames[i] + "\t" + studentNumbers[i]);
            }
        }
        if (details.matches("no") || details.matches("No")) {
            System.out.println("thanks");
        } else if (!((details.matches("yes") || details.matches("Yes")) && (details.matches("no") || details.matches("No")))) {
            System.out.println("err");
        }

        System.out.println("Do you want details about degree ");
        String details2 = scanner.nextLine();
        if (details2.matches("yes") || details2.matches("Yes")) {
            System.out.println("SubjectName: \t" + "SubjectCodet\t" + "activitiesMarks\t" + " oralMarks\t" + "midtermMarks\t" + "finalMarks");

            for (int i = 0; i < n; i++) {

                System.out.println(x.getName() + ": \t\t" + x.getCode() + "\t\t" + activitiesMarks[i] + "\t\t  " + oralMarks[i] + "\t\t" + midtermMarks[i] + "\t\t" + finalMarks[i]);
            }
        } else if (details2.matches("no") || details2.matches("NO")) {
            System.out.println("thanks");
        } else if (!((details2.matches("yes") || details2.matches("Yes")) && (details2.matches("no") || details2.matches("No")))) {
            System.out.println("err");
        }
    }

    public String getLetterGrade() {
        GPACalculator calculator = new GPACalculator();
        return calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
    }

}
