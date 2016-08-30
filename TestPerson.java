class Person {
   private String name, address;

   public Person(String name, String address) {
      this.name = name;
      this.address = address;
   }
   
   public String getName() {
      return name;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   public String toString() {
      return name + "(" + address + ")";
   }
}

 class Student extends Person {
   private String program;
   private int year; 
   private double fee;

   public Student(String name, String address, String program1, int year1, double fee1) {
      super(name, address);
     program = program1;
    year = year1;
    fee = fee1;
    }

   public String getProgram() {
      return program;
   }
   public void setProgram(String program) {
      this.program = program;
   }
   
   public void setYear(int year) {
      this.year = year;
   }
   public int getYear(){
       return year;
   } 
  
   public void setFee(double fee) {
      this.fee = fee;
   }
   public double getFee(){
       return fee;
   } 
   @Override
   public String toString() {
      return "Student: " + super.toString() + " , " + getProgram() + " , " + getYear() + " , " + getFee();
   }
    
}

 class Staff extends Person {
   private String school;
   private double pay;

   public Staff(String name, String address, String school1, double pay1) {
      super(name, address);
     school = school1;
    pay = pay1;
    }

   public String getSchool() {
      return school;
   }
   public void setSchool(String school) {
      this.school = school;
   }
   
   public void setPay(double pay) {
      this.pay = pay;
   }
   public double getPay(){
       return pay;
   } 
   @Override
   public String toString() {
      return "Student: " + super.toString() + " , " + getSchool() + " , " + getPay() ;
   }
    
}

public class TestPerson {
   public static void main(String[] args) {
       Student s1 = new Student("Tan Ah Teck", "1 Happy Ave","java",2,5000.00);
       System.out.println("Student : " + s1.toString() );
       Staff s2 = new Staff("Ram ", "Tpt", " ZPHS",10000.00);
       System.out.println("Staff : " + s2.toString() );
       
	}
}