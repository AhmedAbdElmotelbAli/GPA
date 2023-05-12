/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
import gpaproject.Subject;
import org.junit.Test;
import static org.junit.Assert.*;

public class SubjectTest {

   
    @Test
    public void testSubjectConstructor() {
        
        String name = "Mathematics";
        String code = "MAT101";
        int fullMark = 100;
        Subject subject = new Subject(name, code, fullMark);
        assertEquals(name, subject.getName());
        assertEquals(code, subject.getCode());
        assertEquals(fullMark, subject.getFullMark());
    }

    // Test the constructor with invalid name argument
    @Test(expected = IllegalArgumentException.class)
    public void testSubjectConstructorWithInvalidName() {
        String name = "Math3matics";
        String code = "MAT101";
        int fullMark = 100;
        Subject subject = new Subject(name, code, fullMark);
    }

    // Test the constructor with invalid code argument
    @Test(expected = IllegalArgumentException.class)
    public void testSubjectConstructorWithInvalidCode() {
        String name = "Mathematics";
        String code = "M@T101";
        int fullMark = 100;
        Subject subject = new Subject(name, code, fullMark);
    }

    // Test the constructor with invalid full mark argument
    @Test(expected = IllegalArgumentException.class)
    public void testSubjectConstructorWithInvalidFullMark() {
        String name = "Mathematics";
        String code = "MAT101";
        int fullMark = 90;
        Subject subject = new Subject(name, code, fullMark);
    }

    // Test the setter method for name with valid argument
    @Test
    public void testSetName() {
        String name = "Mathematics";
        String code = "MAT101";
        int fullMark = 100;
        Subject subject = new Subject(name, code, fullMark);
        String newName = "Physics";
        subject.setName(newName);
        assertEquals(newName, subject.getName());
    }

    // Test the setter method for name with invalid argument
    @Test(expected = IllegalArgumentException.class)
    public void testSetNameWithInvalidName() {
        String name = "Mathematics";
        String code = "MAT101";
        int fullMark = 100;
        Subject subject = new Subject(name, code, fullMark);
        String newName = "Phy$ics";
        subject.setName(newName);
    }

    // Test the setter method for code with valid argument
    @Test
    public void testSetCode() {
         String name = "Mathematics";
         String code = "MAT101";
         int fullMark = 100;
         Subject subject = new Subject(name, code, fullMark);
         String newCode = "PHY102s";
         subject.setCode(newCode);
         assertEquals(newCode, subject.getCode());
     }
 
     // Test the setter method for code with invalid argument
     @Test(expected = IllegalArgumentException.class)
     public void testSetCodeWithInvalidCode() {
         String name = "Mathematics";
         String code = "MAT101";
         int fullMark = 100;
         Subject subject = new Subject(name, code, fullMark);
         String newCode = "P@Y102s";
         subject.setCode(newCode);
     }

     // Test the setter method for full mark with valid argument
     @Test
     public void testSetFullMark() {
          String name = "Mathematics";
          String code = "MAT101";
          int fullMark = 100;
          Subject subject = new Subject(name, code, fullMark);
          int newFullMark = 100;
          subject.setFullMark(newFullMark);
          assertEquals(newFullMark, subject.getFullMark());
      }
  
      // Test the setter method for full mark with invalid argument
      @Test(expected = IllegalArgumentException.class)
      public void testSetFullMarkWithInvalidFullMark() {
          String name = "Mathematics";
          String code = "MAT101";
          int fullMark = 100;
          Subject subject = new Subject(name, code, fullMark);
          int newFullMark = 90;
          subject.setFullMark(newFullMark);
      }

          @Test // set name 
    public void testSetName2() {
        // Test valid name
        Subject subject = new Subject("Math", "MAT101", 100);
        subject.setName("Science");
        assertEquals("Science", subject.getName());

        // Test invalid name (null)
        try {
            subject.setName(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid name", e.getMessage());
        }

        // Test invalid name (empty string)
        try {
            subject.setName("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid name", e.getMessage());
        }

        // Test invalid name (contains non-letter characters)
        try {
            subject.setName("Math1");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid name", e.getMessage());
        }

        // Test invalid name (starts with space)
        try {
            subject.setName(" Science");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid name", e.getMessage());
        }
    }

    @Test
    public void testSetCode1() {
        // Test valid code
        Subject subject = new Subject("Math", "MAT101", 100);
        subject.setCode("SCI101");
        assertEquals("SCI101", subject.getCode());

         // Test valid code with optional 's'
         Subject subject2 = new Subject ("Science","SCI101s",100);
         assertEquals ("SCI101s",subject2.getCode());

         // Test invalid code (null)
         try{
             subject.setCode(null);
             fail ("Expected IllegalArgumentException");
         }catch(IllegalArgumentException e){
             assertEquals ("Invalid code" ,e.getMessage());
         }

        // Test invalid code (wrong format)
        try {
            subject.setCode("MAT1011");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid code", e.getMessage());
        }
    }

    @Test
    public void testSetFullMark3() {
        // Test valid fullMark
        Subject subject = new Subject("Math", "MAT101", 100);
        subject.setFullMark(100);
        assertEquals(100, subject.getFullMark());

         // Test invalid fullMark
         try{
             subject.setFullMark(80);
             fail ("Expected IllegalArgumentException");
         }catch(IllegalArgumentException e){
             assertEquals ("Invalid fullMark" ,e.getMessage());
         }
    }
}