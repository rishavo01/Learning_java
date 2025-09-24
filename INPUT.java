import java.util.Scanner;
public class INPUT {
    public static void main (String[] args){

        Scanner Object = new Scanner(System.in);
        System.out.print("Enter you name ");
        String name = Object.nextLine();


        System.out.print("Enter your age: ");
        int age = Object.nextInt();


        System.out.print("Enter Your GPA: ");
        float GPA = Object.nextFloat();


        System.out.println("Are you a Student? (true/false): ");
        boolean isStudent = Object.nextBoolean();


        
        
        System.out.println("Hello " + name);
        System.out.println("Hey your age is: " + age);
        System.out.println("Hey and your GPA is " + GPA);
        System.out.println("Your are Student " + isStudent);


        if(isStudent == true){
            System.out.println("You are Student");

        }else{
            System.out.println("You are not a Student");
        }

        Object.close();


    }
}
