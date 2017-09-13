import java.util.Date;
import java.io.*;
import java.util.*;
import java.util.Scanner;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		public static void main(String args[])
      		{
         			 String name;
         			 int roll, math, phy, eng;
           			 Scanner SC=new Scanner(System.in);
           			 System.out.print("Enter Name: ");
          			 name=SC.nextLine();
         			 System.out.print("Enter Roll Number: ");
          			 roll=SC.nextInt();
			System.out.println("Enter dob");
			dateofbirth=SC.nextInt();
			System.out.println("Enter age");
			age=SC.nextInt();
			System.out.println("Enter avgmarks");
			avgmarks=SC.nextInt();
          			 System.out.print("Enter marks in Maths, Physics and English: ");
          			 math=SC.nextInt();
          			 phy=SC.nextInt();
          			 eng=SC.nextInt();
           			 int total=math+eng+phy;
          			 float perc=(float)total/300*100;
           			 System.out.println("Roll Number:" + roll +"\tName: "+name);
          			 System.out.println("Marks (Maths, Physics, English): " +math+","+phy+","+eng);
          			 System.out.println("Total: "+total +"\tPercentage: "+perc);
            		}
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		name=n;
		int var=34;
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student)
	 {
		// Add your implementation here
		
   	 }

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index)
	{
		// Add your implementation here
		Scanner kb = new Scanner(System.in);
		Student student = new Student();
		String FirstName;
        		String LastName;
       		int HouseNum;
       		String Street;
       		String City;
       		String State;
       		int Zip;
        		String Line2;
		System.out.println("\tInput Information");
       		System.out.println("\tFirst Name:");
        		FirstName = kb.nextLine();
        		System.out.println("\tLast Name:");
       		LastName = kb.nextLine();
        		System.out.println("\tHouse Number:");
        		HouseNum = Integer.parseInt(kb.nextLine());
       		System.out.println("\tStreet:");
        		Street = kb.nextLine();
       		System.out.println("\tCity:");
        		City = kb.nextLine();
       		System.out.println("\tState:");
        		State = kb.nextLine();
       		System.out.println("\tZip Code:");
       		Zip = Integer.parseInt(kb.nextLine());
        		System.out.println("\tExtra Information:");
        		Line2 = kb.nextLine();
		System.out.println("\nStudent:\t" + LastName + ", " + FirstName);
        		System.out.println("ANum:\t\t" + student.getANum());
        		System.out.println("Address:\t" + HouseNum + " " + Street);
       		System.out.println("\t\t" + City + ", " + State + " " + Zip);
       		System.out.println("\t\t" + Line2);
		//students.setAddress( HouseNum, Street, City, State, Zip, Line2 );
     		System.out.println("\tYour Student was Successfully Added");
	}

	@Override
	public void remove(int index)
	{
		// Add your implementation here
		Scanner kb = new Scanner(System.in);
        `		System.out.println("Who would you like to remove?");
        		ViewStudents();
		for (int j = Integer.parseInt(kb.nextLine()); j < students.length - 1; j++)
		{
            			students[j] = students[j + 1];
 		}
		students[students.length - 1] = null;
	}
	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		boolean swapped = true;
      		int j = 0;
     		int tmp;
     		while (swapped) {
            		swapped = false;
           		 j++;
            		for (int i = 0; i < arr.length - j; i++) {                                       
                 		 if (arr[i] > arr[i + 1]) {                          
                        	tmp = arr[i];
                        	arr[i] = arr[i + 1];
                        	arr[i + 1] = tmp;
                       	swapped = true;
                  }
            	}                
      	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return birthdate;
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return firstdate;
		return lastdate;
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return date;
		return days;
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return agebydate;
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return age;
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return marks;
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
