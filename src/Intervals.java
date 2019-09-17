public class Intervals {
        public static String days(int day) {
        String result ="ukendt dag, ukendt uge";

            switch (day) {
                case 1:  //break; kan ikke bruges da det gør alt andet unåeligt
                    System.out.println("mandag uge 1");
                    return result = "mandag uge 1";

                case 2:
                    System.out.println("tirsdag uge 1");
                    return result = "tirsdag uge 1";

                case 3:
                    System.out.println("onsdag uge 1");
                    return result = "onsdag uge 1";

                case 4:
                    System.out.println("torsdag uge 1");
                    return result = "torsdag uge 1";

                case 5:
                    System.out.println("fredag uge 1");
                    return result = "fredag uge 1";

                case 6:
                    System.out.println("lørdag uge 1");
                    return result = "lørdag uge 1";

                case 7:
                    System.out.println("søndag uge 1");
                    return result = "søndag uge 1";

                default:
                    System.out.println("ukendt dag, ukendt uge");
                    return result;


            }

        }

    }


