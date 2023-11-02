package a_datatype;

public class Reference {
    public static void main(String[] args) {
        /* Reference/non prinitive Type(참조형)
        * 참조형 변수는 특정 객체의 참조 정보를 저장한다.
        * 기본 데이터 타입 이외의 타입을 의미한다.
        * 참조형 변수는 4byte의 크기를 갖으며 인스턴스 객체에 접근할 수 있는 정보를 갖는다.
        * 객체의 삭제는 객체가 더 이상 사용되지 않을 때 자바의 Garbage Collector에 의해 자동적으로 제거 된다.
        * 
        * 자바의 메모리 구조를 알아갈 필요 있음
        * stataic  |   stack   |   heap
        * 
        */
        
        User user = new User();
        user.name = "ddd";
        
        System.out.println(user.name);

        String[] s = {"1","2"};

        System.out.println(s);
    }
    
    static class User {
        String name;
        int age;
    }
}