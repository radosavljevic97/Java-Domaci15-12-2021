//30. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz
// Izracunati proizvod elemenata tog niza.
//      Primer: [2, 4] -> 8

package Domaci1412;

import java.util.Scanner;

public class Zadatak30 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite brojeve: ");

        int proizvod = 1;
        int broj;
        int[] niz = new int[4];

        for(int i = 0; i < niz.length; i++){
            broj = s.nextInt();
            niz[i] = broj;
            proizvod = proizvod * broj;

        }

        System.out.println(proizvod);

    }
}

