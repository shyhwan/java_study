package e_api_n_lib;

import java.math.BigDecimal;

public class Wrapper {
    public static void main(String[] args) {
        /* Wrapper Class
         * 자바에서는 int, double 등과 같은 기본 데이터 타입들을 객체로 관리할 수 있도록 하는 
         * 클래스들을 제공하며 이 클래스들을 Wrapper 클래스라고 한다.
         * Wapper 클래스들은 기본 데이터 타입에 대한 객체화와 함계 다양한 기능을을 정의하고 있다.
         * 
         * 데이터 양을 많이 많아지는 경우 배열보다 Collection을 이용하여 데이터를 활용하는데
         * 그 때 Collection 클래스들은 primitive type을 담을 수 없어, Wrapper Class로 객체화 하여
         * 사용한다.
         */

         /* Primitive   |   Wrapper
          * boolean     |   Boolean
          * byte        |   Byte
          * short       |   Short
          * int         |   Integer
          * char        |   Character
          * long        |   Long
          * float       |   Float
          * double      |   Double
          */

          Integer a = Integer.parseInt("2023");
          Integer b = Integer.valueOf(2023);
          Integer c = new Integer(34); // 이 형태는 없어질 형태이다.

          Integer d = 10;   // Auto Boxing
          int e = d;        // Unboxing

        /* 실수 계산과 같은 오차가 발생할 수 있는 연산에는 
         * BigInteger, BigDecimal과 같은 클래스의 기능을 사용한다.
         */

        double di = 3.14;
        System.out.println(di + 1); //4.140000000000001

        System.out.println(BigDecimal.valueOf(3.14).add(BigDecimal.valueOf(1)));
    }
}
