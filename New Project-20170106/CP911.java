/*
introduction to java daniel ling 
check point 9.11 
*/

//a
/*
public class CP911{
    public static void main(String[] args) {
		CP911 t = new CP911(5);	
    }
}
/* 
	CP911 t = new CP911(5);	
			    ^
         required: no arguments
	 found: int
	 reason: actual and formal argument lists differ in length

*/

//b
/*
public class CP911{
	public static void main(String[] args) {
	    CP911 t = new CP911();
	    t.x();
	    }    
}
/* CP911.java:20: error: cannot find symbol
	    t.x();
    	     ^
   symbol:   method x()
 location: variable t of type CP911
 1 error
*/

//c
public class CP911{
    public void method1(){
	Circle c;
	System.out.println("What is radius "+ c.getRadius());
	c = new Circle();
    }
}


//D 
/*
public class CP911 {
    public static void main(String[] args) {
	C c = new C(5.0);
	System.out.println(c.value);
	}
}

class C {
    int value = 2;
    }
/* ShowErrors
	required: no arguments
	found: double
   	reason: actual and formal argument lists differ in length
*/
    
