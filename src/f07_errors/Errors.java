package f07_errors;

public class Errors {
    public static void main(String[] args) {
        System.out.println("Errors");

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }

        try {
            throw new IllegalArgumentException("IllegalArgumentException");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
