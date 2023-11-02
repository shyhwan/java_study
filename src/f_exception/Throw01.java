package f_exception;

public class Throw01 {
    public static void main(String[] args) {
        /* Throw(사용자 정의 예외)
         * 예외가 발생하지 않더라도 사용자가 직접 예외를 생성하여 예외 처리할 수 있다.
         * 
         * throw를 사용하여 예외처리가 필요한 조건에서 예외발생을 하고,
         * throws를 사용하여 예외를 직접 처리 하지 않고 다른곳에서 처리할 수 있다.
         */
        Account myAccount = new Account(10000);

        System.out.println(myAccount.withDraw(5000));
        System.out.println(myAccount.withDraw(10000));

    }

    static class Account {
        private int balance;

        public Account(int balance) {
            this.balance = balance;
        }

        public int withDraw(int money) {
            if(balance < money) {
                System.out.println("잔액이 부족합니다.");
            } else {
                balance -= money;
            }
            
            return balance;
        }

        // public int withDraw(int money) throws DraftException {
        //     if(balance < money) {
        //         throw new DraftException("잔액이 부족합니다.");
        //     }
        //     balance -= money;
        //     return balance;
        // }        

    }

    static class DraftException extends Exception {
        
        public DraftException(String msg) {
            super(msg);
        }
    }
}
/* 
 * 복구     | 예외상황을 파악하고 문제를 해결하여 정상으로 되돌리는것. 반복문
 * 회피     | 예외처리를 자신을 호출한 쪽으로 던져버리는 방법
 * 전환     | 예외를 변경할 때 사용한다.
 */