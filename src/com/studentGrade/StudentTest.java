package com.studentGrade;

public class StudentTest {
	public static void main(String[] args) {
		// prompt user to enter name
		Student account1 = new Student("Jane Green", 93.5);
		Student account2 = new Student("John Blue", 72.5);
		
		System.out.printf("%s ' s letter grade is : %s%n", account1.getName(), account1.getLetterGrade());
		System.out.printf("%s ' s letter grade is : %s%n", account2.getName(), account2.getLetterGrade());
	}
}
