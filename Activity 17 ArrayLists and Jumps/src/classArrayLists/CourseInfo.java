package classArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseInfo {
    private ArrayList<String> courseNames;
    private ArrayList<Integer> scores = new ArrayList<>();
    private ArrayList<String> letterGrades = new ArrayList<>();
    private ArrayList<Double> gpas = new ArrayList<>();

    public CourseInfo(){
        courseNames = new ArrayList<>();
        gpas = new ArrayList<>();
        scores = new ArrayList<>();
        letterGrades = new ArrayList<>();
        }

        public void addItem(String courseName, double gpa, int score, String letterGrade){
        courseNames.add(courseName);
        gpas.add(gpa);
        scores.add(score);
        letterGrades.add(letterGrade);
        }

        public void printCourseInfoTable(){
            System.out.println("Course Name\tGPA\tScore\tLetter Grade");
            for(int i = 0; i < courseNames.size(); i++){
                System.out.println(courseNames.get(i) + "\t\t" + gpas.get(i) + "\t" + scores.get(i) + "\t\t" +
                        letterGrades.get(i));
            }
        }
}
