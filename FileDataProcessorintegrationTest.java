/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

/**
 *
 * @author SHEREF ZEDAN
 */
import org.junit.jupiter.api.*;
import java.io.*;
import java.util.*;
import gpaproject.FileDataProcessor;
import gpaproject.Student;
import gpaproject.Subject;
import org.junit.Test;
import static org.junit.Assert.*;

public class FileDataProcessorintegrationTest {
    

    private final String testDataFile = "C:\\Users\\SHEREF ZEDAN\\Downloads\\testcase\\testdata.txt";
    private final String outputDataFile = "output.txt";
// This test checks if the parseSubject method in the FileDataProcessor class can correctly parse a subject string

    
    @Test
    public void testParseSubject() {
        // Create a new instance of FileDataProcessor with a test data file
        FileDataProcessor dataProcessor = new FileDataProcessor(testDataFile);

        // Call the parseSubject method with a subject string and store the resulting Subject object
        Subject subject = dataProcessor.parseSubject("Math,MAT101,100");

        // Assert that the name, code, and full mark of the Subject object match the expected values
        assertEquals("Math", subject.getName());
        assertEquals("MAT101", subject.getCode());
        assertEquals(100, subject.getFullMark());
    }

    // This test checks if the readFile method in the FileDataProcessor class can correctly read a file and return a list of its lines
    @Test
    public void testReadFile() throws IOException {
        // Create a new instance of FileDataProcessor with a test data file
        FileDataProcessor dataProcessor = new FileDataProcessor(testDataFile);

        // Call the readFile method and store the resulting list of lines
        List<String> inputLines = dataProcessor.readFile();

        // Assert that the number of lines matches the expected value and that each line matches the expected content
        assertEquals(3, inputLines.size());
        assertEquals("Math,MATH101,100", inputLines.get(0));
        assertEquals("John,12345678,10,10,20,40", inputLines.get(1));
        assertEquals("Jane,23456789,8,9,20,55", inputLines.get(2));
    }

// This test checks if the parseStudents method in the FileDataProcessor class can correctly parse a list of student strings
    @Test
    public void testParseStudents() {
        // Create a new instance of FileDataProcessor with a test data file
        FileDataProcessor dataProcessor = new FileDataProcessor(testDataFile);

        // Create a list of student strings and call the parseStudents method with it, storing the resulting list of Student objects
        List<String> inputLines = Arrays.asList("John,12345678,10,10,18,50", "Jane,23456789,8,10,10,60");
        List<Student> students = dataProcessor.parseStudents(inputLines);

        // Assert that the number of students matches the expected value and that each student's attributes match the expected values
        assertEquals(2, students.size());
        assertEquals("John", students.get(0).getName());
        assertEquals("12345678", students.get(0).getNumber());
        assertEquals(10, students.get(0).getActivitiesMark());
        assertEquals(10, students.get(0).getOralMark());
        assertEquals(18, students.get(0).getMidtermMark());
        assertEquals(50, students.get(0).getFinalMark());
        assertEquals("Jane", students.get(1).getName());
        assertEquals("23456789", students.get(1).getNumber());
        assertEquals(8, students.get(1).getActivitiesMark());
        assertEquals(10, students.get(1).getOralMark());
        assertEquals(10, students.get(1).getMidtermMark());
        assertEquals(60, students.get(1).getFinalMark());
    }

    // This test checks if the writeOutputToFile method in the FileDataProcessor class can correctly write a subject and list of students to a file
    @Test
    public void testWriteOutputToFile() throws IOException {
        // Create a new instance of FileDataProcessor with a test data file
        FileDataProcessor dataProcessor = new FileDataProcessor(testDataFile);

        // Create a subject and list of students and call the writeOutputToFile method with them
        Subject subject = new Subject("Math", "MAT101", 100);
        List<Student> students = Arrays.asList(new Student("John", "12345678", 10, 10, 18, 50),
                new Student("Jane", "23456789", 10, 10, 10, 60));
        dataProcessor.writeOutputToFile(subject, students);

        // Assert that the output file was created and contains the expected content
        File outputFile = new File(outputDataFile);
        assertTrue(outputFile.exists());
        try ( BufferedReader reader = new BufferedReader(new FileReader(outputFile))) {
            assertEquals("Subject: Math (MAT101)", reader.readLine());
            assertEquals("Full mark: 100", reader.readLine());
            assertEquals("Number of students: 2", reader.readLine());
            assertEquals("--------------------------------------------------", reader.readLine());
            assertEquals("Student name: John", reader.readLine());
            assertEquals("Student number: 12345678", reader.readLine());
            assertEquals("Activities mark: 10", reader.readLine());
            assertEquals("Oral mark: 10", reader.readLine());
            assertEquals("Midterm mark: 18", reader.readLine());
            assertEquals("Final mark: 50", reader.readLine());
            assertEquals("Letter grade: B+", reader.readLine());
            assertEquals("--------------------------------------------------", reader.readLine());
            assertEquals("Student name: Jane", reader.readLine());
            assertEquals("Student number: 23456789", reader.readLine());
            assertEquals("Activities mark: 10", reader.readLine());
            assertEquals("Oral mark: 10", reader.readLine());
            assertEquals("Midterm mark: 10", reader.readLine());
            assertEquals("Final mark: 60", reader.readLine());
            assertEquals("Letter grade: A-", reader.readLine());
            assertEquals("--------------------------------------------------", reader.readLine());
            assertEquals(null, reader.readLine());
        }
        outputFile.delete();
    }

    // This test checks if the writeOutputToFile method in the FileDataProcessor class can successfully create an output file
    @Test
    public void testOutputFileExists() throws IOException {
        // Create a new instance of FileDataProcessor with a test data file
        FileDataProcessor dataProcessor = new FileDataProcessor(testDataFile);

        // Create a subject and list of students and call the writeOutputToFile method with them
        Subject subject = new Subject("Math", "MAT101", 100);
        List<Student> students = Arrays.asList(new Student("John", "12345678", 10, 10, 18, 50),
                new Student("Jane", "23456789", 10, 10, 10, 60));
        dataProcessor.writeOutputToFile(subject, students);

        // Assert that the output file was created
        File outputFile = new File(outputDataFile);
        assertTrue(outputFile.exists());

        // Delete the output file to clean up after the test
        outputFile.delete();
    }

    // This test checks if the writeOutputToFile method in the FileDataProcessor class correctly writes the subject information to the output file
    @Test
    public void testOutputFileContainsSubjectInfo() throws IOException {
        // Create a new instance of FileDataProcessor with a test data file
        FileDataProcessor dataProcessor = new FileDataProcessor(testDataFile);

        // Create a subject and list of students and call the writeOutputToFile method with them
        Subject subject = new Subject("Math", "MAT101", 100);
        List<Student> students = Arrays.asList(new Student("John", "12345678", 10, 10, 18, 50),
                new Student("Jane", "23456789", 10, 10, 10, 60));
        dataProcessor.writeOutputToFile(subject, students);

        // Assert that the output file contains the expected subject information
        try ( BufferedReader reader = new BufferedReader(new FileReader(outputDataFile))) {
            assertEquals("Subject: Math (MAT101)", reader.readLine());
            assertEquals("Full mark: 100", reader.readLine());
        }

        // Delete the output file to clean up after the test
        new File(outputDataFile).delete();
    }

// This test checks if the writeOutputToFile method in the FileDataProcessor class correctly writes the student information to the output file
    @Test
    public void testOutputFileContainsStudentInfo() throws IOException {
        // Create a new instance of FileDataProcessor with a test data file
        FileDataProcessor dataProcessor = new FileDataProcessor(testDataFile);

        // Create a subject and list of students and call the writeOutputToFile method with them
        Subject subject = new Subject("Math", "MAT101", 100);
        List<Student> students = Arrays.asList(new Student("John", "12345678", 10, 10, 18, 50),
                new Student("Jane", "23456789", 10, 10, 10, 60));
        dataProcessor.writeOutputToFile(subject, students);

        // Assert that the output file contains the expected student information
        try ( BufferedReader reader = new BufferedReader(new FileReader(outputDataFile))) {
            reader.readLine(); // skip subject info
            reader.readLine(); // skip full mark
            reader.readLine(); // skip number of students
            reader.readLine(); // skip separator
            assertEquals("Student name: John", reader.readLine());
            assertEquals("Student number: 12345678", reader.readLine());
            assertEquals("Activities mark: 10", reader.readLine());
            assertEquals("Oral mark: 10", reader.readLine());
            assertEquals("Midterm mark: 18", reader.readLine());
            assertEquals("Final mark: 50", reader.readLine());
            assertEquals("Letter grade: B+", reader.readLine());
            assertEquals("--------------------------------------------------", reader.readLine());
            assertEquals("Student name: Jane", reader.readLine());
            assertEquals("Student number: 23456789", reader.readLine());
            assertEquals("Activities mark: 10", reader.readLine());
            assertEquals("Oral mark: 10", reader.readLine());
            assertEquals("Midterm mark: 10", reader.readLine());
            assertEquals("Final mark: 60", reader.readLine());
            assertEquals("Letter grade: A-", reader.readLine());
        }

        // Delete the output file to clean up after the test
        new File(outputDataFile).delete();
    }

    // This test checks if the parseSubject method in the FileDataProcessor class throws a NumberFormatException when given invalid input
    @Test
    public void testParseSubjectInvalidInput() {
        // Create a new instance of FileDataProcessor with a test data file
        FileDataProcessor dataProcessor = new FileDataProcessor(testDataFile);

        // Assert that a NumberFormatException is thrown when calling parseSubject with invalid input
        assertThrows(NumberFormatException.class, () -> dataProcessor.parseSubject("Math,MAT101,abc"));
    }
       // This test checks if the parseSubject method in the FileDataProcessor class throws a NumberFormatException when given invalid input
 

    // This test checks if the readFile method in the FileDataProcessor class throws a FileNotFoundException when given an invalid file path
    @Test
    public void testReadFileInvalidPath() {
        // Create a new instance of FileDataProcessor with an invalid file path
        FileDataProcessor dataProcessor = new FileDataProcessor("invalidpath.txt");

        // Assert that a FileNotFoundException is thrown when calling readFile with an invalid file path
        assertThrows(FileNotFoundException.class, () -> dataProcessor.readFile());
    }
}
