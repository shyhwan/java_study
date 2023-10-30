package b_class;

public class Overriding {
        public static void main(String[] args) {
            /* Override(메소드 재정의)
             * 메소드 재정의는 부모 클래스의 메소드를 자식 클래스가 확장하거나 다시 저으이하는 것을 의미한다.
             * 메소드 재정의를 구현하는 방법은 부모 클래스로부터 상속받은 메소드의 반환타입, 메소드명, 파라미터를 동일하게 하여 자식클래스에서 정의한다.
             * 자식 클래스가 부모 클래스의 메소드를 재정의 할 때 접근 지정자의 범위는 넓거나 같아야 한다.
             */

             User user = new User();
             Admin admin = new Admin();

             user.userAuth(); // 사용자 입니다.
             admin.userAuth(); // 사용자 입니다. 관리자 입니다.

            }

    static class User {
        public void userAuth() {
            System.out.println("사용자 입니다.");
        }
    }

    static class Admin extends User {
        @Override
        public void userAuth() {
            super.userAuth();
            System.out.println("관리자 입니다.");
        }
    }

    /* super
     * 상속받은 부모의 매소드를 호출 할떄 사용한다. 
     * 객체 자신의 필드, 메소드는 this로 호출하고 부모의 필드 메소드는
     * super로 호출하며, 부모클래스에서 접근제한자로 protected로 작성 되어 있는경우
     * this로 홀출 할수 있다.
     */

}
