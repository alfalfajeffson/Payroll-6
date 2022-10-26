import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("what is your name");
        String Name = in.next();

        System.out.println();
        System.out.println("How many hours did you work for");
        int hours = sc.nextInt();

        System.out.println();
        System.out.println("What is your hourly Pay Rate");
        Double payRate = sc.nextDouble();

        System.out.println();
        System.out.println("Hello," + Name);

        Double grossPay = hours * payRate;

        System.out.println();
        System.out.println();
        System.out.println("Your gross pay is $" + grossPay);

    }

}