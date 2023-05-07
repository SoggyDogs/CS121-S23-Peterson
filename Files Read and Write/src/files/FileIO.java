package files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile1 = new File("C:/Users/peter/OneDrive/Desktop/courses.txt");
        //or
        File inputFile2 = new File("courses.txt");

        Scanner console = new Scanner(inputFile1);

        while (console.hasNextLine()) {
            String line = console.nextLine();
            System.out.println(line);
        }
        console.close();

        try {
            Scanner input = new Scanner(inputFile2);

            String header = input.nextLine();
            System.out.println(header);

            while (input.hasNextLine()) {
                String course = input.next();
                //tring line2 = input.nextLine();
                int credits = Integer.parseInt(input.next());
                int score = Integer.parseInt(input.next());
                System.out.printf("%-7s %3d %7d\n", course, credits, score);
            }
            input.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.err.println("File not found.");
        }

    }
}
