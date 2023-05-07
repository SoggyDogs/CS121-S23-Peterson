package files;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutput {
    public static void main(String[] args)throws FileNotFoundException {
        File outputFile = new File("mycourses.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String course;
        String credits;
        String score;

        output.printf("%s %s %s\n", "course", "credits", "score");

        for (int i = 1; i <= 3; i++) {
            course = JOptionPane.showInputDialog(String.format("Enter name of course %d", i));
            credits = JOptionPane.showInputDialog("Enter the course credits");
            score = JOptionPane.showInputDialog("Enter the course score");

            output.printf("%s %s %s\n", course, credits, score);
        }
        output.close();
    }
}
