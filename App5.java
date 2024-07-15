import java.util.Scanner;

public class App5 {
    public static void main(String[] args) throws Exception {
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int[] dailyTemp = {97,96,94,90,79,81,84};
        double[] avgTemp = {91.51,91.52,91.53,91.54,91.55,91.56,91.41,91.42};
        int total = 0;
        // These are the actual temperature values for my area.  Except they nearly all are 91.5.  I've added another decimal point to indicate different results for each output

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a day of the week, or enter 'week' to see the average temperature for all days.  ex. 'monday'");
        System.out.println("\nAll temperature values are shown in degrees fahrenheit");
        String input = scanner.nextLine();
        int key = 0;
        switch(input){
            case "monday":
                break;
            case "tuesday":
                key = 1;
                break;
            case "wednesday":
                key = 2;
                break;
            case "thursday":
                key = 3;
                break;
            case "friday":
                key = 4;
                break;
            case "saturday":
                key = 5;
                break;
            case "sunday":
                key = 6;
                break;
            case "week":
                key = 100;
                break;
        }

        if(key == 100) {
            for (int i = 0; i < dailyTemp.length; i++) {
                total = dailyTemp[i] + total;
            }
            int weeklyAvg = total / 7;
            for (int i = 0; i < days.length; i++) {
                System.out.println("\n" + days[i] + "'s temperature is: " + dailyTemp[i]);
            }
            System.out.println("\nAnd the weekly average is: " + weeklyAvg);
        }else{
            System.out.println("\n" + days[key] + "'s temperature is: " + dailyTemp[key]);
            System.out.println("Versus the average temperature of " + avgTemp[key]);
        }
    }
}
