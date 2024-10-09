/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naufal Mirza Aldilla
 */
public class Reservasi {
    private String namaPelanggan;
    private Kamar kamarDipesan;

    public Reservasi(String namaPelanggan, Kamar kamarDipesan) {
        this.namaPelanggan = namaPelanggan;
        this.kamarDipesan = kamarDipesan;
        kamarDipesan.setTersedia(false);
    }

    public void lihatDetailPesanan() {
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        kamarDipesan.lihatDetailKamar();
    }
}