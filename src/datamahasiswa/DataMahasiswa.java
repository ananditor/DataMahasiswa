package datamahasiswa;

import java.util.Scanner;

public class DataMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        int Menu;
        Mahasiswa dm = new Mahasiswa();

        while (isRunning) {
            System.out.println("===============");
            System.out.println("    M E N U    ");
            System.out.println("===============");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan : ");
            Menu = input.nextInt();
            switch (Menu) {
                case 1:
                    dm.TambahData();
                    break;
                case 2:
                    dm.TampilkanData();
                    break;
                case 3:
                    dm.MencariData();
                    break;
                case 4:
                    dm.HapusData();
                    break;
                case 5:
                    isRunning = false;
                    dm.Keluar();
                    break;
            }
        }
    }
}
