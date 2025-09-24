import java.util.Scanner;

public class SecondProject {

    public static void main(String[] args){
        String item;
        double price; 
        int quantity;
        char currency = '$';
        double total;
        Scanner Object = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        item = Object.nextLine();

        System.out.print("What the price for each?: ");
        price = Object.nextDouble();

        System.out.print("How many would you to like?: ");
        quantity = Object.nextInt();

        total = price * quantity;

        System.out.print("\n You have bought " + quantity + " " + item +"/s");
        System.out.print("\n Your total is "+ currency + total);

        

        Object.close();



        
    }
}