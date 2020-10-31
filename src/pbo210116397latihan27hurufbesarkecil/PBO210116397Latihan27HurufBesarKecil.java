/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Program Huruf Besar dan kecil
 */
package pbo210116397latihan27hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lol ;
        
        System.out.print("Masukkan Kalimat : " );
        
        Scanner huruf = new Scanner(System.in);
        lol = huruf.nextLine();
        
        System.out.println();
        System.out.println("===========Hasil Formating============");
        System.out.println("Huruf Besar\t: " + lol.toUpperCase());
        System.out.println("Huruf Kecil\t: " + lol.toLowerCase());
    }
    
}
