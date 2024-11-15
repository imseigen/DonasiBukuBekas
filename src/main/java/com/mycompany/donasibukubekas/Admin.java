package com.mycompany.donasibukubekas;

public class Admin extends User {

    public Admin(String idUser, String nama, String email, String password, int kontak, String alamat) {
        super(idUser, nama, email, password, kontak, alamat);
    }
    
    public void hapusPengguna(String email){
        if (User.getUserDatabase().containsKey(email)){
            User.getUserDatabase().remove(email);
            System.out.println("User dengan email " + email + "telah dihapus");
        } else {
            System.out.println("User tidak ditemukan");
        }
    }
    
}
