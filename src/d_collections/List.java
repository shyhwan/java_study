package d_collections;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        
        /* List Interface
         * 리스트 계열의 컬렉션은 저장 요소를 순차적으로 관리하며 중복된 값과 null값을 요소로 허용한다.
         * 요소에 대한 접근은 배열과 동일하게 인덱스로 접근한다.
         * 리스트 인터페이스를 구현한 대표 클래스는 ArrayList, LinkedLIst, Vector 클래스가 있다.
         */

         /* ArrayList
          * ArrayList는 내부에 배열을 갖고 있다. 따라서 고정 길이 저장공간으로 요소들을 관리한다.
          * ArrayList의 내부 배열이 요소를 담을 수 있는 용량을 capacity라고 한다.
          * 내부 배열 용량을 이상을 저장할 경우, 내부적으로 용량을 늘린 새로운 배열을 만들어 요소를 담는다.
          */

        ArrayList<String> list = new ArrayList<>();

        list.add("test");
        list.add("success");
        list.add(1,"chnage"); // 데이터 변경

        /*
         * 리스트 중간 요소 추가, 삭제시 자동으로 이후 인덱스를 뒤로 밀거나, 빈 인덱스로 데이터를 당겨온다.
         * 떄문에 추가, 삭제가 빈번한 데이터의 관리에는 적합하지 않다.
         */
    }
    
}
