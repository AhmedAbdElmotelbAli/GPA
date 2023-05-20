/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
import gpaproject.Student;
import static gpaproject.Student.isAlphabetic;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    // Test the constructor with valid arguments
    @Test
    public void testStudentConstructor() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        assertEquals(name, student.getName());
        assertEquals(number, student.getNumber());
        assertEquals(activitiesMark, student.getActivitiesMark());
        assertEquals(oralMark, student.getOralMark());
        assertEquals(midtermMark, student.getMidtermMark());
        assertEquals(finalMark, student.getFinalMark());
    }
    // Test the constructor with valid arguments

    @Test//add it
    public void testStudentvalidateMark() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        boolean t = true;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        assertEquals(t, student.validateActivitiesMark());
        assertEquals(t, student.validateOralMark());
        assertEquals(t, student.validateFinalMark());
        assertEquals(t, student.validateMidtermMark());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStudentvalidateMark2() {
        String name = "Alice";
        String number = "12345678";
        int activitiesMark = -1;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        boolean t = false;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        assertEquals(t, student.validateActivitiesMark());
        student.setActivitiesMark(11);
        assertEquals(t, student.validateActivitiesMark());
        student.setFinalMark(70);
        assertEquals("false", student.validateActivitiesMark());
        student.setFinalMark(-1);
        assertEquals("false", student.validateActivitiesMark());
        student.setMidtermMark(21);
        assertEquals("false", student.validateActivitiesMark());
        student.setMidtermMark(-1);
        assertEquals("false", student.validateActivitiesMark());
          student.setOralMark(11);
        assertEquals("false", student.validateActivitiesMark());
        student.setOralMark(-1);
        assertEquals("false", student.validateActivitiesMark());
        
    }

    // Test the constructor with invalid name argument
    @Test(expected = IllegalArgumentException.class)
    public void testStudentConstructorWithInvalidName() {
        String name = "Alice123";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
    }

    // Test the constructor with invalid number argument
    @Test(expected = IllegalArgumentException.class)
    public void testStudentConstructorWithInvalidNumber() {
        String name = "Alice Smith";
        String number = "A1234567";
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
    }

    // Test the constructor with invalid activities mark argument
    @Test(expected = IllegalArgumentException.class)
    public void testStudentConstructorWithInvalidActivitiesMark() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = -1;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
    }

    // Test the constructor with invalid oral mark argument
    @Test(expected = IllegalArgumentException.class)
    public void testStudentConstructorWithInvalidOralMark() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 11;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
    }

    // Test the constructor with invalid midterm mark argument
    @Test(expected = IllegalArgumentException.class)
    public void testStudentConstructorWithInvalidMidtermMark() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = -5;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
    }

    // Test the constructor with invalid final mark argument
    @Test(expected = IllegalArgumentException.class)
    public void testStudentConstructorWithInvalidFinalMark() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 61;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
    }

    @Test
    public void testSetName() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        String newName = "Bob Jones";
        student.setName(newName);
        assertEquals(newName, student.getName());
    }

    // Test the setter method for name with invalid argument
    @Test(expected = IllegalArgumentException.class)
    public void testSetNameWithInvalidName() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        String newName = "Bob123";
        student.setName(newName);
    }

    // Test the setter method for number with valid argument
    @Test
    public void testSetNumber() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        String newNumber = "7654321B";
        student.setNumber(newNumber);
        assertEquals(newNumber, student.getNumber());
    }
    // Test the constructor with valid arguments

    @Test // teat whit box  number
    public void testvalidateStudentNumber() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateStudentNumber();
        boolean y = true;
        assertEquals(y, x);
    }

    @Test
    public void testvalidateStudentNumber2() {
        String name = "Alice Smith";
        String number = "1234567 ";
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateStudentNumber();
        boolean y = false;
        assertEquals(y, x);
    }

    @Test
    public void testvalidateStudentNumber3() {
        String name = "Alice Smith";
        String number = "1234567@";
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateStudentNumber();
        boolean y = false;
        assertEquals(y, x);
    }

    @Test
    public void testvalidateStudentNumber4() {
        String name = "Alice Smith";
        String number = "12345678";
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateStudentNumber();
        boolean y = true;
        assertEquals(y, x);
    }
//@Test
//    public void testvalidateStudentNumber5() {
//        String name = "Alice Smith";
//        String number = "123456gg";
//        int activitiesMark = 8;
//        int oralMark = 9;
//        int midtermMark = 15;
//        int finalMark = 50;
//        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
//        boolean x = student.validateStudentNumber();
//        boolean y = false;
//        assertEquals(y, x);
//    }

    @Test  // Test the   valid and invalid name argument
    public void testisAlphabetic() {
        String name = "AliceSmith";
        boolean x = isAlphabetic(name);
        boolean y = true;
        assertEquals(y, x);
    }

    @Test
    public void testisAlphabetic2() {
        String name = "Alice Smit8";
        boolean x = isAlphabetic(name);
        boolean y = false;
        assertEquals(y, x);
    }

    @Test
    public void testisAlphabetic3() {
        String name = "Alice Smit@";
        boolean x = isAlphabetic(name);
        boolean y = false;
        assertEquals(y, x);
    }

    @Test// test activites mark
    public void testvalidateActivitiesMark() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateActivitiesMark();
        boolean y = true;
        assertEquals(y, x);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testvalidateActivitiesMark2() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = -1;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateActivitiesMark();
        boolean y = false;
        assertEquals(y, x);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testvalidateActivitiesMark3() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 20;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateActivitiesMark();
        boolean y = false;
        assertEquals(y, x);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testvalidateActivitiesMark4() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 11;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateActivitiesMark();
        boolean y = false;
        assertEquals(y, x);
    }

    @Test
    public void testvalidateActivitiesMark5() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 10;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateActivitiesMark();
        boolean y = true;
        assertEquals(y, x);
    }

    @Test//Oral Mark
    public void testvalidateOralMark() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateOralMark();
        boolean y = true;
        assertEquals(y, x);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testvalidateOralMark2() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = -1;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateOralMark();
        boolean y = false;
        assertEquals(y, x);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testvalidateOralMark3() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 20;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateOralMark();
        boolean y = false;
        assertEquals(y, x);
    }

    @Test(expected = IllegalArgumentException.class)//check exception
    public void testvalidateOralMark4() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 11;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateOralMark();
        boolean y = false;
        assertEquals(y, x);
    }

    @Test
    public void testvalidateOralMark5() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateOralMark();
        boolean y = true;
        assertEquals(y, x);
    }

    @Test//Midterm Mark
    public void testvalidateMidtermMark() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateMidtermMark();
        boolean y = true;
        assertEquals(y, x);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testvalidateMidtermMark2() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 1;
        int midtermMark = -1;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateMidtermMark();
        boolean y = false;
        assertEquals(y, x);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testvalidateMidtermMark3() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 10;
        int midtermMark = 50;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateMidtermMark();
        boolean y = false;
        assertEquals(y, x);
    }

    @Test(expected = IllegalArgumentException.class)//check exception
    public void testvalidateMidtermMark4() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 10;
        int midtermMark = 21;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateMidtermMark();
        boolean y = false;
        assertEquals(y, x);
    }

    @Test
    public void testvalidateMidtermMark5() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateMidtermMark();
        boolean y = true;
        assertEquals(y, x);
    }

    @Test//Final Mark
    public void testvalidateFinalMark() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateMidtermMark();
        boolean y = true;
        assertEquals(y, x);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testvalidateFinalMark2() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 1;
        int midtermMark = 1;
        int finalMark = -1;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateFinalMark();
        boolean y = false;
        assertEquals(y, x);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testvalidateFinalMark3() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 150;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateFinalMark();
        boolean y = false;
        assertEquals(y, x);
    }

    @Test(expected = IllegalArgumentException.class)//check exception
    public void testvalidateFinalMark4() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 8;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 61;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateFinalMark();
        boolean y = false;
        assertEquals(y, x);
    }

    @Test
    public void testvvalidateFinalMark5() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 60;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        boolean x = student.validateMidtermMark();
        boolean y = true;
        assertEquals(y, x);
    }

    @Test//LetterGrade
    public void testgetLetterGrade() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 60;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        String x = student.getLetterGrade();
        String y = "A+";
        assertEquals(y, x);
    }

    @Test
    public void testgetLetterGrade1() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 55;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        String x = student.getLetterGrade();
        String y = "A";
        assertEquals(y, x);
    }

    @Test
    public void testgetLetterGrade2() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 50;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        String x = student.getLetterGrade();
        String y = "A-";
        assertEquals(y, x);
    }

    @Test
    public void testgetLetterGrade3() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 45;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        String x = student.getLetterGrade();
        String y = "B+";
        assertEquals(y, x);
    }

    @Test
    public void testgetLetterGrade4() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 43;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        String x = student.getLetterGrade();
        String y = "B";
        assertEquals(y, x);
    }

    @Test
    public void testgetLetterGrade5() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 39;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        String x = student.getLetterGrade();
        String y = "B-";
        assertEquals(y, x);
    }

    @Test
    public void testgetLetterGrade6() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 35;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        String x = student.getLetterGrade();
        String y = "C+";
        assertEquals(y, x);
    }

    @Test
    public void testgetLetterGrade7() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 30;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        String x = student.getLetterGrade();
        String y = "C";
        assertEquals(y, x);
    }

    @Test
    public void testgetLetterGrade8() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 28;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        String x = student.getLetterGrade();
        String y = "C-";
        assertEquals(y, x);
    }

    @Test
    public void testgetLetterGrade9() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 25;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        String x = student.getLetterGrade();
        String y = "D+";
        assertEquals(y, x);
    }

    @Test
    public void testgetLetterGrade10() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 22;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        String x = student.getLetterGrade();
        String y = "D";
        assertEquals(y, x);
    }

    @Test
    public void testgetLetterGrade11() {
        String name = "Alice Smith";
        String number = "1234567A";
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 19;
        Student student = new Student(name, number, activitiesMark, oralMark, midtermMark, finalMark);
        String x = student.getLetterGrade();
        String y = "F";
        assertEquals(y, x);
    }

}
