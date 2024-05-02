package scobici.andrei._01JavaOutPut;

/**
 * Questa classe serve per assegnare e printare
 * */
public class PrintExamples {

    public static void main(String[] args) {
        String name1 = "Eugeniu";
        String name2 = "Andrei";

        //Numele sunt printate in 2 randuri separate deoarece :
        // "println" printeaza si trece din rand nou si
        // "print" doar printeaza pe randul curent
        System.out.println(name1);
        System.out.print(name2);

        System.out.println("\n");

        //Numele sunt printate separate deoarece:
        // "print" printeaza pe randul curent si ramane cursoru pe acelas rand si
        // "println" printeaza si dupa trece din rand nou
        System.out.print(name1);
        System.out.println(name2);
    }
}
