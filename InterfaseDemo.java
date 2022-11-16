
package interfasedemo;

import java.util.Arrays;
import java.util.Comparator;


public class InterfaseDemo {

    
    public static void main(String[] args) {
        
        Box[] boxes = {
          new Box(1, 10, 10),
          new Box(10, 1, 1),
          new Box(2, 10, 1)
        };
        
        //Arrays.sort(boxes);  //сортировка по обьему      
       // for (Box box : boxes) {
           // System.out.println(box);             
        //}
        
       // Box tmp = new Box(0, 0, 0);//сортировка по стороне А,это обычный внутренний класс
        //Box.CompareByA c = tmp.new CompareByA();
        // Arrays.sort(boxes, c);
         
        
        
         //Arrays.sort(boxes, new Box.CompareByA());//сортировка по стороне А,статический класс
         
         
         Arrays.sort(boxes, Box.compareByA());//локальный класс и анонимный класс
         
         for (Box box : boxes) {
             System.out.println(box);            
        }
         
        // Arrays.sort(boxes, new Comparator<Box>() {//анонимный класс
        //    @Override
        //    public int compare(Box b1, Box b2) {
        //        return b1.getB() - b2.getB();                
        //    }
        // });
         
          Arrays.sort(boxes, (b1,  b2) -> b1.getB() - b2.getB() //лямда выражение
        );
         
         for (Box box : boxes) {
             System.out.println(box);
        }
    }  
    
}
