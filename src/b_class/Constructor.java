package b_class;

public class Constructor {
    /*
     * Constructor(생성자)
     * 클래스의 구성요소 중 하나로, 객체를 인스턴스화 할 때 가장 먼저 호출되는 특수한 메소드이다.
     * 생성자의 역할은 객체가 갖는 필드의 초기화이며 따라서 모든 크래스는 하나 이상의 생성자를 갖는다.
     * 생성자의 이름은 해당 클래스의 이름과 같고 반환 타입을 갖지 않는다.
     * 생성자도 모든 접근제어자를 적용할 수 있으며, 일반적으로는 public 접근제어자가 적용된다.
     */
    static class Employee {
        static private String name;
        private String department;

        /*
         * 매개 변수가 없고 구현 내용 없이 정의하는 생성자를 default Constructor(기본생성자)라고 한다.
         * 클래스는 반드시 하나 이상의 생성자를 가지며 정의하지 않으면 기본생성자가 자동으로 생성된다.
         * 생성자에서 명시적으로 필드의 값을 설정하지 않으면 디폴트 값으로 초기화 된다.
         * 디폴트 초기값 | 숫자(0), 논리(false), 참조(null)
         */

         /** Default Constructor */
        public Employee() {}

        /** User Defined Constructor(사용자 지정 생성자) */
        public Employee(String name) {
            this.name = name;
        }

        /** User Defined Constructor(사용자 지정 생성자) */
        public Employee(String name, String department) {
            this(name);
            this.department = department;
        }
    }
}
