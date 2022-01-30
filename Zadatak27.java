//27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
//        Primer: [1, 2, 3, 4, 5] -> 1 3 5

package Domaci1412;

import java.util.Scanner;

public class Zadatak27 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite neki broj: ");

        int broj;
        int[] niz = new int [5];

        for(int i = 0; i < 5; i++){
            broj = s.nextInt();
            niz[i] = broj;
        }

        for(int i = 0; i < niz.length; i += 2){
            System.out.println(niz[i]);
        }


    }
}

