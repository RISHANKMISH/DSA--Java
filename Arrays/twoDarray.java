import java.util.*;

class twoDarray{


    public static void main(String[] args){

        int [] [] arr= new int[3][3];


        // int [][] array= {           
        //     {1,2,3,4},
        //     {44,33,55},
        //     {12,13,14}

        // };


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the values: ");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                arr[i][j]= sc.nextInt();
            }
        }
         
        System.out.println(arr[1][2]);
        
    }
}