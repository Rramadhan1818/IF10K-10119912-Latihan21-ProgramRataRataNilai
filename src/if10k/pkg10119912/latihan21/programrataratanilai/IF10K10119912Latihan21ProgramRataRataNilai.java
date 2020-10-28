/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan21.programrataratanilai;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * 
 */
public class IF10K10119912Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int i, banyak_mahasiswa;
        float jum, nilai_mahasiswa, rata;
        System.out.print ("Masukan Banyaknya Mahasiswa: ");
        banyak_mahasiswa = masuk.nextInt();
        jum=0;
        i=1;
        while (i<=banyak_mahasiswa){
                System.out.print ("Nilai Mahasiswa ke-"+i+": ");
                nilai_mahasiswa = masuk.nextFloat ();
                jum += nilai_mahasiswa;
                i++;
        }
        rata = jum / banyak_mahasiswa;
        System.out.println ("Rata-rata: "+rata);
//        System.out.println ("Jumlah: "+jum);
    }
    
}
