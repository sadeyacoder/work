#1

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.print("Enter number " + i + ": ");
            int n = scn.nextInt();

            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }

            if (n <= 1) {
                System.out.println("it is not prime");
            } else if (count == 0) {
                System.out.println(" it is prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}

#2

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number to find prime factorixation ");
        int n = scn.nextInt();

        for(int div = 2; div * div <= n; div++){
            while(n % div == 0){
                n = n / div;
                System.out.print(div + " ");
            }
        }
        if(n != 1){
            System.out.print(n);
        }
    }
}

#3

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter lowest value");
        int low = sc.nextInt();

        System.out.print("Enter highest value ");
        int high = sc.nextInt();

        for(int n = low; n <= high; n++){
            if (n <= 1) continue; /

            int count = 0;
            for(int div = 2; div * div <= n; div++){
                if(n % div == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(n);
            }
        }
    }
}