/*
What is wrong with the code 
java daniel ling
*/
package CheckPoint;

public class CP919{ 
    public static void main(String[] args) {

	method1();

//     good code 
//	CP919 cp = new CP919();
//	cp.method1();	
   }

    public void method1(){
	method2();	
    }

      public static void method2() { 
//    good code 
//    public void method2() {
	System.out.println("What is radius "+ c.getRadius());
    }
   
   Circle c = new Circle();
}



class Circle {
    double radius;

    Circle() {
	radius =1;
    }

    Circle(double newRadius) {
	radius = newRadius;	
    }

    double getRadius() {
	return radius;
    }

}
