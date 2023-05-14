
public class Operations {
	
	 public void add(int a, int b){
	        System.out.println(a+b);
	    }

	    public void sub(int a, int b){
	        System.out.println(a-b);
	    }

	    public void multiply(int a, int b){
	        System.out.println(a*b);
	    }

	    public void div(int a, int b){
	    	if (b != 0) {
	    		System.out.println(a/b);
            } else {
                System.out.println("Cannot divide by zero");
            }
	        
	    }

	    public void square(int a){
	        System.out.println(a*a);
	    }
	    public void cube(int a){
	        System.out.println(a*a*a);
	    }

}
