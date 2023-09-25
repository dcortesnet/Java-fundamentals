package f01_datatypes;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Datatypes");
        byte myByte = 127; //  -128 a 127.
        short myShort = 32767; //  -32768 a 32767.
        int myInt = 2147483647; //  -2147483648 a 2147483647.
        long myLong = 9223372036854775807L;
        float myFloat = 3.14159265359f;
        double myDouble = 3.14159265359;
        boolean myBoolean = true;
        char myChar = 'A';
        String myString = "myString";
        String myNull = null;

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myBoolean);
        System.out.println(myChar);
        System.out.println(myString);
        System.out.println(myNull);
    }
}