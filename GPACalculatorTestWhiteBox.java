/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import gpaproject.GPACalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class GPACalculatorTestWhiteBox {

    @Test //grade =-1
    public void testWhiteBoxStatement() {//

        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 0;
        int oralMark = 0;
        int midtermMark = 0;
        int finalMark = -1;
        String expectedLetterGrade = "error";

        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);

        assertEquals(expectedLetterGrade, actualLetterGrade);
    }

    @Test //grade =100
    public void testWhiteBoxStatement1() {//

        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 60;
        String expectedLetterGrade = "A+";

        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);

        assertEquals(expectedLetterGrade, actualLetterGrade);
    }

    @Test //grade =96
    public void testWhiteBoxStatement2() {//

        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 16;
        int finalMark = 60;
        String expectedLetterGrade = "A";

        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);

        assertEquals(expectedLetterGrade, actualLetterGrade);
    }

    @Test //grade =92
    public void testWhiteBoxStatement3() {//

        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 12;
        int finalMark = 60;
        String expectedLetterGrade = "A-";

        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);

        assertEquals(expectedLetterGrade, actualLetterGrade);
    }

    @Test //grade =92
    public void testWhiteBoxStatement4() {//
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 58;
        String expectedLetterGrade = "B+";

        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);

        assertEquals(expectedLetterGrade, actualLetterGrade);
    }

    @Test //grade =92
    public void testWhiteBoxStatement5() {//
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 53;
        String expectedLetterGrade = "B";

        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);

        assertEquals(expectedLetterGrade, actualLetterGrade);
    }

    @Test //grade =92
    public void testWhiteBoxStatement6() {//
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 49;
        String expectedLetterGrade = "B-";

        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);

        assertEquals(expectedLetterGrade, actualLetterGrade);
    }

    @Test //grade =92
    public void testWhiteBoxStatement7() {//
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 45;
        String expectedLetterGrade = "C+";

        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);

        assertEquals(expectedLetterGrade, actualLetterGrade);
    }

    @Test //grade =92
    public void testWhiteBoxStatement8() {//

        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 42;
        String expectedLetterGrade = "C";

        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);

        assertEquals(expectedLetterGrade, actualLetterGrade);
    }

    @Test //grade =92
    public void testWhiteBoxStatement9() {//
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 39;
        String expectedLetterGrade = "C-";

        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);

        assertEquals(expectedLetterGrade, actualLetterGrade);
    }

    @Test //grade =92
    public void testWhiteBoxStatement10() {//
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 36;
        String expectedLetterGrade = "D+";

        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);

        assertEquals(expectedLetterGrade, actualLetterGrade);
    }

    @Test //grade =92
    public void testWhiteBoxStatement11() {//
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 33;
        String expectedLetterGrade = "D";

        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);

        assertEquals(expectedLetterGrade, actualLetterGrade);
    }

    @Test //grade =92
    public void testWhiteBoxStatement12() {//
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 29;
        String expectedLetterGrade = "F";

        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);

        assertEquals(expectedLetterGrade, actualLetterGrade);
    }

}
