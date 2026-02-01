import java.util.*;

class ArrayListinJava{

    public static void main(String[] args){
        

        Scanner sc= new Scanner(System.in);


        ArrayList <Integer> list= new ArrayList<> ();
        

        list.add(92);
        

        while (true){
            int x = sc.nextInt();

            if(x == -1){
                break;
            }
            list.add(x);
        }

        list.set(0,99);

        list.remove(3);


        System.out.println(list);

    }
}