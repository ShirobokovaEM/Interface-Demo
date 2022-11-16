
package interfasedemo;

import java.util.Comparator;

public class Box implements Comparable<Box>{//после того как написали implements нажимаем лампочку в этом классе и выбираем все абстрактные классы
    
    private int a, b, c;

    public Box(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Box{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    public int volume(){//здесь пишем метод вычисления объема бокса
        return a * b * c;
    }

    @Override
    public int compareTo(Box rValue) {
        return volume() - rValue.volume();        
    }

    public int getB() {
        return b;
    }
    
    
    
   // public static Comparator<Box> compareByA(){//локальный класс
      //  class CMP implements Comparator<Box>{

        //    @Override
         //   public int compare(Box b1, Box b2) {
          //      return b1.a - b2.a;                
          //  }
            
       // }
        //return new CMP();
  //  }
    
    public static Comparator<Box> compareByA(){
        return new Comparator<Box>() {//локальныц анонимный класс
            @Override
            public int compare(Box b1, Box b2) {
                return b1.a - b2.a;
            }
        };
    }
    
    public static class CompareByA implements Comparator<Box> {//статичесекий внутренний класс
   // public class CompareByA implements Comparator<Box> {//обычный внутренний класс

        @Override
        public int compare(Box b1, Box b2) {
           return b1.a - b2.a;
        }
        
    }
    
}
