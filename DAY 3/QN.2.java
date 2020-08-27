package daywise_handson;
import java.util.*;

class Star
 {
         public static void main(String aar[]) {
        	 Scanner s=new Scanner(System.in);
        	 String input=s.nextLine();
        	 check cd=new check();
        	 cd.display(input);
        	 
         }
}
         
         class check {
        	 void display(String input) {
        		 int count=0;
        		 for(int i=1;i<=input.length();i++) {
        			 if(input.charAt(i)=='*') {
        				 count++;
        			 }
        			 
        		 }
        		 if(count%2!=0) {
        			 System.out.println("valid");
        		 }
        		 else
        		 {
        			 System.out.println("invalid"); 
        		 }
        		 
        	 }
        	 
         }

