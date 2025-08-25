import java.util.Scanner;

public class PairsInAnArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the element: \n");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                System.out.print("(" + arr[i] +","+arr[j]+")");
            }
            System.out.println();
        }
    }
}
