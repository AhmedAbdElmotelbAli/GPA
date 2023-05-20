/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpaproject;

/**
 *
 * @author SHEREF ZEDAN
 */


public class GPACalculator {
   private int maxMark = 100;
    private int minMark = 0;
    private int minAPlus = 97;
    private int minA = 93;
    private int minAmu = 89;
    private int minBPlus = 84;
    private int minB = 80;
    private int minBmu = 76;
    private int minCPlus = 73;
    private int minC = 70;
    private int minCmu = 67;
    private int minD = 60;
    private int minDplus = 64;
    public String getLetterGrade(int activitiesMark, int oralMark, int midtermMark, int finalMark) {
        int totalMark = activitiesMark + oralMark + midtermMark + finalMark;
        if (totalMark <= maxMark && totalMark >= minMark) {
            if (totalMark >= minAPlus) {     return "A+";
            } else if (totalMark >= minA) { return "A";
            } else if (totalMark >= minAmu) {return "A-";
            } else if (totalMark >= minBPlus) {return "B+";
            } else if (totalMark >= minB) {return "B";
            } else if (totalMark >= minBmu) {return "B-";
            } else if (totalMark >= minCPlus) {return "C+";
            } else if (totalMark >= minC) {return "C";
            } else if (totalMark >= minCmu) {return "C-";
            } else if (totalMark >= minDplus) {return "D+";
            } else if (totalMark >= minD) {return "D";
            } else { return "F";
            }
        } else { return "error";
        }
    }
} 
