/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
import gpaproject.GPACalculator;
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
    //Boundary testing
    //grade =59 
    @Test
            public void testBoundaryBlackBoxTest1() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 29;
        String expectedLetterGrade = "F";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            @Test //grade =60
        public void testBoundaryBlackBoxTest2() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 30;
        String expectedLetterGrade = "D";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            //Boundary testing //grade =63
    @Test
            public void testBoundaryBlackBoxTest3() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 33;
        String expectedLetterGrade = "D";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            @Test //grade =64
        public void testBoundaryBlackBoxTest4() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 34;
        String expectedLetterGrade = "D+";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
    //Boundary testing
    @Test //grade =66
            public void testBoundaryBlackBoxTest5() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 36;
        String expectedLetterGrade = "D+";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            @Test //grade =67
        public void testBoundaryBlackBoxTest6() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 37;
        String expectedLetterGrade = "C-";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            //Boundary testing //grade =69
    @Test
            public void testBoundaryBlackBoxTest7() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 39;
        String expectedLetterGrade = "C-";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            @Test //grade =70
        public void testBoundaryBlackBoxTest8() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 40;
        String expectedLetterGrade = "C";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            //Boundary testing
    @Test //grade =72
            public void testBoundaryBlackBoxTest9() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 42;
        String expectedLetterGrade = "C";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            @Test //grade =73
        public void testBoundaryBlackBoxTest10() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 43;
        String expectedLetterGrade = "C+";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            //Boundary testing
    @Test //grade =75
            public void testBoundaryBlackBoxTest11() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 45;
        String expectedLetterGrade = "C+";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            @Test //grade =76
        public void testBoundaryBlackBoxTest12() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 46;
        String expectedLetterGrade = "B-";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            //Boundary testing
    @Test //grade =79
            public void testBoundaryBlackBoxTest13() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 49;
        String expectedLetterGrade = "B-";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            @Test //grade =80
        public void testBoundaryBlackBoxTest14() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 50;
        String expectedLetterGrade = "B";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            //Boundary testing
    @Test //grade =83
            public void testBoundaryBlackBoxTest15() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 53;
        String expectedLetterGrade = "B";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            @Test //grade =84
        public void testBoundaryBlackBoxTest16() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 54;
        String expectedLetterGrade = "B+";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            //Boundary testing
    @Test //grade =88
            public void testBoundaryBlackBoxTest17() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 58;
        String expectedLetterGrade = "B+";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            @Test //grade =89
        public void testBoundaryBlackBoxTest18() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 10;
        int finalMark = 59;
        String expectedLetterGrade = "A-";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            //Boundary testing
    @Test //grade =92
            public void testBoundaryBlackBoxTest19() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 12;
        int finalMark = 60;
        String expectedLetterGrade = "A-";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            @Test //grade =93
        public void testBoundaryBlackBoxTest20() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 13;
        int finalMark = 60;
        String expectedLetterGrade = "A";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            //Boundary testing
    @Test //grade =96
            public void testBoundaryBlackBoxTest21() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 16;
        int finalMark = 60;
        String expectedLetterGrade = "A";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            @Test //grade =97
        public void testBoundaryBlackBoxTest22() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 17;
        int finalMark = 60;
        String expectedLetterGrade = "A+";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            //Boundary testing
    @Test //grade =99
            public void testBoundaryBlackBoxTest23() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 19;
        int finalMark = 60;
        String expectedLetterGrade = "A+";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            @Test //grade =100
        public void testBoundaryBlackBoxTest24() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 20;
        int finalMark = 60;
        String expectedLetterGrade = "A+";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
       // you shoudnot accept more 100 fail udade code 
            //Boundary testing
    @Test //grade =101
            public void testBoundaryBlackBoxTest25() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 10;
        int oralMark = 10;
        int midtermMark = 21;
        int finalMark = 60;
        String expectedLetterGrade = "error";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
                @Test //grade =-1
            public void testBoundaryBlackBoxTest26() {//
       
        GPACalculator calculator = new GPACalculator();
        int activitiesMark = 0;
        int oralMark = 0;
        int midtermMark = 0;
        int finalMark = -1;
        String expectedLetterGrade = "error";
        
        String actualLetterGrade = calculator.getLetterGrade(activitiesMark, oralMark, midtermMark, finalMark);
        
        assertEquals(expectedLetterGrade, actualLetterGrade);
    }
            
            
      
}
