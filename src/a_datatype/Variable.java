package a_datatype;

public class Variable {
    public static void main(String[] args) {
        /* Variable(변수)
         * 변할수 있는 값(데이터)를 말한다.
         * 변수는 데이터를 담은 컨테이너의 데이터를 다른 데이터로 바꿀 수 있다는 특징이 있다.
         * 변수를 사용하는 문법은 [자료형] [변수명]; 으로 선언하여 사용한다.
         * 변수의 사용은 선언, 초기화, 할당으로 구분할 수 있다.
         * 변수는 데이터의 저장과 참조를 위해 메모리 공간을 할당 받는다.
         */

         int a; // 자료형과 변수명만 작성하는 것을 선언 이라고 한다.
         a = 0; // 변수에 데이터를 처음 할당하는 것을 초기화 라고 한다.
         a = 1; // 변수에 다른 데이터를 담는 것을 할당 이라고 한다.

         int b = 1; // 선언과 초기화를 한번에 할 수 있다.

        /*
         * 변수의 유형
         * 변수는 정의된 위치에 따라 4가지의 유형으로 구분하며 각 유형에 따라 특성에 차이가 있다.
         * Local Variables(지역변수)        
         * Parameter Variables(매개변수)
         * Instance Variables(인스턴스변수)
         * Class Variable(정적변수)
         */
    }
    static class Calc {
        /** Class Variable(정적변수) */
        public static int classVar = 3;
        
        /** Instance Variables(인스턴스변수) */
        private int InstanceVar; // 클래스에 정의 되는 필드를 인스턴스 변수라고 한다.
        
        /**
         * @param paramVar Parameter Variables(매개변수)
         */
        public static void main(String[] paramVar) {
            /** Local Variables(지역변수) */
            int localVar = 0;
        }

    }
        
}
