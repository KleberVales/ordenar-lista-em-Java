package ordenarlista;

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

}
