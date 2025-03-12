package TugasPbo1;

import java.util.Scanner;
public class PermutasiKombinasi {
    public static void main(String[] args) {
        int n, r, i;
        int permutasi = 1, kombinasi = 1, faktorialR = 1;

        Scanner nilai = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.print("Masukkan nilai n: ");
        n = nilai.nextInt();
        System.out.print("Masukkan nilai r: ");
        r = nilai.nextInt();
        System.out.println("===================");

        if (r > n) {
            System.out.println("Error: r tidak boleh lebih besar dari n.");
        }
        else {
            // Menghitung permutasi (n!)
            for (i = n; i > (n - r); i--) {
                permutasi *= i;
            }
            
            // Menghitung r!
            for (i = r; i > 1; i--) {
                faktorialR *= i;
            }

            // Menghitung kombinasi (n! / r!(n-r)!)
            kombinasi = permutasi / faktorialR;

            System.out.println("Nilai Permutasi: " + permutasi);
            System.out.println("Nilai Kombinasi: " + kombinasi);
        }

        System.out.println("--------------------");
    }
}
