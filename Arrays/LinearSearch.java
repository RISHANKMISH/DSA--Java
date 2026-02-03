import java.util.*;

class LinearSearch{

    // public static void main(int [] args){

    //     String name= "Rishank";

    //     char target= 't';

    //     int index= searchmodule(name, target);

    //     if (index== -1) {
    //         System.out.println("Element not found");
    //     }

    //     else{
    //         System.out.println("Element found");
    //     }


    // }

    // static int searchmodule(String variable, char target){

    //     if (variable.length()==0){
    //         return -1;
        
    //     }

    //     for (int i=0; i<variable.length(); i++){
    //         if (target==variable.charAt(i)){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    
    public static void main(String [] args){
        
        int[][] arr= {
            {1,2,3},
            {11,22,33},
            {111,222,333}
        };
    
        int target= 222;
    
        int index= search(arr, target);
    
        if (index== -1){
            System.out.println("Element not found");
        }
    
        else{
            System.out.println("Element found at "+ index);
        }
       
    }
    
    
    static int search (int [] [] arr, int target){
     
        for (int i= 0; i<arr.length; i++){
            for (int j= 0; j<arr[i].length;j++){
                if (target== arr[i][j]){
                    return i;
                }
            }
        }
        return -1;
    }
}