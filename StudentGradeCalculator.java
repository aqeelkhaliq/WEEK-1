package P1;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // for quiz marks (out of 15)
        System.out.print("Enter Quiz Marks: ");
        int quizMarks = sc.nextInt();
        
        // for assignment marks (out of 10)
        System.out.print("Enter Assignment Marks: ");
        int assignmentMarks = sc.nextInt();
        
        //  for mid-term marks (out of 25)
        System.out.print("Enter Mid-Term Marks: ");
        int midTermMarks = sc.nextInt();
        
        //  for final exam marks (out of 50)
        System.out.print("Enter Final Marks: ");
        int finalMarks = sc.nextInt();
        
        // Calculate total marks
        int totalMarks = quizMarks + assignmentMarks + midTermMarks + finalMarks;
        
        // Calculate average using type casting to get decimal value
        double average = (double) totalMarks / 100 * 100; // Convert to percentage
        
        // Display total marks and average
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average = " + average);
        
        // Determine and display grade using if-else statements
        String grade;
        if (average >= 85) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else {
            grade = "Fail";
        }
        
        System.out.println("Grade = " + grade);
        
        // Close the scanner
        sc.close();
    }
}