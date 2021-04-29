public class InstructorManager extends UserManager{
    public void getStudentList(Student[] students){
        for (Student student:students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
        System.out.println("Öğrenci listesi getirildi");
    }

    public void addNewCourse(Course course){
        System.out.println("Yeni kurs eklendi" + course.getName());
    }

    public void deleteCourse(Course course){
        System.out.println("Kurs silindi" + course.getName());
    }

    public void updateCourse(Course course){
        System.out.println("Kurs güncellendi" + course.getName());
    }
}
