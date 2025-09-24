import java.util.Scanner;

public class WEIGHT_CONVERTER {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        double weight;
        double new_weight;
        int choice;

        System.out.println("Welcome Conversion Program");
        System.out.println("1. Covert lbs to Kgs");
        System.out.println("2. Convert kgs to lbs");


        System.out.print("Choose an option ");
        choice = obj.nextInt();

        if(choice == 1){
            System.out.println("Enter the weight in lbs: ");
            weight = obj.nextDouble();
            new_weight = weight * 0.45359237;
            System.out.println(new_weight);
        }else if(choice == 2){
             System.out.print("Enter the lbs in kg: ");
            weight = obj.nextDouble();
            new_weight = weight * 2.20462262180;
            System.out.println(new_weight);

        }else{
            System.out.println("Your choice this invaild.");
        }



        obj.close();
    }
    
}
