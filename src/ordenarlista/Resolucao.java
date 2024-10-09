package ordenarlista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

class StudentComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		if ((s2.getCgpa() != s1.getCgpa())) {
			return Double.compare(s2.getCgpa(), s1.getCgpa());
		} else {
			if (!(s1.getFname().equals(s2.getFname()))) {
				return s1.getFname().compareTo(s2.getFname());
			} else {
				return Integer.compare(s1.getId(), s2.getId());
			}

		}
	}
}

public class Resolucao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		Collections.sort(studentList, Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFname)
				.thenComparing(Student::getId));

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}

}
