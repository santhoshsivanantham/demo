 package demogit;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the pattern range");
		int n=sc.nextInt();
				
		for (int i = n; i >= 1; i--) 
		{  
            for (int j = i; j <= n; j++) 
            {
                System.out.print(n+"  ");
            }
            System.out.println();
	    }	
	}

}
