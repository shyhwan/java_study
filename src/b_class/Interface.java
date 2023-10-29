package b_class;

public class Interface {
    public static void main(String[] args) {
    /* Inheritance(상속)
     * 상속은 연관있는 클래스들에 대해 공통적인 구성요소를 정의하고, 이를 대표하는 클래스를 정의하는 것을 의미한다.
     * 상속 관계는 "is a"관계를 의미 하며 extends 키워드를 이요해 상속관계를 정의한다.
     * 상속 관계에서 상속을 받는 클래스를 sub class, derived class, extended class, child class라 한다.
     * 상속 관계에서 상속을 제공하는 클래스를 super class, base class, parent class라고 한다.
     * 
     * 자식 클래스는 부모클래스를 상속받아서 부모클래스의 모든 자원(필드, 메소드)을 사용할 수 있다.
     * 부모에서 private로 정의 된 필드나 메소드는 접근이 불가능하다.
     * 자식클래스는 부모클래스에 없는 필드와 메소드를 정의하여 기능을 추가할 수 있다.
     * 또한, 상위클래스에 정의된 메소드를 재정의하여 다르게 동작시킬 수 있다.(오버라이딩)
     * 
     * Protected
     * 상속 대상이 되는 부모클래스에 protected 접근 제어자로 정의된 구성요소는 자식 클래스의 구성요소가 된다.
     * 자식클래스는 부모클래스의 protected, public 구성요소에 대해 this 접근이 가능하다.
     */
        
    /* Interface(인터페이스)
     * 인터페이스란 서로 다른 두 시스템, 장치, 소프트웨어 따위를 서로 이어주는 부분 또는 그런 접속 장치 라고 정의할 수 있는데,
     * 객체지향 설계에서 인터페이스는 어떤 객체의 역할만을 정의하여 객체들 간의 관계를 보다 유연하게 연결하는 역할을 담당한다.
     * 객체지향의 인터페이스는 어떤 객체가 수행해야 하는 책심적인 역할만을 규정하고, 실제적인 구현은 해당 인터페이스를 구현하는 
     * 각각의 객체들에서 하도록 프로그램을 설계하는 것을 의미한다.
     */

    }

    static class User {
        public String name;
    }

    static interface UserService {
        public String getName();

        public void addUser(User user);
    }

    static class UserServiceImpl implements UserService {
        
        @Override
        public String getName() {
            User user = new User();

            return user.name;
        }

        @Override
        public void addUser(User user) {
            // db 유저 데이터 입력
        }
    }    
}
