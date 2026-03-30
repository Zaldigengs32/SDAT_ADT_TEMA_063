public class ADT_Tema_Implementation extends ADT_Tema_Logical {
    private static ADT_Tema_Implementation[] daftarTema = new ADT_Tema_Implementation[10];
    private static int jumlahTema = 0;

    public ADT_Tema_Implementation() {
        this.namaTema = "";
        this.warnaDasar = "";
        this.warnaAksen = "";
        this.isDarkMode = false;
    }
    
    public ADT_Tema_Implementation(String namaTema, String warnaDasar, String warnaAksen, boolean isDarkMode) {
        this.namaTema = namaTema;
        this.warnaDasar = warnaDasar;
        this.warnaAksen = warnaAksen;
        this.isDarkMode = isDarkMode;
    }

    @Override
    public void setNamaTema(String namaTema) {
        if (namaTema != null && !namaTema.trim().isEmpty()) {
            this.namaTema = namaTema;
        } else {
            System.out.println("Error: Nama warna tidak boleh kosong");
        }
    }
    
    @Override
    public String getNamaTema() {
        return this.namaTema;
    }
    
    @Override
    public void setWarnaDasar(String warnaDasar) {
        if (warnaDasar != null && !warnaDasar.trim().isEmpty()) {
            this.warnaDasar = warnaDasar;
        } else {
            System.out.println("Error: Warna dasar tidak boleh kosong");
        }
    }
    
    @Override
    public String getWarnaDasar() {
        return this.warnaDasar;
    }
    
    @Override
    public void setWarnaAksen(String warnaAksen) {
        if (warnaAksen != null && !warnaAksen.trim().isEmpty()) {
            this.warnaAksen = warnaAksen;
        } else {
            System.out.println("Error: Warna aksen tidak boleh kosong");
        }
    }
    
    @Override
    public String getWarnaAksen() {
        return this.warnaAksen;
    }
    
    @Override
    public void setDarkMode(boolean isDarkMode) {
        this.isDarkMode = isDarkMode;
    }
    
    @Override
    public boolean isDarkMode() {
        return this.isDarkMode;
    }
    
    @Override
    public void show() {
        System.out.println("=== TEMA ===");
        System.out.println("Nama Warna: " + this.namaTema);
        System.out.println("Warna Dasar: " + this.warnaDasar);
        System.out.println("Warna Aksen: " + this.warnaAksen);
        System.out.println("Dark Mode: " + (this.isDarkMode ? "Ya" : "Tidak"));
    }
    
    @Override
    public void display() {
        show();
    }

    public static boolean addTema(ADT_Tema_Implementation tema) {
        if (jumlahTema < daftarTema.length) {
            daftarTema[jumlahTema] = tema;
            jumlahTema++;
            System.out.println("Warna berhasil ditambahkan");
            return true;
        } else {
            System.out.println("Error: Daftar warna sudah penuh");
            return false;
        }
    }

    public static boolean deleteTema(String namaTema) {
        for (int i = 0; i < jumlahTema; i++) {
            if (daftarTema[i].getNamaTema().equals(namaTema)) {
                for (int j = i; j < jumlahTema - 1; j++) {
                    daftarTema[j] = daftarTema[j + 1];
                }
                daftarTema[jumlahTema - 1] = null;
                jumlahTema--;
                System.out.println("Warna '" + namaTema + "' berhasil dihapus");
                return true;
            }
        }
        System.out.println("Error: Warna '" + namaTema + "' tidak ditemukan");
        return false;
    }

    public static boolean editTema(String namaTema, String warnaDasarBaru, String warnaAksenBaru, boolean darkModeBaru) {
        for (int i = 0; i < jumlahTema; i++) {
            if (daftarTema[i].getNamaTema().equals(namaTema)) {
                daftarTema[i].setWarnaDasar(warnaDasarBaru);
                daftarTema[i].setWarnaAksen(warnaAksenBaru);
                daftarTema[i].setDarkMode(darkModeBaru);
                System.out.println("Warna '" + namaTema + "' berhasil diubah");
                return true;
            }
        }
        System.out.println("Error: Warna '" + namaTema + "' tidak ditemukan");
        return false;
    }

    public static void displayTema() {
        if (jumlahTema == 0) {
            System.out.println("Tidak ada Warna yang tersimpan");
            return;
        }
        
        System.out.println("=== DAFTAR WARNA ===");
        for (int i = 0; i < jumlahTema; i++) {
            System.out.println((i + 1) + ". ");
            daftarTema[i].display();
            System.out.println();
        }
    }

    public static ADT_Tema_Implementation searchTema(String namaTema) {
        for (int i = 0; i < jumlahTema; i++) {
            if (daftarTema[i].getNamaTema().equalsIgnoreCase(namaTema)) {
                System.out.println("Warna ditemukan:");
                daftarTema[i].display();
                return daftarTema[i];
            }
        }
        System.out.println("Warna '" + namaTema + "' tidak ditemukan");
        return null;
    }

    public static int getJumlahTema() {
        return jumlahTema;
    }
}