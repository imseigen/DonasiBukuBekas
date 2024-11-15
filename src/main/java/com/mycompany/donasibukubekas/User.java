package com.mycompany.donasibukubekas;
import java.util.HashMap;
import java.util.Map;
public class User {
    private String idUser;
    private String nama;
    private String email;
    private String password;
    private int kontak;
    private String alamat;
    
    private static Map<String, User> userDatabase = new HashMap<>();
    private static User loggedInUser = null;

    public User(String idUser, String nama, String email, String password, int kontak, String alamat) {
        this.idUser = idUser;
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.kontak = kontak;
        this.alamat = alamat;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getKontak() {
        return kontak;
    }

    public void setKontak(int kontak) {
        this.kontak = kontak;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public static Map<String, User> getUserDatabase(){
        return userDatabase;
    }
    public static boolean register(User user){
        if (userDatabase.containsKey(user.getEmail())){
            System.out.println("Sudah ada pengguna dengan email ini ");
            return false;
        } else {
            userDatabase.put(user.getEmail(), user);
            System.out.println("Register Berhasil!!");
            return true;
        }
    }
    
    public static boolean login(String email, String password){
        User user = userDatabase.get(email);
        if (user != null && user.getPassword().equals(password)){
            loggedInUser = user;
            System.out.println("Login Sukses");
            return true;
        } else {
            System.out.println("Password atau Email Salah!!");
            return false;
        }
    }
    
    public static void logout(){
        if (loggedInUser != null){
            System.out.println("User " + loggedInUser.getNama() + "Telah Logout");
            loggedInUser = null;
        } else {
            System.out.println("Tidak ada user yang logout");
        }
    }
    
    public static User getLoggedInUser(){
        return loggedInUser;
    }   
}
