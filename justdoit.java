public class justdoit {
    public static void main(String[] args) {
        // Student rahul=new Student("rohan",20);
        // rahul.print();
        // rahul.name="rahul";
        // rahul.data=20;
        // System.out.println(rahul.name);
        // System.out.println(rahul.data);
        final int a=20;
        a=30;
        System.out.println(a);

    }
}
class Student{
    float data;
    String name;

    Student(String name,float data){
        this.name=name;
        this.data=data;
    }
    void print(){
        System.out.println(name);
        System.out.println(data);
    }
}