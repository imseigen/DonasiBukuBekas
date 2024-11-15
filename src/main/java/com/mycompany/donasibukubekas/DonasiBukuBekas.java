package com.mycompany.donasibukubekas;
import java.util.Scanner;
public class DonasiBukuBekas {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         boolean exit = false;
         
         while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Registrasi Pengguna");
            System.out.println("2. Login");
            System.out.println("3. Logout");
            System.out.println("4. Tampilkan Pengguna Terdaftar");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan ID User: ");
                    String idUser = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Masukkan Password: ");
                    String password = scanner.nextLine();
                    System.out.print("Masukkan Kontak: ");
                    int kontak = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Masukkan Alamat: ");
                    String alamat = scanner.nextLine();

                    // Membuat objek User baru dan registrasi
                    User newUser = new User(idUser, nama, email, password, kontak, alamat);
                    User.register(newUser);
                    break;

                case 2:
                    System.out.print("Masukkan Email untuk Login: ");
                    String loginEmail = scanner.nextLine();
                    System.out.print("Masukkan Password: ");
                    String loginPassword = scanner.nextLine();
                    User.login(loginEmail, loginPassword);
                    break;

                case 3:
                    // Logout pengguna yang sedang login
                    User.logout();
                    break;

                case 4:
                    // Tampilkan semua pengguna yang terdaftar
                    System.out.println("Daftar Pengguna Terdaftar:");
                    for (User user : User.getUserDatabase().values()) {
                        System.out.println(user);
                    }
                    break;

                case 5:
                    exit = true;
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }

        scanner.close();
    }
}

    

