public class Student {
    public static void main(String []args) {
    	Student std1 = new Student();
        System.out.println("Std-"+std1.getEsteStudent());

        Student std2 = new Student(false);
        System.out.println("Std- "+std2.getEsteStudent());
    }
    boolean esteStudent=false;
    
    Student(){
        esteStudent = true;
    }

   Student(boolean esteStudent)  {
   		this.esteStudent = esteStudent;
   }

   public boolean getEsteStudent() {
   	return esteStudent;
   }

   public void setEsteStudent(boolean esteStudent) {
   	this.esteStudent = esteStudent;
   }
}
