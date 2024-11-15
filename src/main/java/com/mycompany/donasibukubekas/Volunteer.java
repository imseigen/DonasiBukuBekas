package com.mycompany.donasibukubekas;
import java.util.ArrayList;
import java.util.List;

public class Volunteer extends User {
    private List<Distribusi> tugas;
    
    public Volunteer(String idUser, String nama, String email, String password, int kontak, String alamat) {
        super(idUser, nama, email, password, kontak, alamat);
        this.tugas = new ArrayList<>();
    }
    
    public void kelolaDistribusi(Donasi donasi){
        Distribusi distribusi = new Distribusi(donasi);
        tugas.add(distribusi);
        System.out.println("Distribusi donasi berhasil ditambahkan");
    }
    
    public List<Distribusi> getTugas(){
        return tugas;
    }
    
}
