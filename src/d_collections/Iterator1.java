package d_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {
        /* Iterator
         * Iterator 인터페이스는 컬랙션 객체가 가지고 있는 요소들을 순회할 수 있는 기능들을 명세한 인터페이스 이다.
         * Collection 인터페이스를 구현한 클래스들은 iterator()메소드를 통해 Iterator구현 객체를 반환 한다.
         * Map 구현 클래스의 경우  Map.values() 메소드를 통해 값(요소)들을 collection 타입으로 객체를 반환 받은 이후에 다시 Iterator구현 객체를 이용하여 순회 할 수 있다.
         */
        ArrayList<User> users1 = new ArrayList<>();
        users1.add(new User("YSH", 22, "M"));
        users1.add(new User("KHJ", 23,"F"));
        users1.add(new User("KKH",5,"M"));

        Iterator<User> iterator = users1.iterator();
        while(iterator.hasNext()) {
            User user = iterator.next();
        }

        HashMap<String, User> users2 = new HashMap<>();
        users2.put("user01", new User("YSH", 22, "M"));
        users2.put("user02", new User("KHJ", 23,"F"));
        users2.put("user03", new User("KKH",5,"M"));
        
        Collection<User> col = users2.values();
        Iterator<User> iterator2 = col.iterator();
        while(iterator.hasNext()) {
            User user = iterator.next();
        }        
    }
    
    static class User {
        private String name;
        private int age;
        private String gender;

        public User() {
        };

        public User(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
    }    
}
