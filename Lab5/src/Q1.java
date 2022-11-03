import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Q1 {//Lab 5 show list
    
    public static void main(String[] args) {
        
        Random randon = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> q1List = new ArrayList<Integer>(10);
        
        for( int i = 0; i <= 10; i++){
            int k = randon.nextInt(50) ;
            q1List.add(k);
        }

        System.out.println(q1List);
        System.out.println("Isert one number!");
        int readNumber = scanner.nextInt();

        if(q1List.contains(readNumber)){ 
            System.out.println("The number " +readNumber+ " is in the list");
        }else{ 
            System.out.println("The number " +readNumber+ " ins't in the list");
        } 
        scanner.close();
    }

 
    

  
}
