package scobici.andrei._01JavaOutPut;
/**
 * This class show how to print a formatted text
 * printf - for printing formatted text
 * %s - is a placeholder for a string
 * %d - is a placeholder for an integer
 * %.1f is a placeholder for a floating-point number with 1 decimal place
 * */
public class FormattedText {
    public static void main(String[] args) {

        System.out.printf("Hello world");
        System.out.println();

        System.out.printf("Questa%nmette%nogni%nparola%nda%ncapo"); // Dopo il %n passa su una nuova riga
        System.out.println();

        int number = 54866;
        long number2 = 98865L;
        System.out.printf("%,d : %d",number,number2); //In questo esempio fa vedere come formata un int e un long
        System.out.println();

        String say = "Hello %s";
        say = String.format(say,"World");
        System.out.println(say);

        float floatNumber = 1234.12345f;
        double doubleNumber = 1234.12345;
        System.out.printf("%,.3f :: %,.5f" , doubleNumber,floatNumber); //Fa vedere come spostare la virgola .3f vuold dire che sposta di 000 zero
    }
}
