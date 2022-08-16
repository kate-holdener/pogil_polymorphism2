public class Driver
{
   public static void sort(Course []values)
   {
      for (int i = 0; i < values.length; i++)
      {
         Course minValue = values[i];
         int minIndex = i;
         // find the "smallest" value in the remaining array
         for (int j = i; j < values.length; j++)
         {
            if (values[j].getCourseId() < minValue.getCourseId())
            {
               minValue = values[j];
               minIndex = j;
            }
         }
         // swap the "smallest" value with the value at index i
         values[minIndex] = values[i];
         values[i] = minValue;
      }
   }

   public static void sort(Student []values)
   {
      for (int i = 0; i < values.length; i++)
      {
         Student minValue = values[i];
         int minIndex = i;
         // find the "smallest" value in the remaining array
         for (int j = i; j < values.length; j++)
         {
            if (values[j].getId() < minValue.getId())
            {
               minValue = values[j];
               minIndex = j;
            }
         }
         // swap the "smallest" value with the value at index i
         values[minIndex] = values[i];
         values[i] = minValue;
      }
   }



   public static void printArray(Object []values)
   {
      for (int i = 0; i < values.length; i++)
      {
         System.out.println(values[i]);
      }
   }

   public static void main(String []args)
   {
      Course []courses = new Course[3];
      courses[0] = new Course(543412, "Intro to Java", "CSCI201");
      courses[1] = new Course(246453, "English Composition", "ENG320");
      courses[2] = new Course(334134, "Calculus I", "MATH201");

      System.out.println("Courses BEFORE sorting");
      printArray(courses);
      sort(courses);

      System.out.println("\nCourses AFTER sorting");
      printArray(courses);

      System.out.println("\n********************\n");

      Student []students = new Student[4];
      students[0] = new Student(1234567890, "Braun", "Jack");
      students[1] = new Student(1345678901, "Johnson", "Angela");
      students[2] = new Student(1222233333, "Jordan", "Michael");
      students[3] = new Student(2123412344, "Hopper", "Grace");

      System.out.println("Students BEFORE sorting");
      printArray(students);

      sort(students);
      System.out.println("\nStudents AFTER sorting");
      printArray(students);
   }
}
