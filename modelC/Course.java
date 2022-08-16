public class Course
{
   private int courseId;
   private String courseName;
   private String courseCode;

   public Course(int id, String name, String code)
   {
      this.courseId = id;
      this.courseName = name;
      this.courseCode = code;
   }

   public int getCourseId(){return this.courseId;}
   public String getCourseName(){return this.courseName;}
   public String getCourseCode(){return this.courseCode;}

   public String toString()
   {
      return courseId + ", " + courseCode;
   }
}
