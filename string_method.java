public class string_method {
    public static void main(String[] args){
        String name = "Rishav Singh";

         /* int length = name.length();
         char letter = name.charAt(0);

         System.out.println(length);
         System.err.println(letter); */

        //  UpperCase

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim();
        // name = name.replace("R", "K");
        // System.out.println(name);



        // isEmpty

        // if (name.isEmpty()){
        //     System.out.println("this is Empty");
        // }else{
        //     System.out.println("this is not Empty");
        // }


        // contain => it check it has is the variable filled with white space

        /* if(name.contains(" ")){
            System.out.println("this contain white space");
        }else{
            System.out.println("this does not contain white space");
        } */

        if (name.equalsIgnoreCase("Password")) {
            System.out.println("You password can't be Password");
        }else{
            System.out.printf("Hello %s",name);
        }
    }
}
