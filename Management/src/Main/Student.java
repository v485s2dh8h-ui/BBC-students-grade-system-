package Main;
import java.util.Scanner;

public class Student {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

char choice;

do {

System.out.println("\n===== STUDENT GRADE MANAGEMENT SYSTEM =====");

System.out.print("Enter number of students: ");
int numberOfStudents = input.nextInt();

int passed = 0;
int failed = 0;

// FOR LOOP
for (int i = 1; i <= numberOfStudents; i++) {

System.out.println("\nStudent " + i);

System.out.print("Enter student's name: ");
String name = input.next();

System.out.print("Enter marks (0 - 100): ");
double marks = input.nextDouble();

// WHILE LOOP
while (marks < 0 || marks > 100) {

System.out.println(
"Invalid marks! Please enter a value between 0 and 100."
);

System.out.print("Enter marks again: ");
marks = input.nextDouble();
}

// TERNARY STATEMENT
String result = marks >= 50 ? "Pass" : "Fail";

if (marks >= 50) {
passed++;
} else {
failed++;
}

System.out.println("Name: " + name);
System.out.println("Marks: " + marks);
System.out.println("Result: " + result);
}

System.out.println("\n===== SUMMARY =====");
System.out.println("Students processed: " + numberOfStudents);
System.out.println("Students passed: " + passed);
System.out.println("Students failed: " + failed);

// DO-WHILE
System.out.print("\nDo you want to run the system again? (Y/N): ");
choice = input.next().charAt(0);

} while (choice == 'Y' || choice == 'y');

System.out.println("\nThank you for using the Student Grade Management System!");

input.close();
}
}
