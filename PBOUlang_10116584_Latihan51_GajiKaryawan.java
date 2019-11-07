/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan51_gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author
 * NIM : 10116584
 * Nama : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan51_GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Karyawan x = new Karyawan();
        Manajer y = new Manajer();
        
        //input
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukan NIK : ");
        x.setNik(scan.nextLine());
        System.out.print("Masukan Nama : ");
        x.setNama(scan.nextLine());
        System.out.print("Masukan Golongan (1/2/3) : ");
        x.setGolongan(scan.nextInt());
        System.out.print("Masukan Jabatan (Manajer/Kabag) : ");
        x.setJabatan(scan.next());
        System.out.print("Masukan Jumlah Kehadiran : ");
        y.setKehadiran(scan.nextInt());
     
        
        //output
        System.out.println("");
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK\t : "+x.getNik());
        System.out.println("NAMA\t : "+x.getNama());
        System.out.println("GOLONGAN : "+x.getGolongan());
        System.out.println("JABATAN\t : "+x.getJabatan());
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN      : "+y.tunjanganGolongan(x.getGolongan()));
        System.out.println("TUNJANGAN JABATAN       : "+y.tunjanganJabatan(x.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN     : "+y.tunjanganKehadiran(y.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL      : "+y.gajiTotal());
        
    }
    
}
