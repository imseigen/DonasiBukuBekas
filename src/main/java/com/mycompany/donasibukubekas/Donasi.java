package com.mycompany.donasibukubekas;
import java.util.Date;

public class Donasi {
    private String idDonasi;
    private Donatur donatur;
    private Buku buku;
    private Date tanggal;

    public Donasi(Donatur donatur, Buku buku) {
        this.idDonasi = "D" + System.currentTimeMillis();
        this.donatur = donatur;
        this.buku = buku;
        this.tanggal = new Date();
    }
    
    public String getIdDonasi(){
        return idDonasi;
    }

    public Donatur getDonatur() {
        return donatur;
    }

    public Buku getBuku() {
        return buku;
    }

    public Date getTanggal() {
        return tanggal;
    }
}
