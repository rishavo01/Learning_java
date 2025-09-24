import java.util.Scanner;
public class reactangle_area {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);

        double width = 0;
        double length = 0;
        double area = 0;


        System.out.print("Enter you width :");
        width = object.nextDouble();


        System.out.print("Enter your Length :");
        length= object.nextDouble();


        area = width * length;
        System.out.print("You total area is : " + area);


        object.close();



    }
    
}
