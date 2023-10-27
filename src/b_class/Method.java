package b_class;

public class Method {
    /*
     * Method
     * 클래스에서 행위를 의미하는 것이 메소드 이다.
     * 람다식 표현이 생긴 후 '함수'라는 표현과 혼용해서 사용하기도 한다.
     * 함수는 input(입력), function(기능), output(출력)으로 구성되며 기능에 따라 입출력 값이 없을 수 있다.
     * 메소드의 역할은 해당 클래스의 데이터 제어이다.
     * [static] [final] [접근제어자] [반환 데이터 타입] [메소드명](파라미터) { 기능 실행 블럭 }
     */
    static class User {
        private String name;
        private int age;

        public boolean checkName(String name) {
            boolean isSame = false;

            if(this.name.equals(name)) {
                isSame = true;
            }

            return isSame;
        }
    }
}
