package com.mycompany.donasibukubekas;
import java.util.ArrayList;
import java.util.List;

public class Donatur extends User {
    private List<Donasi> donasiList;
    
    public Donatur(String idUser, String nama, String email, String password, int kontak, String alamat) {
        super(idUser, nama, email, password, kontak, alamat);
        this.donasiList = new ArrayList<>();
    }
    
    public void buatDonasi(Buku buku){
        Donasi donasi = new Donasi(this, buku);
        donasiList.add(donasi);
        System.out.println("Donasi buku berhasil!");
    }
    
    public List<Donasi> getDonasiList(){
        return donasiList;
    }
} 
    

