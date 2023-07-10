import java.util.Scanner;

class Sorting{
    int[] sorting(int room1,int room2,int room3)
    {
        int[] array = {room1,room2,room3};
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                int temp = 0;
                if (array[j] < array[i]) {

                    // Swapping
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int l1 = scanner.nextInt();
        int l2 = scanner.nextInt();
        int l3 = scanner.nextInt();
        int total_number_students = scanner.nextInt();
        int answer=0;

        Sorting sorting = new Sorting();
        int[] sorted_array = sorting.sorting(l1,l2,l3);
        if(total_number_students<=sorted_array[0])
        {
            answer = sorted_array[0];
        } else if (total_number_students<=sorted_array[1]) {
            answer = sorted_array[1];
        }
        else if (total_number_students < sorted_array[2]){
            answer =sorted_array[2];
        }
        else {
             System.out.println("No lab fit for this capacity");
        }

        if(answer==0){

        }
        else if(answer==l1)
        {
            System.out.println("L1");
        } else if (answer==l2) {
            System.out.println("L2");
        }
        else {
            System.out.println("L3");
        }
        scanner.close();
    }
}
