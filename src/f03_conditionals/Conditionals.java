package f03_conditionals;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        System.out.println("Conditionals");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please set age: ");
        int age = scanner.nextInt();

        if(age < 18){
            System.out.println("he is  minor than 18 years");
        } else if(age >= 18 && age <= 21){
            System.out.println("he is has between 18 and 21 years");
        } else {
            System.out.println("he has more than 21 years ");
        }

        System.out.println("Switch case");
        System.out.println("Please set option: [1-3]: ");
        int option = scanner.nextInt();;
        switch (option){
            case 1:
                System.out.println("Option1");
                break;
            case 2:
                System.out.println("Option 2");
                break;
            case 3:
                System.out.println("Option 3");
                break;
            default:
                System.out.println("This option is not valid");
                break;
        }
    }
}
