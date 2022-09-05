
 abstract class Mnimal{
    abstract void walk();

    
}
class Horse extends Mnimal{
public void walk(){
    System.out.println("walk on  4 leg");
}
}
 class Cheken extends Mnimal{
     public void walk(){
         System.out.println("walk on  2 leg");
     }
 }

public class animal {
    public static void main(String args[]){
Horse horse=new Horse();
horse.walk();
    }
}
