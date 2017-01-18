public class CP922 {
	private double radius = 1;

	/** find the area of this circle */
	public double getArea() {
		return radius * radius * Math.PI;    
	}

	public static void main(String[] args) {
		CP922 myCircle = new CP922();
		System.out.println("Radius is "+myCircle.radius);
	}
}
