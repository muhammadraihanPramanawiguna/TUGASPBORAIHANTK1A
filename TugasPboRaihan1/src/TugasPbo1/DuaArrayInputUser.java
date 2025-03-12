package TugasPbo1;
/**
 *
 * muhammad raihan pramana wiguna tekom 1a
 */
import java.util.Random;
import java.util.Scanner;
public class DuaArrayInputUser {
    public static void main(String[] args) {
        int A[], B[], C[];
        int nilaiA, nilaiB, i;
        Scanner nilai = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Masukkan ukuran array A: ");
        nilaiA = nilai.nextInt();
        System.out.print("Masukkan ukuran array B: ");
        nilaiB = nilai.nextInt();
        System.out.println("=========================");
        
        A = new int[nilaiA];
        B = new int[nilaiB];
        C = new int[nilaiA + nilaiB];
        
        System.out.println("Array A: ");
        for (i = 0; i < nilaiA; i++) {
            A[i] = rand.nextInt(100);
            System.out.print(A[i] + " ");
        }
        System.out.println();
        
        System.out.println("Array B: ");
        for (i = 0; i < nilaiB; i++) {
            B[i] = rand.nextInt(100);
            System.out.print(B[i] + " ");
        }
        System.out.println();
        
        System.out.println("Array C: ");
        if (nilaiA >= nilaiB) {
            for(i = 0; i < nilaiA; i++) 
                System.out.print(A[i] + " ");
            for(i = 0; i < nilaiB; i++)
                System.out.print(B[i] + " ");
        }
        else {
            for(i = 0; i < nilaiB; i++)
                System.out.print(B[i] + " ");
            for(i = 0; i < nilaiA; i++) 
                System.out.print(A[i] + " ");
        }
        
        System.out.println();
    }
    
}
