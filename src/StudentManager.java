public class StudentManager extends UserManager{
    public void joinCourse(Course course){
        System.out.println(course.getName() + " kursunu katıldınız.");
    }

    public void sendComment(){
        System.out.println("Yorumunuz için teşekkürler.");
    }

    public void sendWork(){
        System.out.println("Ödev gönderildi.");
    }
}
