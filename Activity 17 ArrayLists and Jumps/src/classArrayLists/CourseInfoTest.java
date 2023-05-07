package classArrayLists;
import java.util.Scanner;
public class CourseInfoTest {
    public static void main(String[] args) {
        CourseInfo courseInfo = new CourseInfo();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter course information (course name, GPA, score, letter grade), or 'q' to quit:");
        while (true) {
            System.out.println("Course Name or q to quit: ");
            String courseName = scanner.nextLine();
            if (courseName.equalsIgnoreCase("q")) {
                break;
            }
            System.out.print("GPA: ");
            double gpa = Double.parseDouble(scanner.nextLine());

            System.out.print("Score: ");
            int score = Integer.parseInt(scanner.nextLine());

            System.out.print("Letter Grade: ");
            String letterGrade = scanner.nextLine();


            courseInfo.addItem(courseName, gpa, score, letterGrade);
        }
        courseInfo.printCourseInfoTable();

        scanner.close();
    }
}
