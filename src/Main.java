public class Main {

    public static void main(String[] args) {
	Student student1 = new Student();
	student1.setFirstName("Ahmet");
	student1.setLastName("Kantarcı");

	Student student2 = new Student();
	student2.setFirstName("Cemal");
	student2.setLastName("Köroğlu");

	Student[] students = new Student[]{student1,student2};

	Instructor instructor1 = new Instructor();
	instructor1.setFirstName("Mehmet");
	instructor1.setLastName("Ekşi");

	User[] users = new User[]{instructor1,student1,student2};
	UserManager userManager = new UserManager();
	userManager.addMultiple(users);

	Course[] courses = new Course[]{new Course(1,"C#"),new Course(2,"Java")};
	InstructorManager instructorManager = new InstructorManager();
	instructorManager.addMultipleCourse(courses);

	instructorManager.getStudentList(students);

    }
}
