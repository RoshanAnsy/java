import java.util.Scanner;

class Student{
    String name;
    int age;
    public void printinfo(String name){
        System.out.println(name);
    }
   
    public void printinfo(int age){
        System.out.println(age);

    }
    public void printinfo(String name,int age){
        System.out.println(name+" "+age);
    }

    
}

class arr{
   
    public static void main(String args[]){
      
Student s1=new Student();
s1.name="Roshan";
s1.age=10;

s1.printinfo(s1.name,s1.age);

    }
}