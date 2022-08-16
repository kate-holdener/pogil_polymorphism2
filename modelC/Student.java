public class Student
{
   private int studentId;
   private String lastName;
   private String firstName;
   private float gpa;
   private Course[] coursesTaken;

   public Student(int id, String lastName, String firstName)
   {
      this.studentId = id;
      this.lastName = lastName;
      this.firstName = firstName;
   }

   public int getId(){return this.studentId;}
   public String getLastName(){return this.lastName;}
   public String getFirstName(){return this.firstName;}
   public float getGpa(){return this.gpa;}
   public int getNumCoursesTaken(){return coursesTaken.length;}

   public String toString()
   {
      return studentId + ", " + lastName + ", " + firstName;
   }
}
