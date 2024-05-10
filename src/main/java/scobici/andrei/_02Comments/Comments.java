package scobici.andrei._02Comments;

/**
 * This is a class for showing how comments are working
 * press ctrl+Q to check the java doc
 *
 * @param - for input parameters
 * @return - result of the method
 * @throws - exceptionType - information about when throws this exception
 * @ deprecated - this method is deprecated  --this class is not good or is not for use
 * @since - specifies the version og the API in which the method was introduced.
 */
public class Comments {
    /***
     * @param args lista de argumente la startarea programului
     * Daca metoda are return atunci poti folosi @return pentru a descrie informatia despre return
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("I learn java");

        System.out.print("Hello" );
        System.out.print(" i print i same line ");

        //System.out.println(This line produce errore);
        System.out.println("this line have a comment"); //this line is good
    }
}
