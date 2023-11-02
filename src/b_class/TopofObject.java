package b_class;

public class TopofObject {
    public static void main(String[] args) {
        /* Object
         * Object 클래스는 모든 자바 클래스가 상속하는 최상위 클래스 이다.
         * Object 클래스는 모두 11개의 메소드를 저의하고 있으며 이 메소드들은 자바의 모든 클래스가 갖는 기능이다.
         * 자바의 모든 클래스가 상속 받아 갖는 Object 클래스 메소드에 대한 목적과 기능을 이해사는 것이 중요하다.
         * Object 클래스를 통해 상속받는 메소드의 의미를 이해해야 그 의미에 맞게 재 정의 할수 있다.
         */

        Object obj = new Object();

    }

    static class Obj {
        /* 
        !!!
        protected Object clone();
        
        !!!
        boolean equals(Object obj);
        
        !!!
        int hashCode();
        
        !!!
        String toString();
        
        protected finalize();
        
        Class<?> getClass(); // 리플렉션과 관련있다.
        */
        
        /* 아래의 메소드들은 thread와 관련이있다. */
        /*
        void notify();
        
        void notifyAll();
        
        void wait();
        
        void wait(long timeout);
        
        void wait(long timeout, int nanos);
        */
    }
    
}
