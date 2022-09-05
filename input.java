import java.util.Scanner;

class Car{
    public
    String wheelStatus;
    int noOfwheels;

    car(String wheelStatus,int noOfwheels){
        this.wheelStatus=wheelStatus;
        this.noOfwheels=noOfwheels;

    }

void applyBreak(){
    wheelStatus="stop";
    System.out.println("stop the car using breake");
}


}

class Honda extends Car{
    public
    Boolean alloywheel;

    Honda(String wheelStatus,int noOfwheels,Boolean alloywheel){
        
    }


}








public class input {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // System.out.println("output is this  "  +a);
        // String st=sc.next();
        // System.out.println("string output is  "+st);
        // // int[] arr;
        // // arr=new int[5];
        // int [] arr=new int[5];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] +" ");
        // }


        int row=sc.nextInt();
        int colom =sc.nextInt();
        int [][] num=new int[row][colom];

        for(int i=0;i<row;i++){
            for(int j=0;j<colom;j++){
                num[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print( num[i][j] +" ");
            }
           // System.out.println();
        }
    }
}
