    import java.util.Scanner;

    public class INTEREST{
        public static void main(String[] agrs){
            Scanner obj = new Scanner(System.in);
            double p;
            double r;
            int compoundTimes;
            int years;
            double amount;


            System.out.print("Enter the principal amount: ");
            p = obj.nextDouble();

            System.out.print("Enter the rate of interest: ");
            r = obj.nextDouble();   

            System.out.print("Enter the number of compoundTimes: ");
            compoundTimes = obj.nextInt();

            System.out.print("Enter the number of yrs: ");
            years = obj.nextInt();

            amount = p * Math.pow(1 + r / compoundTimes, compoundTimes * years);

           System.out.printf("The amount after %d years is %.2f", years, amount);


            


        obj.close();
        }
        
    }
