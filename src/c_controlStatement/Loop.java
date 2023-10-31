package c_controlStatement;

public class Loop {
    public static void main(String[] agrs) {
        /* Looping Statement(반복문)
         * 하나의 작업 안에서 반복해서 같은 작업을 수행해야 할떄 사용한다.
         * for, while, doWhile문으로 사용가능하며, 자료형에따라 Iterator를 사용한다.
         */
        String[] name = {"YSH","JDH","KHJ"};
        int b = 0;
        while(b < name.length) {
            b++;
        } // 조건을 만족할 떄 까지 반복한다. 
        
        do { } while(b < name.length); // 명령이 무조건 한번 실행해야 될떄 사용한다.
        

        for(int a = 0; a < name.length; a++) {
            System.out.println("Name :: " + name[a]);
        } // 횟수가 정해져 있을떄 사용

        /* break & continue
         * 특정 조건을 만족했을 떄 반복문을 종료 하려면 break를 사용한다.
         * 특정 조건을 중지하고 다음 반복을 실행 하려면 continue를 사용한다.
         */
    }
}
