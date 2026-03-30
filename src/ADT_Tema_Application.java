import java.util.Scanner;

public class ADT_Tema_Application {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int pilihan;
        
        do {
            tampilkanMenu();
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (pilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    ubahData();
                    break;
                case 3:
                    hapusData();
                    break;
                case 4:
                    pencarianData();
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            
            if (pilihan != 5) {
                System.out.println("\nTekan Enter untuk melanjutkan...");
                scanner.nextLine();
            }
            
        } while (pilihan != 5);
        
        scanner.close();
    }
    
    private static void tampilkanMenu() {
        System.out.println("\n=== APLIKASI MANAJEMEN TEMA ===");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Pencarian Data");
        System.out.println("5. Keluar");
        System.out.println("================================");
    }

    private static void tambahData() {
        System.out.println("\n=== TAMBAH DATA TEMA WARNA ===");
        
        System.out.print("Masukkan nama warna: ");
        String namaTema = scanner.nextLine();
        
        System.out.print("Masukkan warna dasar: ");
        String warnaDasar = scanner.nextLine();
        
        System.out.print("Masukkan warna aksen: ");
        String warnaAksen = scanner.nextLine();
        
        System.out.print("Apakah dark mode? (y/n): ");
        String darkModeInput = scanner.nextLine();
        boolean isDarkMode = darkModeInput.equalsIgnoreCase("y") || darkModeInput.equalsIgnoreCase("yes");
        
        ADT_Tema_Implementation tema = new ADT_Tema_Implementation(namaTema, warnaDasar, warnaAksen, isDarkMode);
        ADT_Tema_Implementation.addTema(tema);
        
        System.out.println("\nData warna yang ditambahkan:");
        tema.display();
    }

    private static void ubahData() {
        System.out.println("\n=== UBAH DATA WARNA ===");
        
        if (ADT_Tema_Implementation.getJumlahTema() == 0) {
            System.out.println("Tidak ada warna yang tersimpan");
            return;
        }
        
        ADT_Tema_Implementation.displayTema();
        
        System.out.print("Masukkan nama warna yang akan diubah: ");
        String namaTema = scanner.nextLine();
        
        ADT_Tema_Implementation tema = ADT_Tema_Implementation.searchTema(namaTema);
        if (tema != null) {
            System.out.print("Masukkan warna dasar baru: ");
            String warnaDasarBaru = scanner.nextLine();
            
            System.out.print("Masukkan warna aksen baru: ");
            String warnaAksenBaru = scanner.nextLine();
            
            System.out.print("Apakah dark mode? (y/n): ");
            String darkModeInput = scanner.nextLine();
            boolean isDarkMode = darkModeInput.equalsIgnoreCase("y") || darkModeInput.equalsIgnoreCase("yes");
            
            ADT_Tema_Implementation.editTema(namaTema, warnaDasarBaru, warnaAksenBaru, isDarkMode);
        }
    }

    private static void hapusData() {
        System.out.println("\n=== HAPUS DATA WARNA ===");
        
        if (ADT_Tema_Implementation.getJumlahTema() == 0) {
            System.out.println("Tidak ada warna yang tersimpan");
            return;
        }
        
        ADT_Tema_Implementation.displayTema();
        
        System.out.print("Masukkan nama warna yang akan dihapus: ");
        String namaTema = scanner.nextLine();
        
        System.out.print("Apakah Anda yakin ingin menghapus warna '" + namaTema + "'? (y/n): ");
        String konfirmasi = scanner.nextLine();
        
        if (konfirmasi.equalsIgnoreCase("y") || konfirmasi.equalsIgnoreCase("yes")) {
            ADT_Tema_Implementation.deleteTema(namaTema);
        } else {
            System.out.println("Penghapusan dibatalkan");
        }
    }

    private static void pencarianData() {
        System.out.println("\n=== PENCARIAN DATA WARNA ===");
        
        if (ADT_Tema_Implementation.getJumlahTema() == 0) {
            System.out.println("Tidak ada warna yang tersimpan");
            return;
        }
        
        System.out.println("1. Cari warna tertentu");
        System.out.println("2. Tampilkan semua warna");
        System.out.print("Pilih opsi (1-2): ");
        int opsi = scanner.nextInt();
        scanner.nextLine();
        
        switch (opsi) {
            case 1:
                System.out.print("Masukkan nama warna yang dicari: ");
                String namaTema = scanner.nextLine();
                ADT_Tema_Implementation.searchTema(namaTema);
                break;
            case 2:
                ADT_Tema_Implementation.displayTema();
                break;
            default:
                System.out.println("Opsi tidak valid!");
        }
    }
}