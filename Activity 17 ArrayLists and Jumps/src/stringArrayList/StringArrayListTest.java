package stringArrayList;

public class StringArrayListTest {
    public static void main(String[] args) {
        StringArrayList scoresList = new StringArrayList();

        scoresList.addScore("90");
        scoresList.addScore("85");
        scoresList.addScore("95");
        scoresList.addScore("88");

        System.out.println("Size of the scores list: " + scoresList.getSize());

        scoresList.displayScoresForEach();
        scoresList.displayScoresForLoop();

        scoresList.removeScore("95");

        scoresList.displayScoresForEach();

        String score = scoresList.getScoreByIndex(1);
        if(score != null){
            System.out.println("Score at index 1: " + score);
        }else{
            System.out.println("Invalid index.");
        }
    }
}
