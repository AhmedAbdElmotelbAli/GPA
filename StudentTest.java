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
}