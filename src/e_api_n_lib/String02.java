package e_api_n_lib;

public class String02 {
    public static void main(String[] args) {
        /* StringBuilder & StringBuffer
         * 두개의 클래스는 동기화 특성을 제외하고 모든 메소드의 기능이 동일하다.
         * 이 두 클래스는 String 클래스와 달리 가변(mutable)의 특성을 갖고 있다.
         * StringBuilder, StringBuffer 두 클래스는 AbstractSttringBuilder 추상 클래스를 상속하고 있으며 이클래스는
         * 내부적으로 문자열을 관리하기 위햔 byte[]과 배열의 길이를 계산하기 위한 count 속성을 갖고 있다.
         * 
         * 리터럴로 초기화 할 수 없고 생성자를 통해 초기화 한다.
         */

        StringBuffer sb = new StringBuffer("String");
        sb.append("Buffer");
        
        StringBuilder sbi = new StringBuilder("String");
        sbi.append("Builder");

        /* 단일쓰레드의 환경에서는 StringBuilder 를 사용하고
         * 멀티쓰레드의 환경에서는 StringBuffer 를 사용한다.
         * (동기화 처리하면 멀티쓰레드에서도 StringBuilder를 사용할 수 있다.)
         */
         
    }
}
