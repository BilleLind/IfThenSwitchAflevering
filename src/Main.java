public class Main {
    public static void main(String[] args) {

        int a;
        int b;
        int c;

//1.1
        a= 11;
        b=5;
        c=3;
     if (Opgave.hej(a, b, c).equals("a er størst")) {
         System.out.println("pass");
     } else System.out.println("fail");

//1.2

        a=9;
        b=9;
        c=9;
        if (Opgave.hej(a,b,c).equals("alle er lige store")) {
            System.out.println("pass");
        }else System.out.println("fail");

// hvilket nummer har idag?
        System.out.println("dagen i dag har nummer");
        String day ="thursday";

        int returnedDaynumber = StringSwitch.getDayNumber(day);

        if (returnedDaynumber == 0) {
            System.out.println("invalid day");
        }else System.out.println(returnedDaynumber);









    }
}
