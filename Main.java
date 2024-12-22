public class Main {
    public static void main(String[] args) {
        // Mendeklarasikan username yang ingin diprint
        String username = "DevOpsProject";
        
        // Menampilkan pesan
        System.out.println("Hello, " + username);
        
        // Contoh memanggil metode login
        String enteredUsername = "DevOpsProject";
        String enteredPassword = "project123";
        
        // Memanggil metode login dan memeriksa hasilnya
        if (login(enteredUsername, enteredPassword)) {
            System.out.println("Login successful");
            
            // Jika login berhasil, tampilkan menu utama
            MainMenu mainMenu = new MainMenu();
            mainMenu.displayMenu();
        } else {
            System.out.println("Login failed");
        }
    }

    // Mendeklarasikan metode login dengan tipe kembalian boolean
    public static boolean login(String username, String password) {
        // Hardcoded username dan password untuk perbandingan
        String correctUsername = "DevOpsProject";
        String correctPassword = "project123";
        
        // Membandingkan username dan password yang dimasukkan dengan yang benar
        return username.equals(correctUsername) && password.equals(correctPassword);
    }
}
