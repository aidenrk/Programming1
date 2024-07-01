import java.text.DecimalFormat;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Please enter in your weekly income: ");
        Scanner scanner = new Scanner(System.in);
        int weeklyIncome =  Integer.valueOf(scanner.nextLine());
        double taxDue = 0;
        
        if (weeklyIncome < 500) {
            taxDue = weeklyIncome * .10;
        }
        if (weeklyIncome >= 500 && weeklyIncome < 1500){
            taxDue = weeklyIncome * .15;
        }
        if (weeklyIncome >= 1500 && weeklyIncome < 2500){
            taxDue = weeklyIncome * .20;
        }
        if (weeklyIncome >= 2500){
            taxDue = weeklyIncome * .30;
        }

        System.out.print("The amount of tax due is: $");
        System.out.println(df.format(taxDue));
        System.out.println("Thank you!");
    }
}
