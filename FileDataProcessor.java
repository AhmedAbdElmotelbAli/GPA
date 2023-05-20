/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpaproject;

/**
 *
 * @author SHEREF ZEDAN
 */

import java.io.BufferedReader;
import gpaproject.Subject;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import  gpaproject.Student;



public class FileDataProcessor {
	private String datafile;

    public FileDataProcessor(String datafile) {
        this.datafile = datafile;
    }
	
    public Subject parseSubject(String line) {
        String[] fields = line.split(",");
        String name = fields[0];
        String code = fields[1];
        int fullMark = Integer.parseInt(fields[2]);
        return new Subject(name, code, fullMark);
    }
    
    public List<String> readFile() throws IOException {
        File file = new File(datafile);
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    public List<Student> parseStudents(List<String> lines) {
        List<Student> students = new ArrayList<>();
        for (String line : lines) {
            String[] fields = line.split(",");
            String name = fields[0];
            String number = fields[1];
            int activitiesMark = Integer.parseInt(fields[2]);
            int oralMark = Integer.parseInt(fields[3]);
            int midtermMark = Integer.parseInt(fields[4]);
            int finalMark = Integer.parseInt(fields[5]);
            students.add(new Student(name, number, activitiesMark, oralMark, midtermMark,finalMark));
			}
				 return students;
		 }
    
    
    public void writeOutputToFile(Subject subject, List<Student> students) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Subject: " + subject.getName()+ " (" + subject.getCode() + ")\n");
            writer.write("Full mark: " + subject.getFullMark() + "\n");
            writer.write("Number of students: " + students.size() + "\n");
            writer.write("--------------------------------------------------\n");
            for (Student student : students) {
                writer.write("Student name: " + student.getName() + "\n");
                writer.write("Student number: " + student.getNumber() + "\n");
                writer.write("Activities mark: " + student.getActivitiesMark() + "\n");
                writer.write("Oral mark: " + student.getOralMark() + "\n");
                writer.write("Midterm mark: " + student.getMidtermMark() + "\n");
                writer.write("Final mark: " + student.getFinalMark() + "\n");
                String letterGrade = student.getLetterGrade();
                writer.write("Letter grade: " + letterGrade + "\n");
                writer.write("--------------------------------------------------\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}