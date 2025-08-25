import java.util.Scanner;

public class PrintAllSubarray {

    static void PrintAllSubarray(int[] arr ){
        int currentLocation = 0;
        int st = 0 ;
        int count = 1;
        int end = arr.length-1;
        while((st <= end)){
            if(currentLocation < end && currentLocation < st+ count){
                System.out.print(arr[currentLocation]+ " ");
                currentLocation++;

            }else if (currentLocation == end) {
                System.out.print(arr[currentLocation]);
                System.out.println();
                System.out.println();
                st++;
                count = 1;
                currentLocation = st;
            }

            if (currentLocation == st+count){
                System.out.println();
                count++;
                currentLocation = st;

            }
        }



    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i =0 ; i<5;i++){
            System.out.println("enter the element: ");
            arr[i] = input.nextInt();
        }


        PrintAllSubarray(arr);
        System.out.println(Character.BYTES);

    }

}
