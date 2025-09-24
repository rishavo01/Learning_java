public class TERNARY_OPERATOR {
    public static void main(String[] args){
        int score = 70;
        int time = 24;
        int salary = 60000;

        String passOrFail= (score >= 50) ? "Pass" : "fail";
        System.out.println(passOrFail);


        String evenOrOdd = (score %2 ==0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);



        String DayTime = (time <12) ? "A.M" : "P.M";
        System.out.println(DayTime);


        double TaxRate = (salary >= 40000) ? 0.25 :0.15;
        System.out.println(TaxRate);

        



    }
}
