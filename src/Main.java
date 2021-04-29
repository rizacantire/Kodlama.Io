public class Main {

    public static void main(String[] args) {
	Student student1 = new Student();
	student1.setFirstName("Ahmet");
	student1.setLastName("Kantarcı");

	Instructor instructor1 = new Instructor();
	instructor1.setFirstName("Mehmet");
	instructor1.setLastName("Ekşi");

	User[] users = new User[]{instructor1,student1};
	UserManager userManager = new UserManager();
	userManager.addMultiple(users);


    }
}
