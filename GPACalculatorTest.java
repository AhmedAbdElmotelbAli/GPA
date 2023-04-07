import org.junit.Test;
import static org.junit.Assert.*;

public class GPACalculatorTest {

    // Test the getLetterGrade method with valid arguments
    @Test
    public void testGetLetterGrade() {
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 8;
        int oralMark = 9;
        int midtermMark = 15;
        int finalMark = 50;
        String expectedLetterGrade = "B";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }

 
}