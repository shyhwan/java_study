package c_controlStatement;
public class If {
    public static void main(String[] args) throws Exception {
       /* If(조건문)
        * 하나의 작업을 수행한는 로직 안에서 경우에 따라 다른 명령을 
        * 실행 하여야 할때 사용한다.
        */

        if(true) { }	// if절과 {}(then절)로 구성된다.
        
        /* else
         * if만으로는 처리 하기 어려울때 else 를 사용한다. 
         * 추가적인 조건이 있을 경우 else if 를 사용한다.
         */
        if(true) {	}		
        else if(true) { }	
        else { }
        
        /* switch 
         * (a)해당하는 값을 찾아 실행하며, 그후의 명령도 실행한다.
         * 조건값에 해당되는 case 만 실행 하고 싶을 경우 break;로 종료한다.
         * 조건값이 case 에 해당되지 않으면, default 가 실행된다.
        */
        String a = "";

        switch(a) {		
            case "1":		
                System.out.println("yes");		
            case "2":
                System.out.println("maybe"); break;
            case "3":
                System.out.println("NO");
            default:
                System.out.println("base");
        }

        /* 비교 연산자 
         * 조건문의 조건절에 사용하여 데이터를 비교할 떄 사용한다. 
         */
        
         /* 
         ==	좌항과 우항의 값이 같으면 true("".equals("")으로도 사용한다.)
         !=	좌항과 우항의 값이 다르면 true
         >	좌항이 우항보다 크면 true
         <	좌항이 우항보다 작으면 true
         <=	좌항이 우항보다 작거나 같으면 true
         >=	좌항이 우항보다 크거나 같으면 true         
         */

        /* 논리연산자
         * 조건절에 여러 조건을 사용 해야 할떄 사용한다.
         */

        /* 
        &&	AND		조건중 값이 ture인것을 찾을 때 사용
        ||	OR		조건중 값이 하나라도 true인것을 찾을 때 사용
        !	NOT		부정 true 앞에 붙이면 false, false 앞에 붙이면 true로 바꾼다
        */

        /* == & equals
         * primitive(원시 데이터) 타입의 경우 == 를 사용하고
         * 그 외의 non primitev 타입의 데이터응 equals를 사용한다.
         */

         User user1 = new User();

         User user2 = user1;
     
         User user3 = new User();
     
         System.out.println(user1.equals(user3));
         System.out.println(user1.equals(user2));
         System.out.println(user2.equals(user3));        
    }

    static class User {} 
}

