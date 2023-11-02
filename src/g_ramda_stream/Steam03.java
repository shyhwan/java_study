package g_ramda_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Steam03 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Kim",11));
        users.add(new User("Lee",24));
        users.add(new User("Park",50));
        users.add(new User("Yun",2));
        users.add(new User("Jung",43));

        List<String> userNames = users.stream()
                    .filter(user -> user.getAge() > 30)
                    .sorted()
                    .map(User::getName)
                    .collect(Collectors.toList());
                    
        for(String name : userNames) {
            System.out.println(name);
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
/* Stream API
 * 스트림의 최상위 인터페이스는 BaseStream 인터페이스이지만 직접사용하는 경우는 없다.
 * 주로 사용하는 인터페이스는 Stream인터페잉스이며 BaseStream을 상속하는 인터페이스이다.
 * 스트림은 여러 메소드들을 정의하고 있으며 메소드들의 파라미터에 람다와 메소드 참조가 피료하다.
 * 한번 생성한 스트림은 사용 후 다시 사용할 수 없으며 전체 데이터에 대한 처리가 이루어지면 종료된다.
 * collection데이터를 스트림으로 반환하거나 스트림의 Builder로 스트림에 데이터를 넣는 방식으로 사용 할 수 있다.
 * 스트림은 생성, 중간연산, 최종연산 단계로 구분할 수 있다.
 * 
 * 메소드               | 기능
 * long count()         | 해당 스트림에 포함된 함목의 수를 반환
 * Stream concat(S, S)  | 파라미터로 전달되는 두개의 스트림을 하나의 스트림으로 반환
 * R Collect(C)         | 스트림의 항목들을 컬렉션 타입의 객체로 반환
 * Stream filter(P)     | 스트림의 항목들을 파라미터의 조건에 따라 필터링 하고 스트림으로 반환
 * void forEach(C)      | 스트림 항목들에 대한 순회.(최종연산)
 * Optional reduce(B)   | 람다 표현식을 기반으로 데이터를 소모하고 결과는 반환(최종연산)
 * Objectp[] toArray()  | 스트림 항목을 배열 객체로 반환
 * Stream sorted()      | 스트림 항목들에 대해 정렬하고 스트림으로 반환
 */