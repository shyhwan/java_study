package d_collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {
        /* Queue 
         * 큐는 사실 LinkedList로 만듬
         */
        
        Queue<String> q = new LinkedList<>(); 

        q.add("null"); // 꽉찬 경우 exception발생
        q.remove(); // null 일경우 exception발생

        q.element(); // null 일경우 exception발생
        q.peek();
        
        q.offer("set"); 
        q.poll();
    }

    static class Data {
        public String d1;
    }
}
