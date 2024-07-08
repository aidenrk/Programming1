import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {
        System.out.println("In the lines below, please enter 5 numbers.  They do not have to be whole numbers: ");

        int i = 0;
        double total = 0;
        double[] entries = {0,0,0,0,0};
        Scanner scanner = new Scanner(System.in);
        while(i < 5){
            System.out.println("Please enter a number: ");
            entries[i] = scanner.nextDouble();
            total = total + entries[i];
            i++;
        }
        /// Calculating the values to display.

        // Average
        double avg = total / 5;

        // Max & Min
        double max = entries[0];
        double min = entries[0];
        for (int index = 0; index < entries.length; index++) {
            if(entries[index] > max) {
                max = entries[index];
            }
            if(entries[index] < min) {
                min = entries[index];
            }
        }

        // Interest
        double interest = total * .20;

        //Displaying values
        System.out.println("The total of the numbers entered was: " + total);
        System.out.println("The average was: " + avg);
        System.out.println("The maximum was: " + max);
        System.out.println("The minimum was: " + min);
        System.out.println("The total interest owed at 20% would be: $" + interest);       
}
}
