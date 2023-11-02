package g_ramda_stream;

import java.util.Arrays;
import java.util.List;
import  java.util.Iterator;

public class Stream01 {
    public static void main(String[] args) {
        /* Steam
         * 스트림 API를 활용하면 다양한 데이터 소스를 표준화된 방법으로 다룰수 있다.
         * 따라서, Collection F/W를 통해 관리하는 데이터를 처리하기 위해 주로 사용한다.
         * 스트림의 다양한 기능들은 대부분 람다를 필요로 하기 때문에 람다를 이해하고 사용할 수 있어야 한다.
         */

        List<String> list = Arrays.asList("Kim","Lee","Park");

        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        list.stream().forEach( name -> System.out.println(name) );
    }
}
