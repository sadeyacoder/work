#first
class Main {
    public static void main(String[] args) {
        boolean sunny = true;
        boolean hot = false;

        if(sunny){
            if(hot){
                System.out.println("first op");
            }else{
                System.out.println("sec op");
            }
        }else{
            System.out.println("3rd op");
        }
    }
}

#seconddd
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

    
        System.out.print("Enter ANY day number (1-7): ");
        
        int day = scn.nextInt();

        switch(day){
            case 1:
                System.out.println("M");
                break;
            case 2:
                System.out.println("T");
                break;
            case 3:
                System.out.println("W");
                break;
            case 4:
                System.out.println("Th");
                break;
            case 5:
                System.out.println("Fr");
                break;
            case 6:
                System.out.println("Sa");
                break;
            case 7:
                System.out.println("Su");
                break;
            default:
                System.out.println("Invalid input! Please enter a number from 1 to 7.");
        }
    }
}