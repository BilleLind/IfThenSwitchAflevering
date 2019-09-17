public class Opgave {
    public static String hej(int a, int b, int c) {
        String result = "alle er lige store";

        if (a > b && a > c) {
            System.out.println("a er størst");
            return result = "a er størst";
        } else if (b > a && b > c) {
            System.out.println("c er størst");
            return result = "c er størst";
        } else if (c > a && c > b) {
            System.out.println("b er størst");
            return result = "b er størst";
        }

        return result;


    }

}
