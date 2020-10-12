import java.util.*;
public class OddEven {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
      int a;
      System.out.println("Enter a no");
      a=sc.nextInt();
      if(a%2 == 0)
    	  System.out.println(a+" IS Even");
      else
    	  System.out.println(a+" IS Odd");
	}

}
