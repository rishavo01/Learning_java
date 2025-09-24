import java.util.Random;


public class random_number {
    public static void main(String[] args){

        Random object = new Random();

        int number1;
        int number2;
        int number3;

        number1 = object.nextInt(1,6);
        number2 = object.nextInt(1,6);
        number3 = object.nextInt(1,6);


        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);                 

        // HEAD & TAIL GAME

        boolean isHead;

        isHead = object.nextBoolean();


        if(isHead){
            System.out.println("HEADS");
        }else{
            System.out.println("TAILS");
        }
    }
}
