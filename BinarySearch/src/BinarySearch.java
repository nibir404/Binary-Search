import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Element ");
        int []arr = new int[4];
        for (int i=0 ; i<arr.length;i++){
            arr[i]=input.nextInt();
        }

        int Beg = 0;
        int end = arr.length-1;
        int mid = (Beg+end)/2;


        System.out.println("chose your Specific elements ");
        int n = input.nextInt();

       while (Beg<=end){

           if (arr[mid] < n){

                 Beg = mid+1;
        }
            else if (arr[mid] == n ){
               System.out.println("Element is found at index : "+mid);
               break;
        }
            else {
                 end = mid-1;
           }
            mid =(Beg+end)/2;
       }

       if (Beg>end){

           System.out.println("item not found");
           System.out.println("Try Again!!!!!");
       }

    }

}
