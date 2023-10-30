package d_collections;

public class Generic {
    public static void main(String[] args) {
        /* Generic(제네릭)
         * java5에서 추가된 기능, 객체를 수집, 관리하는 컬렉션을 이용할 떄 반드시 사용한다.
         * 제네릭을 사용하면 데이터를 저장하는 시점에 어떤 테이터를 저장할 것인지 명시할 수 있다.
         * 이를 통해 사용하고자 하는 데이터의 타입을 명확히 선언할 수 있고, 정확한 데이터의 사용 여부를 컴파일 시점에 확인 할 수 있다.
         */
    }

    static class Box1 {
        private Object item;

        public Box1(Object item) {
          this.item = item;  
        }

        public Object getItem() {
            return item;
        }
    }

    static class Box2<T> {
        private T item;

        public Box2(T item) {
          this.item = item;  
        }

        public T getItem() {
            return item;
        }
    }    
}
