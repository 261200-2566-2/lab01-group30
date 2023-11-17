import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter size: ");
        printSortedNumber(inputNumber(new Scanner(System.in)));
    }

    public static int[] inputNumber(Scanner s){
        int[] numbers = new int[s.nextInt()];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = s.nextInt();
        }
        return numbers;
    }


    public static void printSortedNumber(int[] numbers){
        Arrays.sort(numbers);
        System.out.println("Finish: ");
        for (int n : numbers){
            System.out.println(n);
        }
    }
}
