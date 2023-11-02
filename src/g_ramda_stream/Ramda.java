package g_ramda_stream;

import java.util.ArrayList;
import java.util.List;

public class Ramda {
    public static void main(String[] args) throws Exception {
        /* Ramda
         * java8의 가장 중요한 변화는 ramda와 stream이다.
         * 람다 표현식은 메소드로 전달할 수 있는 익명함수를 단순화한 코드 블록으로 불필요한 코드를 줄인다.
         * 람다 표현식은 함수 자체를 전달 인자로 보내거나 변수에 저장하는 것이 가능하다.
         * 
         * () -> { ... };
         */
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("null");
        list.add("Study");

        // list.forEach( (String str) -> { System.out.println(str);} );
        // list.forEach( (str) -> { System.out.println(str);} );
        // list.forEach( str ->  System.out.println(str) );
        // list.forEach(  System.out::println );

        /* 람다를 사용할 경우 변수에 담을 수 있는데 담게되는 변수 타입에 대한 고민이 필요하다.
         * 그래서 정해진 것이 람다를 인터페이스로 대입하게 되었으며 이 인터페이스는 하나의 추상메소드를 갖는 
         * 함수형 인터페이스이다.
         */

    }

    @FunctionalInterface
    static interface InnerRamda {
        void test();
        //void ttest();
    }

    /* java에서 제공하는 함수형 인터페이스
     * Predicate<T>     | test()    기능수행 후 true false를 반환한다.
     * Consumer<T>      | accept()  작업을 수행하고 반환 타입이 없다.
     * Function<T,R>    | apply()   작업 수행 후 다른 타입으로 반환한다.
     * Supplier<T>      | get()     파라미터 없이 리턴 값만 있다.
     */
}
