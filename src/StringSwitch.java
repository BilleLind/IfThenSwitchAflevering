public class StringSwitch {
    public static int getDayNumber(String day) {

        int dayNumber = 0;

        if(day == null ) {
            System.out.println("A week has only 7 days!");
            return dayNumber;
        }

        switch (day.toLowerCase()) {
            case "monday":
                dayNumber = 1;
                break;
            case "tuesday":
                dayNumber = 2;
                break;
            case "wednesday":
                dayNumber = 3;
                break;
            case "thursday":
                dayNumber =4;
                break;
            case "friday":
                dayNumber =5;
                break;
            case "saturday":
                dayNumber =6;
                break;
            case "sunday":
                dayNumber =7;
                break;
            default:
                dayNumber =0;
                break;
        }
        return dayNumber;


    }
}
