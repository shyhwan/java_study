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

    /*
     * Access Modifier(접근 제어자)	
     * 멤버 또는 클래스에 사용되어 외부에서 접근하지 못하도록 제한하는 역할이다.
     * 제외시 default가 기본이며, 클래스, 멤버변수, 메소드, 생성자에 사용된다.
     * 캡슐화 하여 클래스의 내부에 선언된 데이터를 보호하기위해 사용한다. 		
     * 
     * private < default < protected < public 순으로 보다 많은 접근을 허용한다.
     * 
     * 제어자		같은클래스	같은패키지	자손클래스	 전체	설명
     * public		O			O			O			O	접근 제한이 전혀 없음
     * protected	O			O			O			X	같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근 가능
     * default		O			O			X			X	같은 패키지 내에서만 접근 가능
     * private		O			X			X			X	같은 클래스 내에서만 접근 가능    
     */
}
