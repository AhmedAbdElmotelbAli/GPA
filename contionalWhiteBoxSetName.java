/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import gpaproject.Student;
import gpaproject.Subject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SHEREF ZEDAN
 */
public class contionalWhiteBoxSetName {
    
 

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
  
    @Test
    public void testSetName() {
        Subject obj = new Subject("software testing","cse337s",100);
        // Test case 1: name is valid
     
        assertEquals("software testing", obj.getName());

        // Test case 2: name is null
        try {
            obj.setName(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid name", e.getMessage());
        }

        // Test case 3: name is empty
        try {
            obj.setName("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid name", e.getMessage());
        }

        // Test case 4: name contains non-alphabetic characters
        try {
            obj.setName("software testing5");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid name", e.getMessage());
        }

        // Test case 5: name starts with a space
        try {
            obj.setName(" software testing");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid name", e.getMessage());
        }
    }



    @Test
    public void testSetName2() {
        Student obj = new Student("John Doe","12345678",10,10,19,60);
        
        // Test case 1: name is valid
        obj.setName("John Doe");
        assertEquals("John Doe", obj.getName());

        // Test case 2: name is null
        try {
            obj.setName(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid name: Name cannot be null or empty.", e.getMessage());
        }

        // Test case 3: name is empty
        try {
            obj.setName("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid name: Name cannot be null or empty.", e.getMessage());
        }

        // Test case 4: name starts with a space
        try {
            obj.setName(" John Doe");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid name: Name cannot start with a space.", e.getMessage());
        }

        // Test case 5: name contains non-alphabetic characters
        try {
            obj.setName("John Doe1");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid name: Name can only contain alphabetic characters and spaces.", e.getMessage());
        }

        // Test case 6: name contains only alphabetic characters and spaces
        obj.setName("John Doe Smith");
        assertEquals("John Doe Smith", obj.getName());
    }


}
