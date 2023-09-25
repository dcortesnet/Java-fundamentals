package f05_functions;

public class Main {
    public static void main(String[] args) {
        Functions functions = new Functions("FunctionName", 10);
        Functions.staticMethod();
        functions.instanceMethod();
        System.out.println(functions.getName());
        System.out.println(functions.getNumber());
        functions.setName("NewFunctionName");
        functions.setNumber(10);
        System.out.println(functions.getName());
        System.out.println(functions.getNumber());
    }
}
