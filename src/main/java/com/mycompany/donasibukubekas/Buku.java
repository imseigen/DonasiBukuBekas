package com.mycompany.donasibukubekas;

public class Buku {
    private String idBuku;
    private String judul;
    private String penerbit;
    private int tahunTerbit;
    

    public Buku(String idBuku, String judul, String penerbit, int tahunTerbit) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
    
    
}
