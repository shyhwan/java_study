package g_ramda_stream;

import java.util.ArrayList;
import java.util.List;

public class Steam02 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Kim",11));
        users.add(new User("Lee",24));
        users.add(new User("Park",50));
        users.add(new User("Yun",2));
        users.add(new User("Jung",43));

        List<User> list = new ArrayList<>();
        for(User u1 : users) {
            if(u1.getAge() > 20) {
                list.add(u1);
            }
        }

        List<String> result = new ArrayList<>();
        for(User u2 : list) {
            result.add(u2.getName());
        }
        
        for(String u3 : result) {
                System.out.println(u3);
        }                
    }

    static class User {
        private String name;
        private int age;

        public User(){};

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return this.age;
        }

        public String getName() {
            return this.name;
        }
    }
}
