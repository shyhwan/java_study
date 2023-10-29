package b_class;
public class Oop {
    public static void main(String[] args) throws Exception {
        /* OOP(Object-Oriented Programming)
         * 객체 지향 프로그래밍
         * 프로그래밍은 현실의 특정 문제를 컴퓨터 서계를 통해 풀어가는 방법이라고 할 수 있다.
         * 현실의 문제를 기능 또는 구조위주의 관점으로 보고, 기능르 세분화하여 풀어가는 것을 절차지향이라고 하며,
         * 문제를 데이터의 관점으로 보며 데이터들의 상호 관계를 정의함으로써 해결하는 것을 객체지향이라고 한다.
         * 
         * Class & Object
         * 자바로 구현하는 프로그램은 다수의 클래스들로 이루어지며 클래스를 이용해 객체를 만들고 사용한다.
         * 클래스를 정의하는 것은 객체를 만들기 위한 과정이며, 클래스는 객체에 대한 청사진 또는 템플릿이라고 할 수 있다.
         * 클래스로부터 만들어지는 객체를 인스턴스 혹은 인스턴스 객체 라고 한다.
         * 
         */

         /* 
         * Class
         * 클래스는 속성과 행위로 이루어진다.
         * 클래스에는 Fields(속성), Constructor, Method(행위)로 정의 한다.
         */
        System.out.println("OOP");

        /* 클래스의 선언
         * new 연산자 실행 시 객체가 Heap 메모리에 생성된다.
         * JVM의 메모리 구조를 찾아보자.
         */
        
        Object obj = new Object(); // 객체 생성
        
        obj.toString(); // 객체의 메소드 호출
    }
}
