import java.util.ArrayList;
import java.util.Collections;

public class Q3 {//Lab 5
    public static void main(String[] args) {
        
    
        ArrayList<Cars> cars = new ArrayList<>();
        
        Cars c2 = new Cars("Tesla", 2022 , "S");
        Cars c1 = new Cars("Ford", 2023 , "Mustang");
        Cars c3 = new Cars("Mazda", 2021 , "C30");
        Cars c4 = new Cars("Honda", 2001 , "S2000");
        Cars c5 = new Cars("Nissan", 2002 , "Z350");
        

        cars.add(c2);
        cars.add(c1);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);

        Collections.sort(cars);

        for(Cars c : cars){
            System.out.println("Brand "+c.brand+ " Model " +c.model+ " Year " +c.year);
        }

    }
}
class Cars implements Comparable<Cars>{
    String brand;
    int year;
    String model;
   
    public Cars(String brand, int year, String model ) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }

    @Override
    public int compareTo(Cars o) {
        return this.year - o.year;//para int
        //return brand.compareTo(o.brand);//para strings
        //return model.compareTo(o.brand);
    }
    
    

}