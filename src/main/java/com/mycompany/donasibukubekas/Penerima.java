package com.mycompany.donasibukubekas;
import java.util.ArrayList;
import java.util.List;

public class Penerima extends User {
    private List<Buku> permintaanBuku;
    private String ulasan;
    
    public Penerima(String idUser, String nama, String email, String password, int kontak, String alamat) {
        super(idUser, nama, email, password, kontak, alamat);
        this.permintaanBuku = new ArrayList<>();
    }
    
    public void ajukanPermintaan(Buku buku){
        permintaanBuku.add(buku);
        System.out.println("Permintaan buku berhasil diajukan");
    }
    
    public void beriUlasan(String ulasan){
        this.ulasan = ulasan;
        System.out.println("Ulasan telah diberikan");
    }
    
    public String getUlasan(){
        return ulasan;
    }
    
    public List<Buku> getPermintaanBuku(){
        return permintaanBuku;
    }
    
}
