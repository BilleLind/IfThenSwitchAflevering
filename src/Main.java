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

// hvilken dag er det?
        int day;
        day = 5;
        if (Intervals.days(day).equals("fredag uge 1")) {
            System.out.println("pass");
        } else System.out.println("fail");


        day =8;
        if (Intervals.days(day).equals("ukendt dag, ukendt uge")) {
            System.out.println("pass");
        }else System.out.println("fail");






    }
}
