import java.util.ArrayList;
import java.util.Random;

public class Q2 {//Lab 5 copy array
    
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayQ2 = new ArrayList<Integer>();
        ArrayList<Integer> arrayQ2Copy = new ArrayList<>(arrayQ2);

        Random random = new Random();
        
        for( var i = 0; i < 10; i++){
            arrayQ2.add(random.nextInt(50));
        }
        //should use this way => arrayQ2Copy.addAll(arrayQ2Copy);       
        for (Integer value : arrayQ2){
            arrayQ2Copy.add(value);
        }
        arrayQ2.set(arrayQ2.size()-1, - 5);
        System.out.println("ArrayQ2     "+arrayQ2);  
        System.out.println("ArrayQ2Copy "+arrayQ2Copy);
        
    }
 
}

