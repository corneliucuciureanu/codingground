/* UML of Student class: 

	           Student 									class name
   ---------------------------------------------
*		esteStudent : boolean							data fields

*		Student()										connstructors
*		Student(esteStudent : boolean)

*		getEsteStudent() : boolean						methods
*		setEsteStudent(esteStudent : boolean) : void		
*/

public class Student {
   /** Main method */
    public static void main(String []8args) {
    	//create 1 object of Student type
    	Student std1 = new Student();
        System.out.println("Std-"+std1.getEsteStudent());
        // create second object of student type 
        Student std2 = new Student(false);
        System.out.println("Std- "+std2.getEsteStudent());
    }
    // Data field of class Student
    boolean esteStudent=false;
    
    /** Constructor of Student with no argument */
    Student(){
        esteStudent = true;
    }
    
    /**Constructor of Student with 1 argument */
   Student(boolean esteStudent)  {
   		this.esteStudent = esteStudent;
   }

   /** Return the esteStudent data field status */
   public boolean getEsteStudent() {
   	return esteStudent;
   }

   /** Set the value of data field esteStudent*/
   public void setEsteStudent(boolean esteStudent) {
   	this.esteStudent = esteStudent;
   }
}
