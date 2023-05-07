package stringArrayList;
import java.util.ArrayList;

public class StringArrayList {
    private ArrayList<String> studentScores;

    public StringArrayList(){
        studentScores = new ArrayList<>();
    }
    public void addScore(String score){
        studentScores.add(score);
    }
    public void removeScore(String score){
        studentScores.remove(score);
    }
    public int getSize(){
        return studentScores.size();
    }
    public String getScoreByIndex(int index){
        if(index >= 0 && index < studentScores.size()){
            return studentScores.get(index);
        }else{
            return null;
        }
    }
    public void displayScoresForEach(){
        System.out.println("Scores using for each loop:");
        for(String score : studentScores){
            System.out.println(score);
        }
    }
    public void displayScoresForLoop(){
        System.out.println("Scores using regular for loop:");
        for(int i = 0; i < studentScores.size(); i++){
            System.out.println(studentScores.get(i));
        }
    }
}
