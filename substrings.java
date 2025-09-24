import java.util.Scanner;

import javax.script.ScriptEngine;

public class substrings {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        // System.out.print("Enter you name : ");
        // obj.nextLine();
        
        
        /* String name;
        
        name = "Rishav Singh";
        String email = "rishav01@outloook.com";
        String UserName = email.substring(email.indexOf("@") + 1);
        // String newString = name.substring(6, 12);
        
        System.out.println(UserName); */

        String UserName;
        String Domain;
        String email;


        System.out.print("Enter your email : ");
        email = obj.nextLine();

        if(email.contains("@")){
            UserName= email.substring(0,email.indexOf("@"));
            Domain = email.substring(email.indexOf("@")+ 1);
            System.out.println(UserName);
            System.out.println(Domain);
        }else{
            System.out.println("Your Email doesn't contain @");
        }
        


        

        
        
        
        
        obj.close();
    }
}
