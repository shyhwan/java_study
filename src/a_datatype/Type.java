package a_datatype;

public class Type {
    public static void main(String[] args) throws Exception {
        /* prinitive Data Type(원시/기본형 데이터타입)
         * 자바는 자료형 검사가 엄격한 언어임으로 모든 변수는 자료형을 갖는다.
         * 자료형에 따라 할당하는 메모리 크기가 달라진다.
         * 
         * Primitive Type(기본 자료형)
         * 정수형 : int, short, long, byte
         * 실수형 : float, double
         * 문자형 : char
         * 부울형 : boolean
         */

         /* integer Type(정수형)
          * byte : 1byte  | -128 ~ 127
          * short : 2byte | -32,768 ~ 32,767
          * int : 4byte | -2,147,483,648 ~ 2,147,483,647
          * long : 8byte | -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
          * 
          * 정수형 리터럴은 기본적으로 int형을 표현하므로, long 타입을 명시하기 위해 접미사 L을 사용한다.
          */

        byte a = 0;
        short b = 0;
        int c = 0;
        long d = 10L;

        c = 1_123_432; // java7부터 '_'로 자릿수 구분이 가능하다. 컴파일러는 밑줄을 무시한다.
        System.out.println(c);

        /* Floating-Poing Type(실수형)
         * float : 4byte | 대략 소수점 이하 7자리의 정밀도를 가짐
         * double : 8byte | 대략 소수점 이하 15자리의 정밀도를 가짐
         * 
         * 실수 리터럴은 기본적으로 double 형을 표현하므로 float 타입 값을 표현하려면 접미사 F를 사용한다.
         */

        double e = 0.0;
        float f = 0.9F;

        /* Character Type(문자형)
         * char : 2byte
         * 문자형은 개별 문자를 나타내는 자료형이다.
         * java는 유니코드라는 표준을 사용하며 2byte로 문자를 표현한다.
         * 유니코드의 문자체계는 2byte(16bit)이므로 유니코드 표현법과 16진수 표기법은 같다.
         * 참고 : www.unicode.org
         */

        char chr = '가';

        /* Boolean Type(논리형)
         * 참과 거짓을 표현하는 자료형이다.
         * true : 참을 표현하는 값
         * false : 거짓을 표현하는 값
         */

        boolean isOk = true;
        boolean isGood = false;
    }
}
