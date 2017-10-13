import java.util.Scanner;

public class Multiplicar {
    public static void main (String[] args) {
        int i=1;
        int j=1;

        Scanner input= new Scanner (System.in);

        System.out.println("Fins quina taula vols veure?");

        int limit = input.nextInt();

        while (i<=limit) {
            for (j = 1; j < 11; j++) {
                if(j<11){ System.out.println(i + " x " + j + " = " + i * j);}

                if (j==10) {System.out.println("+++++++++++++++");}
            }
            i++;


        }
    }


}
