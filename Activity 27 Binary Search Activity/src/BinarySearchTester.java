
import java.util.ArrayList;
import java.util.Scanner;
public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        BinarySearchDemo demo = new BinarySearchDemo();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(17);
        list.add(12);
        list.add(90);
        list.add(84);
        list.add(38);
        list.add(5);
        list.add(77);
        list.add(44);

        System.out.print("unsorted: ");
        for(int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        //sort array
        ArrayList<Integer> sortedList = selectionSort(list);
        System.out.print("sorted: ");
        for(int num : sortedList) {
            System.out.print(num + " ");
        }
        System.out.println();

        //search for number
        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(console.nextLine());

        int found = demo.binarySearch(key, sortedList);
        if(found == -1){
            System.out.println("Item not found.");
        }else{
            System.out.printf("Item found at index %d, position %d", found, found + 1);
        }

    }
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> unsortedList){
        ArrayList<Integer> sortedList = new ArrayList<Integer>(unsortedList);
        for(int i = 0; i < sortedList.size() - 1; i++){
            int min = i;
            for(int j = i + 1; j < sortedList.size(); j++){
                if(sortedList.get(j) < sortedList.get(min)){
                    min = j;
                }
            }
            int temp = sortedList.get(i);
            sortedList.set(i, sortedList.get(min));
            sortedList.set(min, temp);
        }
        return sortedList;
    }
}
