package e_api_n_lib;
public class String01 {
    public static void main(String[] args) throws Exception {
        /* String
         * String 클래스의 기능을 사용할 때 String 클래스의 특징을 이해하고 사용하는 것이 필요하다.
         * String 객체의 초기화 방식은 리터럴을 이용한 방식과 객체 생성을 통한 초기화 방식 2가지입니다.
         * String은 불변(immutablilty)의 특성을 갖고 있으며 내부적으로 String Pool을 통해 문자열 상수를 관리한다.
         * 문자열의 변경이 빈번한 로직에서 String의 사용은 메모리 누수(memory leak)가 발생할 수 있기 때문에 주의한다.
         * 
         * String pool
         */
        String str1= "String test";
        String str2 = new String("String start");
        String str3= "String test";

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        String s = "Java";
        s.concat("is OOP");
    }
}
