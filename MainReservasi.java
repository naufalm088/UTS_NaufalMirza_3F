/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Naufal Mirza Aldilla
 */
import java.util.Scanner;

public class MainReservasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Kamar kamar1 = new Kamar(8, "Single");
        Kamar kamar2 = new Kamar(24, "Double");

        Admin admin = new Admin("Mas Naufal");
        Customer customer = new Customer("Mba Nayla");

        admin.tambahKamar(kamar1);
        admin.tambahKamar(kamar2);

        customer.cekKetersediaan(kamar1);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = input.nextLine();
        Reservasi pesanan = new Reservasi(namaPelanggan, kamar1);

        pesanan.lihatDetailPesanan();

        customer.cekKetersediaan(kamar1);
    }
}

