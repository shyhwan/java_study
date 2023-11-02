package f_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception01 {
    public static void main(String[] args) throws Exception {
        /* Exception(예외) & error(오류)
         * 예외란 프로그래밍에서 입력값에 대한 처리가 불가능하거나, 실행중에 참조된 값이 잘못된 경우 등
         * 정상적인 프로그램의 흐름을 벗어난 경우를 말하며, 개발자가 직접 예외 상황을 예측하여 핸들링할 수 있다.
         * 오류는 시스템에 무언가 비정상적으로 발생한 상황을 말하며, 예외와는 다르게 이를 코드에서 잡을 수 없다.
         */

        /* 모든 클래스의 최상위 클래스가 Object 인것 처럼
         * 예외 클래스의 최상위 클래스는 Throwable 클래스이다.
         * Throwable의 하위 클래스는 Exception과 Error 클래스가 있다.
         * 
         * | Error
         * 에러 클래스를 상속한 클래스들은 매우 심가가한 오류상황을 나타낸다.
         * 자바프로그램 외에서 발생한 오류로 프로그램 내에서 해결할 수 없다.
         * 
         * | Exception
         * Exception 클래스는 두가지로 나뉜다.
         * Checked Exception & Unchecked Exception(Runtime Exception)
         * 
         * - Unchecked Exception
         * Exception 클래스와는 달리 try ~ catch문 또는 thows절을 이용한 예외처리가 필요없다.
         * 
         * - Checked Exception
         * try ~ catch 또는 예외를 넘겨주는 thows처리를 해야 한다.
         * 
         * 예외 복구, 예외 처리회피, 예외 전환
         */
        
    }
}
