package f02_operators;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Operators");
        // Math operators
        System.out.println(1+1);
        System.out.println(10-5);
        System.out.println(6*2);
        System.out.println(8.0/2.0);
        System.out.println(10%3);

        // Assign operators
        String assign = "Hello World";

        // Comparison operators
        System.out.println(5==5);
        System.out.println(6!=3);
        System.out.println(8>5);
        System.out.println(4<7);
        System.out.println(6>=6);
        System.out.println(3<=2);

        // Logic operators
        System.out.println(true && true);
        System.out.println(false || true);
        System.out.println(!true);

        // Increment operators
        int sum = 5;
        sum++;
        System.out.println(sum);

        int res = 5;
        res--;
        System.out.println(res);

        // Concat operator
        String word1 = "Hello";
        String word2 = "Wold";
        String concat = word1 + " " + word2;
        System.out.println(concat);
    }
}
