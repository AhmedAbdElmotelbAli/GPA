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
}