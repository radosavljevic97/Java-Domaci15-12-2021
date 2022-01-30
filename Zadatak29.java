//29. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz
//Ispisati svaki treci element u obrnutom redosledu.
//Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2

package Domaci1412;

import java.util.Scanner;

public class Zadatak29 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite brojeve: ");

        int broj;
        int[] niz = new int[6];

        for(int i = 0; i < 6; i++){
            broj = s.nextInt();
            niz[i] = broj;
        }

        for(int i = niz.length - 1; i >= 0; i -= 3){
            System.out.println(niz[i]);

        }

    }
}

