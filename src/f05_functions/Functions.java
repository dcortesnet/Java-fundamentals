package f05_functions;

public class Functions {

    private String name;
    private int number;

    public Functions(String name, int number){
       this.name = name;
       this.number = number;
   }

    public static void staticMethod(){
        System.out.println("Executed staticMethod!");
    }

    void instanceMethod(){
        System.out.println("Executed instanceMethod!");
    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
