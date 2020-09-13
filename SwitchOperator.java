package week1.day2;

public class SwitchOperator {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		String input ="add";
		
		switch (input)
		{
		
		case "add" : System.out.println("Addition: "+ (2+3));
					 break;
					
		case "sub" : System.out.println("Subtraction:" + (2-3));
					 break;
					 
		case "mul" : System.out.println("Multiplication:" + (2*3));
		 			 break;	
		 			 
		case "div" : System.out.println("Division:" + (2/3));
		 			 break;
		 			 
		default: System.out.println("Modulus:" + (2%3)); 			 
		}

	}

}
