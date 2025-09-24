import java.util.Scanner;
public class Math_class {
    public static void main (String[] args){
        Scanner object = new Scanner(System.in);

        // System.out.println(Math.PI);

        // Hypotenuse
        /* double a;
        double b;
        double c;

        System.out.print("Enter the value of a: ");
        a = object.nextDouble();

        System.out.print("Enter the value of b: ");
        b = object.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));

        System.out.print("The value of (Hypotenuse) c is " + c); */

        // circumference = 2 * Math.PI * radius

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = object.nextDouble();

        circumference = 2 * Math.PI * radius;
        System.out.println("The value of circumference is " + circumference);

        area = Math.PI * Math.pow(radius,2);
        System.out.printf("the value of area is %.1f cm%n" ,area);

        volume = (4.0/ 3.0) * Math.PI * Math.pow(radius,3);
        System.out.println("The value of voulme is " + volume);

        object.close();
    }
}
