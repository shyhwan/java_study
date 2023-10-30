package d_collections;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        /* Map
         * map 인터페이스는 collection 인터페이스를 상속하지 않은 인터페이스이다.
         * map이 갖는 대표적인 특성은 요소를 저장하기 위해 유일한 Key와 함께 저장 한다는 것이다.
         * map은 내부에 Entry 인터페이스를 가지고 있으며 Entry 는 키와 값을 가진 객체의 순서 쌍이다.
         * map의 주요 구현 클래스는 HashMap, LinkedMap, TreeMap등이 있다. 
         */

        /* HashMap
         * 요소를 저장하기 위해서 key, value가 필요하며 value의 경우 중복이 가능하다.
         * hashMap 클래스는 저장되는 요소의 순서를 보장하지 않는다.
         * 
         */
        HashMap<String, User> users = new HashMap<>();

        User user1 = new User("YSH", 33);
        User user2 = new User("KHJ", 12);
        User user3 = new User("YJM", 3);

        users.put(user1.name, user1);
        users.put(user2.name, user2);
        users.put(user3.name, user3);
        users.put("newUser", new User("JDH", 22));

        /* LinkdeHashMap
         * 클래스는 요소를 추가한 순서를 보장한다.
         */

        /* TreeMap
         * TreeMap 클래스는 요소의 키에 대한 정렬된 순서를 보장하며 이를 위해서는 키 객체가 Comparable 인터페이스를 구현하고 있어야 한다.
         */
    }

    static class User {
        private String name;
        private int age;

        public User() {
        };

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
