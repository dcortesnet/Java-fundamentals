package f04_loops;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Loops");

        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i);
        }

        int number = 1;
        while (number <= 5){
            System.out.println(number);
            number++;
        }
    }
}
