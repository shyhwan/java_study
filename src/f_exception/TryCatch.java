package f_exception;

import java.io.IOException;
import java.io.InputStream;

public class TryCatch {
    public static void main(String[] args) {
        /* try ~ catch ~ finally
         * try      | 비지니스 로직이 들어가는 부분(예외가 발생할 수 있는 부분)
         * catch    | 예외발생시 예외 처리할 부분
         * finally  | 예외발생 여부에 상관없이 실행되는 부분
         */
         InputStream s = System.in;

         try {
             s.read();
         } catch(IOException e) {
            e.getMessage();
         } finally {

         }
    }
}
