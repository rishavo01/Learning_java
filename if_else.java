import java.util.Scanner;

import javax.sql.rowset.serial.SerialStruct;
public class if_else {
    public static void main(String[] agrs){
        Scanner object = new Scanner(System.in);
    //  group = A

    String name;
    System.out.print("Enter you name: ");
    name = object.nextLine();

    if (name.isEmpty()){
        System.out.println("You didn't enter your name!");
    }else{
        System.out.println("Hello " + name +" !");
    }





    // group = B
        int age;
        System.out.print("Enter you age: ");
        age =object.nextInt();


       if(age > 40){
           System.out.println("You are a senior, you're welcome");
       }else if(age >= 18){
           System.out.println("You can enter in bar");
       }else{
            System.out.println("You are still a child");
       }


    //    group C

    boolean isStudent;

    System.out.print("You are student or not: ");
    isStudent = object.nextBoolean();


    if (isStudent){
        System.out.print("You are a student");
    }else{
        System.out.print("You are not a student");
    }



       


    }
}
