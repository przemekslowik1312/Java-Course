package ptaszol69;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "238.65";
        numberString = numberString + "75.65";
        System.out.println("The result is: " + numberString);           //can't add

        String lastString = "15";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString value is " + lastString);        //can't add
        double doubleNumber = 239.88;
        lastString = lastString + doubleNumber;
        System.out.println("lastString = " + lastString);               //can't add

    }
}