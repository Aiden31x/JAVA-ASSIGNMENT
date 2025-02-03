package PrimitiveDataTypesDemo;

public class Main {
    // Declaring instance variables of all primitive data types
    byte byteVal;
    short shortVal;
    int intVal;
    long longVal;
    float floatVal;
    double doubleVal;
    char charVal;
    boolean boolVal;

    public static void main(String[] args) {
        Main obj = new Main();

        System.out.println("Default values of primitive data types:");
        System.out.println("byte: " + obj.byteVal);
        System.out.println("short: " + obj.shortVal);
        System.out.println("int: " + obj.intVal);
        System.out.println("long: " + obj.longVal);
        System.out.println("float: " + obj.floatVal);
        System.out.println("double: " + obj.doubleVal);
        System.out.println("char: [" + obj.charVal + "]");
        System.out.println("boolean: " + obj.boolVal);
    }
}
