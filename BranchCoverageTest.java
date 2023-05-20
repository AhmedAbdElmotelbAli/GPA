/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
    
import gpaproject.FileDataProcessor;
import gpaproject.Student;
import gpaproject.Subject;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

/**
 *
 * @author SHEREF ZEDAN
 */
public class BranchCoverageTest {
    private Subject subject;
    private List<Student> students;

    @Before
    public void setUp() {
        subject = new Subject("Math", "MAT101", 100);
        students = new ArrayList<>();
        students.add(new Student("John Doe", "12345678", 10, 10, 19, 40));
        students.add(new Student("Jane Smith", "67890541", 10, 10, 18, 50));
    }


    @Test
    public void testWriteOutputToFile() {
        // Create an instance of FileDataProcessor with a test data file
        FileDataProcessor obj = new FileDataProcessor("C:\\Users\\SHEREF ZEDAN\\Downloads\\testcase\\testdata.txt");
        
        // Call the writeOutputToFile method with a subject and a list of students
        obj.writeOutputToFile(subject, students);
        
        // Check if the output file was created
        File file = new File("output.txt");
        assertTrue(file.exists());

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            // Read the first line and check if it matches the subject's name and code
            String line = reader.readLine();
            assertEquals("Subject: Math (MAT101)", line);
            
            // Read the second line and check if it matches the subject's full mark
            line = reader.readLine();
            assertEquals("Full mark: 100", line);
            
            // Read the third line and check if it matches the number of students in the list
            line = reader.readLine();
            assertEquals("Number of students: 2", line);
            
            // Read the fourth line and check if it is the separator line
            line = reader.readLine();
            assertEquals("--------------------------------------------------", line);
            
            // Read the next few lines for the first student and check if they match the student's data
            line = reader.readLine();
            assertEquals("Student name: John Doe", line);
            line = reader.readLine();
            assertEquals("Student number: 12345678", line);
            line = reader.readLine();
            assertEquals("Activities mark: 10", line);
            line = reader.readLine();
            assertEquals("Oral mark: 10", line);
            line = reader.readLine();
            assertEquals("Midterm mark: 19", line);
            line = reader.readLine();
            assertEquals("Final mark: 40", line);
            line = reader.readLine();
            assertEquals("Letter grade: B-", line);
            
            // Read the next separator line and repeat the process for the second student
            line = reader.readLine();
            assertEquals("--------------------------------------------------", line);
            line = reader.readLine();
            assertEquals("Student name: Jane Smith", line);
            line = reader.readLine();
            assertEquals("Student number: 67890541", line);
            line = reader.readLine();
            assertEquals("Activities mark: 10", line);
            line = reader.readLine();
            assertEquals("Oral mark: 10", line);
            line = reader.readLine();
            assertEquals("Midterm mark: 18", line);
            line = reader.readLine();
            assertEquals("Final mark: 50", line);
            line = reader.readLine();
            assertEquals("Letter grade: B+", line);
            
            // Check if there are no more lines to read
            line = reader.readLine();
            assertEquals("--------------------------------------------------", line);
        } catch (IOException e) {
            // Fail the test if an IOException occurs
            fail("IOException: " + e.getMessage());
        }
    }
}

