/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naufal Mirza Aldilla
 */
public abstract class AksesUser {
    protected String nama;

    public AksesUser(String nama) {
        this.nama = nama;
    }

    public abstract void lihatAkses();
}

class Admin extends AksesUser {
    public Admin(String nama) {
        super(nama);
    }

    @Override
    public void lihatAkses() {
        System.out.println(nama + " memiliki akses penuh sebagai Admin.");
    }

    public void tambahKamar(Kamar kamar) {
        System.out.println("Kamar nomor " + kamar.getNomorKamar() + " berhasil ditambahkan.");
    }
}

class Customer extends AksesUser {
    public Customer(String nama) {
        super(nama);
    }

    @Override
    public void lihatAkses() {
        System.out.println(nama + " memiliki akses sebagai Customer.");
    }

    public void cekKetersediaan(Kamar kamar) {
        if (kamar.isTersedia()) {
            System.out.println("Kamar nomor " + kamar.getNomorKamar() + " tersedia.");
        } else {
            System.out.println("Kamar nomor " + kamar.getNomorKamar() + " tidak tersedia.");
        }
    }
}