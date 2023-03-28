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
   

    public String getLetterGrade(int activitiesMark, int oralMark, int midtermMark, int finalMark) {
        int totalMark = activitiesMark + oralMark + midtermMark + finalMark;
        
        if (totalMark >= 97) {
            return "A+";
        } else if (totalMark >= 93) {
            return "A";
        } else if (totalMark >= 89) {
            return "A-";
        } else if (totalMark >= 84) {
            return "B+";
        } else if (totalMark >= 80) {
            return "B";
        } else if (totalMark >= 76) {
            return "B-";
        } else if (totalMark >= 73) {
            return "C+";
        } else if (totalMark >= 70) {
            return "C";
        } else if (totalMark >= 67) {
            return "C-";
        } else if (totalMark >= 64) {
            return "D+";
        } else if (totalMark >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}