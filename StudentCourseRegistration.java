import java.util.Scanner;

class Student {

    String studentName;
    int rollNumber;
    double marks;
    String courseName;
    int courseCredits;

    Student(String studentName, int rollNumber, double marks,
            String courseName, int courseCredits) {

        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    double calculateFee() {
        return courseCredits * 1500;
    }

    boolean checkEligibility() {
        return marks >= 50;
    }

    double calculateScholarship() {

        if (marks >= 85) {
            return 20;
        } else if (marks >= 70) {
            return 10;
        } else {
            return 0;
        }
    }

    double calculateFinalFee() {

        double totalFee = calculateFee();
        double scholarship = calculateScholarship();

        double scholarshipAmount = totalFee * scholarship / 100;

        return totalFee - scholarshipAmount;
    }

    void displayDetails() {

        double totalFee = calculateFee();
        double scholarship = calculateScholarship();
        double scholarshipAmount = totalFee * scholarship / 100;
        double finalFee = calculateFinalFee();

        System.out.println("\n========== STUDENT COURSE DETAILS ==========");
        System.out.println("Student Name       : " + studentName);
        System.out.println("Roll Number        : " + rollNumber);
        System.out.println("Marks              : " + marks);
        System.out.println("Course Name        : " + courseName);
        System.out.println("Course Credits     : " + courseCredits);
        System.out.println("Eligibility        : Eligible");
        System.out.println("Total Course Fee   : Rs. " + totalFee);
        System.out.println("Scholarship        : " + scholarship + "%");
        System.out.println("Scholarship Amount : Rs. " + scholarshipAmount);
        System.out.println("Final Fee          : Rs. " + finalFee);
        System.out.println("=============================================");
    }
}

public class StudentCourseRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter course name: ");
        String courseName = sc.nextLine();

        System.out.print("Enter course credits: ");
        int courseCredits = sc.nextInt();

        Student student = new Student(
                studentName,
                rollNumber,
                marks,
                courseName,
                courseCredits);

        if (student.checkEligibility()) {

            student.displayDetails();

        } else {

            System.out.println("\n=============================================");
            System.out.println("Student is NOT ELIGIBLE for course registration.");
            System.out.println("Minimum required marks: 50");
            System.out.println("=============================================");
        }

        sc.close();
    }
}