package test;

public class App {
    public static void main(String[] args) {
        User u = new User("YSH", 23);
        

        User u2 = new User();

        u2.setName(null);
        u2.setAge(0);

        u2.getName();
    }
}
