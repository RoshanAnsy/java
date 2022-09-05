public class Dog
{
    // Instance Variables
    String name;
    String breed;
    int age;
    String color;
  static int population;
    // Constructor Declaration of Class
    public Dog(String name, String breed,
                   int age, String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
        Dog.population+=1;

    }
  
    // method 1
    public String getName()
    {
        return name;
    }
  
    // method 2
    public String getBreed()
    {
        return breed;
    }
  
    // method 3
    public int getAge()
    {
        return age;
    }
  
    // method 4
    public String getColor()
    {
        return color;
    }
  
    @Override
    public String toString()
    {
        return("Hi my name is "+ this.getName()+
               ".\nMy breed,age and color are " +
               this.getBreed()+"," + this.getAge()+
               ","+ this.getColor());
    }
  
    public static void main(String[] args)
    {
        Dog tuffy = new Dog("tuffy","papillon", 5, "white");
        System.out.println(tuffy.toString());
       System.out.println( tuffy.population);
       Dog butti=new Dog("bittu","mardromn", 10, "black");
       System.out.println(butti.toString());
       System.out.println( tuffy.population);
    }
}