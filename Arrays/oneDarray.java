import java.util.*;

class Introductory{
    public static void main(String[] args)  {
        Scanner sc= new Scanner (System.in);

        System.out.println("Enter the value of n: ");

        int n= sc.nextInt();

        int[] newArray= new int[n];

        System.out.println("Enter the values: ");

        for(int i= 0; i<n; i++){
            newArray[i]= sc.nextInt();
        }

        
        System.out.println("The value of 4th entry is: " + newArray[3]);


        int [] arr= new int[4];

        arr[0]= 1;

        System.out.println("Value of 3rd element of arr is: " + arr[0]);

        
    }
}