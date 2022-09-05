interface Mompany{
 public  void walk();
}
class Horse implements Mompany{
    public void walk(){
        System.out.println("walk on 4 leg");
    }
}

public class mono {
    public static void main(String args[]){
         Horse animal=new Horse();
animal.walk();
    }
}
