/*
 Check point 9.24 Daniel Ling pag 349
*/
public class CP924{
	public static void main(String[] args) {
	    	//CP924 test1 = new CP924(); // pentru test fara static la swap
		Circle circle1 = new Circle(1);
		Circle circle2 = new Circle(2);
		System.out.println("\nBefore swap1: circle1= "+circle1.radius +
			" circle2=  "+circle2.radius);
	
		//test1.
		swap1(circle1, circle2);
		System.out.println(" After swap1: circle1= "+circle1.radius +
			" circle2=  "+circle2.radius);

		Circle circle3 = new Circle(1);
		Circle circle4 = new Circle(2);
		System.out.println("\nBefore swap2: circle3= "+circle3.radius +
			" circle4=  "+circle4.radius);

		//test1.
		swap2(circle3, circle4);
		System.out.println(" After swap2: circle3= "+circle3.radius +
			" circle4=  "+circle4.radius);

	}

	public static void swap1(Circle x, Circle y) {
		Circle temp =x;
		x=y;
		y=temp;
		System.out.println("in swap "+x.getRadius()+"    "+y.getRadius());
	}

	public static void swap2(Circle x, Circle y) {
	 	double temp =x.radius;
		x.radius = y.radius;
		y.radius = temp;

		System.out.println("in swap "+x.getRadius()+"    "+y.getRadius());
	}
}

class Circle { 
	double radius;

	Circle(double newRadius) {
		    radius = newRadius;
	}

	public double getRadius() {
		return radius;
	}
}

