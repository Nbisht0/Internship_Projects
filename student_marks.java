import java.util.Scanner;

//PROJECT NAME ; GRADEMASTER


public class student_marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of student");
        int numstudent = scanner.nextInt();

        for (int i = 1; i < numstudent; i++) {
            System.out.println("enter the name of the student");
            String name = scanner.next();

            System.out.println("Enter student marks (out of marks)");
            int marks = scanner.nextInt();

            String grade;

            if (marks >= 90) {
                grade = "A+";
            } else if (marks >= 80) {
                grade = "B+";
            } else if (marks >= 70) {
                grade = "B";
            } else if (marks >= 60) {
                grade = "C";
            } else if (marks >= 33) {
                grade = "pass";
            } else {
                grade = "FAIL";
            }
            System.out.println("Enter a name : " + name);
            System.out.println("Enter the marks : " + marks);
            System.out.println(" Enter a grade : " + grade);

            if(grade.equals("A+") || grade.equals("B+")){

                System.out.println("STUDENT HAS PERFORMED WELL");
            }
            else if (grade.equals("B") || grade.equals("C")) {

                System.out.println("GOOD PERFORMANCE");
            }
            else if (grade.equals("pass")) {

                System.out.println("STUDENT NEED IMPROVEMENT");
            }
            else {
                System.out.println( name + "IS FAIL");
            }
            System.out.println();
        }
           scanner.close();

    }
}