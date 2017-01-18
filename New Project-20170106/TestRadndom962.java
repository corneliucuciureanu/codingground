import java.util.Random;

class TestRandom962 {
    public static void main(String[] args) {

	System.out.println("Random dupa timpul curent \t Random dupa valoarea fixa seed= 23");
	
	for(int i=0;i<15;i++) {
	  
	Random rand1 = new Random();
	System.out.print("int "+rand1.nextInt()+"\tboolean "+ rand1.nextBoolean());

	Random rand2 = new Random(23);
	System.out.println("\t int "+rand2.nextInt()+"   boolean "+ rand2.nextBoolean());
	}
    }

}

