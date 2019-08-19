package stdInSdtOut;

import java.util.*;

public class Main {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	 int N = scanner.nextInt();
         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

         int minValue = 2;
         int maxValue = 5;

         int minValueRange2 = 6;
         int maxValueRange2 = 20;

         if(N % 2 == 0 && N > minValue && N < maxValue)
         {
             System.out.println("Not Weird");
         }
         else if(N % 2 == 0 && N > minValueRange2 & N < maxValueRange2)
         {
             System.out.println("Weird");
         }
         else if(N % 2 == 0 && N >= 20){
             System.out.println("Not Weird");
         }else{
             System.out.println("Weird");
         }

         scanner.close();
    }

}
