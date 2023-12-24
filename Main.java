import java.util.Scanner;
public class Main {
    static String[] buku = {"Buku A", "Buku B", "Buku C", "Buku D"};
    static boolean[] tersedia = {true, true, true, true};
    static String[] peminjam = new String[buku.length];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========== Sistem Peminjaman Perpustakaan ==========");
            System.out.println("1. Daftar Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Kembalikan Buku");
            System.out.println("4. Keluar");
            
            System.out.print("Pilih menu (1-4): ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    DaftarBuku();
                    break;
                case 2:
import java.util.Scanner;
public class Main {
    static String[] buku = {"Buku A", "Buku B", "Buku C", "Buku D"};
    static boolean[] tersedia = {true, true, true, true};
    static String[] peminjam = new String[buku.length];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========== Sistem Peminjaman Perpustakaan ==========");
            System.out.println("1. Daftar Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Kembalikan Buku");
            System.out.println("4. Keluar");
            
            System.out.print("Pilih menu (1-4): ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    DaftarBuku();
                    break;
                case 2:
                    pinjamBuku();
                    break;
                case 3:
                    kembalikanBuku();
                    break;
                case 4:
                    System.out.println("Terima kasih, program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu 1-4.");
            }
        }
    }

    static void DaftarBuku() {
        System.out.println("========== Daftar Buku ==========");
        for (int i = 0; i < buku.length; i++) {
            System.out.println((i + 1) + ". " + buku[i] + " - Tersedia: " + (tersedia[i] ? "Ya" : "Tidak"));
        }
        System.out.println("=================================");
    }

    static void pinjamBuku() {
        Scanner scanner = new Scanner(System.in);
        
																			System.out.println("========== Daftar Buku ==========");
        for (int i = 0; i < buku.length; i++) {
            System.out.println((i + 1) + ". " + buku[i] + " - Tersedia: " + (tersedia[i] ? "Ya" : "Tidak"));
            
        }
        System.out.print("Masukkan nomor buku yang ingin dipinjam: ");
        int nomorBuku = scanner.nextInt();

        if (nomorBuku >= 1 && nomorBuku <= buku.length) {
            int indexBuku = nomorBuku - 1;

            if (tersedia[indexBuku]) {
                System.out.print("Masukkan nama peminjam: ");
                scanner.nextLine(); // membersihkan buffer
                String namaPeminjam = scanner.nextLine();

                tersedia[indexBuku] = false;
               			peminjam[indexBuku] = namaPeminjam;

                System.out.println("Buku berhasil dipinjam oleh " + namaPeminjam + ".");
            } else {
                System.out.println("Maaf, buku tidak tersedia.");
            }
        } else {
            System.out.println("Nomor buku tidak valid.");
        }
    }

    static void kembalikanBuku() {
        Scanner scanner = new Scanner(System.in);
																			
        System.out.print("Masukkan nama peminjam: ");
        String namaPeminjam = scanner.nextLine();

        System.out.print("Masukkan nomor buku yang ingin dikembalikan: ");
        int nomorBuku = scanner.nextInt();

        if (nomorBuku >= 1 && nomorBuku <= buku.length) {
            int indexBuku = nomorBuku - 1;

            if (!tersedia[indexBuku]) {
                tersedia[indexBuku] = true;
                peminjam[indexBuku] = null;

                System.out.println("Buku berhasil dikembalikan.");
            } else {
                System.out.println("Buku tidak di pinjam.");
            }
        } else {
            System.out.println("Nomor buku tidak valid.");
        }
    }
}
￼Enter                    pinjamBuku();
                    break;
                case 3:
                    kembalikanBuku();
                    break;
                case 4:
                    System.out.println("Terima kasih, program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu 1-4.");
            }
        }
    }

    static void DaftarBuku() {
        System.out.println("========== Daftar Buku ==========");
        for (int i = 0; i < buku.length; i++) {
            System.out.println((i + 1) + ". " + buku[i] + " - Tersedia: " + (tersedia[i] ? "Ya" : "Tidak"));
        }
        System.out.println("=================================");
    }

    static void pinjamBuku() {
        Scanner scanner = new Scanner(System.in);
        
																			System.out.println("========== Daftar Buku ==========");
  for (int i = 0; i < buku.length; i++) {
            System.out.println((i + 1) + ". " + buku[i] + " - Tersedia: " + (tersedia[i] ? "Ya" : "Tidak"));
            
        }
        System.out.print("Masukkan nomor buku yang ingin dipinjam: ");
        int nomorBuku = scanner.nextInt();

        if (nomorBuku >= 1 && nomorBuku <= buku.length) {
            int indexBuku = nomorBuku - 1;

            if (tersedia[indexBuku]) {
                System.out.print("Masukkan nama peminjam: ");
                scanner.nextLine(); // membersihkan buffer
                String namaPeminjam = scanner.nextLine();

                tersedia[indexBuku] = false;
               			peminjam[indexBuku] = namaPeminjam;

                System.out.println("Buku berhasil dipinjam oleh " + namaPeminjam + ".");
            } else {
                System.out.println("Maaf, buku tidak tersedia.");
            }
        } else {
            System.out.println("Nomor buku tidak valid.");
        }
    }
