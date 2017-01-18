/*
check point java daniel liang 
original name of the class was Test
*/
class CP912 {
    public static void main(String[] args){
	A a = new A();
	a.print();
    }
}

class A {
    String s;
    
    A(String newS) {
	s = newS;
    }

    public void print() {
	System.out.print(s);
    }
}
