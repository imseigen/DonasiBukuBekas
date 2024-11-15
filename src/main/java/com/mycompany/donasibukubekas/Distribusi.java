package com.mycompany.donasibukubekas;
import java.util.Date;

public class Distribusi {
    private Donasi donasi;
    private Date tanggalDistribusi;

    public Distribusi(Donasi donasi) {
        this.donasi = donasi;
        this.tanggalDistribusi = new Date();
    }

    public Donasi getDonasi() {
        return donasi;
    }

    public Date getTanggalDistribusi() {
        return tanggalDistribusi;
    }
    
    
}
