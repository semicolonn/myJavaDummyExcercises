package operatorsWithJava;


	public class Githubdotcom  { 
		
		
		//public class WhileLoop {}

	    
		public static void main(String args[]) {
	        //Prints out numbers from 1 to 10
	        countToNumber(10);
	        System.out.println();
	        
	        System.out.println("**************");

	        //Prints out numbers from 10 to 1
	        countFromNumber(10);
	    }

	    private static void countToNumber(int num) {

	        int i = 1;
	        while (i <= num) {
	            System.out.println(i);
	            i++;

	        }
	    }
	    //-----------------------------------------------

	    private static void countFromNumber(int num) {
	        while (num > 0) {
	            System.out.println(num);
	            num--;
	        }
	    }
	}
	
	
	
	//------------------
	
	
	
	
