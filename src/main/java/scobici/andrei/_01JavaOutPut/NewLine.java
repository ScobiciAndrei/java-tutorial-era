package scobici.andrei._01JavaOutPut;
/**
 * How to print new line and tab in string
 * */
public class NewLine {
    public static void main(String[] args) {
        System.out.println("Hello world" + "\n" + "Welcome");

        String stringa1 = "Hello Andrei";
        String stringa2 = "Come stai ?";


        String intro = stringa1 + System.lineSeparator() + stringa2;
        System.out.println(intro); // Separa le 2 stringhe in 2 righe diverse

        System.out.println(stringa1 + "\r\n" + stringa2); // Separa le 2 stringhe in 2 righe diverse

        System.out.println(stringa1 + "\t" + stringa2); // Lascia spazio tra le 2 stringhe



    }
}
