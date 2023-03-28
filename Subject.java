/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpaproject;

/**
 *
 * @author SHEREF ZEDAN
 */
//public class Subject {
//
//    private String subjectName;
//    private String subjectCode;
//    private int fullMark;
//
//    public Subject(String subjectName, String subjectCode, int fullMark) {
//        this.subjectName = subjectName;
//        this.subjectCode = subjectCode;
//        this.fullMark = fullMark;
//    }
//
//    public boolean validateSubjectName() {
//        return subjectName.matches("^[a-zA-Z0-9 ]*$");
//    }
//
//    public boolean validateSubjectCode() {
//        return subjectCode.matches("^[a-zA-Z0-9]*$");
//    }
//
//    public boolean validateFullMark() {
//        return fullMark > 0 && fullMark <= 100;
//    }
//
//    public String getSubjectName() {
//        
//        return subjectName;
//    }
//
//    public String getSubjectCode() {
//        return subjectCode;
//    }
//
//    public int getFullMark() {
//        if(fullMark < 0 || fullMark > 100){
//        return fullMark;}
//        else System.out.println("err in degree not in range");
//        return -1;
//    }
//

//    
//}


class Subject { 
	 private String name;
	 private String code;
	 private int fullMark;
	

	public Subject(String name, String code, int fullMark) {
	    // Call the setter methods and let them validate and assign the attributes
	    setName(name);
	    setCode(code);
	    setFullMark(fullMark);
	}
	

	public String getName() {
	    return name;
	}
	

	public String getCode() {
	    return code;
	}
	

	public int getFullMark() {
	    return fullMark;
	}
    public static boolean isValidName(String name) {
        if (name.length() != 6) {
            return false; // Name must be exactly 6 characters long
        }
        for (int i = 0; i < 3; i++) {
            char c = name.charAt(i);
            if (!Character.isLetter(c)) {
                return false; // First three characters must be alphabetic
            }
        }
        for (int i = 3; i < 6; i++) {
            char c = name.charAt(i);
            if (!Character.isDigit(c)) {
                return false; // Last three characters must be numeric
            }
        }
        return true;
    }
    // Define a setter method for name that also validates it
    public void setName(String name) {
        // Check if the name is valid
        if (name == null || name.isEmpty() || !name.matches("[A-Za-z ]+") || name.startsWith(" ")) {
            throw new IllegalArgumentException("Invalid name");
        }
        // Assign the name after checking
        this.name = name;
    }

    // Define a setter method for code that also validates it
    public void setCode(String code) {
        // Check if the code is valid
        if (code == null || !code.matches("[A-Za-z]{3}[0-9]{3}[s]?")) {
            throw new IllegalArgumentException("Invalid code");
        }
        // Assign the code after checking
        this.code = code;
    }

    // Define a setter method for fullMark that also validates it
    public void setFullMark(int fullMark) {
        // Check if the fullMark is valid
        if (fullMark != 100) {
            throw new IllegalArgumentException("Invalid fullMark");
        }
        // Assign the fullMark after checking
        this.fullMark = fullMark;
    }
}