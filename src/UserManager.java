public class UserManager {

    public void loginSite(){
        System.out.println("Siteye giriş yapıldı.");
    }

    public void add(User user){
        System.out.println("Kullanıcı eklendi " + user.getFirstName() + " " + user.getLastName());
    }

    public void addMultiple(User[] users){
        for (User user:users) {
            add(user);
        }
    }
}
