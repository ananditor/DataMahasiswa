package datamahasiswa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Mahasiswa {

    ArrayList<String> NIM = new ArrayList<>();
    ArrayList<String> Nama = new ArrayList<>();
    ArrayList<String> TglLahir = new ArrayList<>();
    ArrayList<Integer> Jenkel = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    void TambahData() {
        System.out.println("\n");
        System.out.println("===============");
        System.out.println("  TAMBAH DATA  ");
        System.out.println("===============");
        System.out.print("Nama : ");
        String nama = input.next();
        System.out.print("NIM : ");
        String nomer = input.next();
        System.out.print("Tanggal Lahir (DD/MM/YYYY) : ");
        String tgl = input.next();
        System.out.print("Masukkan 0 untuk Laki-laki / 1 untuk Perempuan : ");
        int jkl = input.nextInt();
        Nama.add(nama);
        NIM.add(nomer);
        TglLahir.add(tgl);
        Jenkel.add(jkl);
        System.out.println("++++++++++++++++++++++");
        System.out.println("Berhasil menambah data");
        System.out.println("\n");
    }

    void TampilkanData() {
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("===============");
        System.out.println("TAMPILKAN  DATA");
        System.out.println("===============");
        for (int i = 0; i < Nama.size(); i++) {
            System.out.println("Nama : " + Nama.get(i));
            System.out.println("NIM : " + NIM.get(i));
            System.out.println("Tanggal Lahir : " + TglLahir.get(i));
            System.out.println("Jenis Kelamin : " + Jenkel.get(i));
            System.out.println("****************");
        }
        System.out.println("++++++++++++++++++++");
        System.out.println("Menampilkan Total Mahasiswa : " + Nama.size());
        System.out.println("\n");
    }

    void MencariData() {
        System.out.println("\n");
        System.out.println("===============");
        System.out.println("  MENCARI DATA ");
        System.out.println("===============");
        System.out.println("1. Mencari data berdasarkan jenis kelamin");
        System.out.println("2. Mencari data berdasarkan NIM");
        System.out.print("Pilihan anda : ");
        int pilihan = input.nextInt();
        if (pilihan == 1) {
            System.out.println("=====================================");
            System.out.println(" Mencari  Berdasarkan  Jenis Kelamin ");
            System.out.println("=====================================");
            System.out.print("Pilih jenis kelamin (0 / 1) : ");
            int gend = input.nextInt();

            for (int i = 0; i < Nama.size(); i++) {
                if (Jenkel.get(i) == 0) {
                    System.out.println("Nama : " + Nama.get(i));
                    System.out.println("NIM : " + NIM.get(i));
                    System.out.println("Tanggal Lahir : " + TglLahir.get(i));
                    System.out.println("Jenis Kelamin : " + Jenkel.get(i));
                    System.out.println("+++++++++++++++++++++++++");
                    System.out.println("Berhasil menampilkan data");
                    System.out.println("\n");
                } else if (Jenkel.get(i) == 1) {
                    System.out.println("Nama : " + Nama.get(i));
                    System.out.println("NIM : " + NIM.get(i));
                    System.out.println("Tanggal Lahir : " + TglLahir.get(i));
                    System.out.println("Jenis Kelamin : " + Jenkel.get(i));
                    System.out.println("+++++++++++++++++++++++++");
                    System.out.println("Berhasil menampilkan data");
                    System.out.println("\n");
                }
            }
        } else if (pilihan == 2) {
            System.out.println("==============================");
            System.out.println("   Mencari Berdasarkan  NIM   ");
            System.out.println("==============================");
            System.out.print("Masukkan NIM : ");
            String nomer = input.next();

            int index = Collections.binarySearch(NIM, nomer);
            String cariNama = Nama.get(index);
            String cariNIM = NIM.get(index);
            String caritanggal = TglLahir.get(index);
            int cariJenisKelamin = Jenkel.get(index);

            System.out.println("Nama : " + cariNama);
            System.out.println("NIM : " + cariNIM);
            System.out.println("Tanggal Lahir : " + caritanggal);
            System.out.println("Jenis Kelamin : " + cariJenisKelamin);
            System.out.println("+++++++++++++++++++++++++");
            System.out.println("Berhasil menampilkan data");
            System.out.println("\n");
        }
    }

    void HapusData() {
        System.out.println("\n");
        System.out.println("===============");
        System.out.println("  HAPUS  DATA  ");
        System.out.println("===============");
        System.out.print("NIM : ");
        String nomer = input.next();
        int index = Collections.binarySearch(NIM, nomer);
        Nama.remove(index);
        NIM.remove(index);
        TglLahir.remove(index);
        Jenkel.remove(index);
        System.out.println("++++++++++++++++++");
        System.out.println("Berhasil menghapus data");
        System.out.println("\n");
    }

    void Keluar() {
        System.out.println("Terimakasih");
    }
}
