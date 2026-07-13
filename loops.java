#1

class Main {
    public static void main(String[] args) {
        for(int n=10; n>1; n--) {
            System.out.println("The value of n is: " +i);
        }
    }
}

#2
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter any  number (n): ");

        int n = scn.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum till " + n + " is " + sum + ".");
    }
}

#3
import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char choice;

        do
        {
            System.out.print("Enter a number of your choice");
            number = scn.nextInt();

            if(number > max)
            {
                max = number;
            }

            if(number < min)
            {
                min = number;
            }

            System.out.print("Do you want to continue, type  y/n? ");
            choice = scn.next().charAt(0);

        }while(choice=='y' || choice == 'Y');

        System.out.println(" theeee Largest number: " + max);
        System.out.println("theeee  Smallest number: " + min);
    }
}