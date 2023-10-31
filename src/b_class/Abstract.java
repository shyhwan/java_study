package b_class;

public class Abstract {
    public static void main(String[] args) {
        /* abstract class(추상 클래스)
         * 추상 클래스는 하나 이상의 추상 메소드를 같는 클래스이다.
         * 상속 관계에서 부모 클래스이 역할을 갖기 위한 클래스이며 추상 메소드와 일반 메소드를 가질 수 있다.
         * 추상 메소드는 메소드의 몸체가 없는 메소드이며 자식 클래스에서 재정의 하도록 하기 위한 메소드이다.
         * 추상 클래스는 new 동적 할당자를 통해 인스턴스 객체를 만들 수 없다.
         */
    }

    static abstract class Employee {
        public String getName() {
            return "";
        }

        public abstract void work();
    }

    static class Admin extends Employee {
        @Override
        public void work() {
            System.out.println("Do Hard!!");
        }
    }
}
