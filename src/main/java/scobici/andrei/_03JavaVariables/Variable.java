package scobici.andrei._03JavaVariables;

/**
 * Tipurile de date primitive
 */
public class Variable {
    /**
     * String - pentru a scrie un text
     * * int - pentru a da o valoarea intreaga numerala
     * * char - pentru a adauga un sigur caracter
     * * boolean - pentru a da o valoarea true sau false
     * float - pentru a da un numar float (pentru a face ca java sa stie ca e float adaugam f dupa numar)
     **/
    public static void main(String[] args) {
        String name = "Andrei";
        System.out.println("I print my name " + name);

        String lastName = "Scobici";
        System.out.println("I print my last name " + lastName);

        System.out.println("I print my name " + name + " and my last name " + lastName);

        int age = 28;
        System.out.println("I print my age " + age);
        System.out.println("I print my name " + name + " my last name " + lastName + " my age " + age);

        int myWeight;
        myWeight = 84;
        System.out.println("I am " + myWeight + " kg");

        myWeight = 86;
        System.out.println("Now my weight is " + myWeight); // this is a new value to my weight

        final int myLuckyNumber = 22;
        //myLuckyNumber = 7;  Generate error because we don't can modify a final type

        int number = 2;
        char letter = 'a';
        boolean myBoolean = true;
        float myFloatNumbers = 3.99f;
    }
}
