package demogit;

public class test2 {

	public static void main(String[] args) {
		
	       int a=0;
	      
	       int res = a > 0 ? 1 : (0 > a ? 2 :3);
	       
	       switch (res)
	       {
	       case 1 : System.out.println("The number is possitive");break;
	       case 2 : System.out.println("The number is negative"); break;
	       case 3 : System.out.println("The number is zero"); break;
	     
	       default : System.out.println("Unexpected case");
	       
	       }
		
	       }


	

}
