import java.util.Scanner;

public class MAD_LIBS_GAME {
    public static void main(String[] args){
        Scanner Object = new Scanner(System.in);
        
        String adjective1;
        String noun1;
        String adjective2;
        String verbs;
        String adjective3;


        System.out.print("\n Enter an adjective (description) :");
        adjective1 = Object.nextLine();
        System.out.print("Enter an noun (animal and person) :");
        noun1= Object.nextLine();
        System.out.print("Enter an adjective (description) :");
        adjective2=Object.nextLine();
        System.out.print("Enter a verb end with -ing (action) :");
        verbs=Object.nextLine();
        System.out.print("Enter an adjective (description) :");
        adjective3=Object.nextLine();




        System.out.println("\n Today I went to a "+ adjective1 + " zoo "); 
        System.out.println("In an exhibit, I saw a " + noun1 +".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verbs + "!");
        System.out.println("I was " + adjective3 + "!");

        Object.close();
    }
    
}
 