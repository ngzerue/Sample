package methodExample;

public class MethodEx {
	public static void main(String[] args) {
		myMethod();
		myMethod1("Nigsty");
		myCalculator(10,20,30,40);
		myCalculator(3.5 + 2.5, 0, 0);

		 MethodEx obj = new MethodEx();
		  
		 obj.myMethod2();
		
     
	}
	
		public void myMethod2() {
			System.out.println("Hello");
			
		}
	
          static void myMethod() {
		    System.out.println("I just got executed!");
		  }
	
          static void myMethod1(String fname) {
        	    System.out.println("Full name: "+ fname);
        	  }
          
          static int myCalculator(int a, int b) {
        	    int sum=0;
        	    sum =a+b;
			    System.out.println("The sum of the numbers is: "+ sum); 
			     return sum;
			  } 
          static int myCalculator(int a, int b,int c,int d) {
      	    int sum=0;
      	    sum =a+b+c+d;
			    System.out.println("The sum of the numbers is: "+ sum); 
			     return sum;
			  } 
          static double myCalculator(double a, double b, double c) {
        	  double sum;
      	       sum =a+b;
			    System.out.println("The sum of the numbers is: "+ sum); 
			     return sum;
			  } 
          
}
