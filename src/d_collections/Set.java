package d_collections;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        /* Set
         * set 인터페이스를 구현한 컬렉션 클래스들의 가장 큰 특징은 중복을 허용하지 않는다.
         * set의 구현 클래스들은 equals()메소드를 이용해 저장 요소의 중복 검사를 한다.
         * set이 정의하고 있는 추상 메소드 중에는 단일 요소를 꺼내기 위한 get() 메소드가 존재하지 않는다.
         * set을 구현한 주요 클래스는 HashSet, LinkedHashSet, TreeSet 등이 있다.
         */

        /* HashSet 
         * 같은 값이라도 새로운 객체 생성을 통해 입력하면 중복값도 들어간다.
         * 다른 객체의 동일데이터도 중복 허용을 하지 않으려면 equals, HashCode 메소드를 재정의 해야한다.
        */
        HashSet<User> users = new HashSet<>();

        User user = new User("YSH", 33);

        users.add(user);
        users.add(user);
        users.add(new User("JDH", 22));
        users.add(new User("YSH", 33));
        users.add(new User("KHJ", 12));
        users.add(new User("YJM", 3));
        
        System.out.println(users.size());

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
