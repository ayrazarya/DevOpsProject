import java.util.Scanner;

public class MainMenu {

    // Method untuk menampilkan menu utama setelah login berhasil
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Welcome to the Main Menu!");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Exit");
            
            // Menerima input dari pengguna
            System.out.print("Please choose an option (1-4): ");
            int choice = scanner.nextInt();
            
            // Menangani pilihan
            switch (choice) {
                case 1:
                    System.out.println("You selected Option 1.");
                    break;
                case 2:
                    System.out.println("You selected Option 2.");
                    break;
                case 3:
                    System.out.println("You selected Option 3.");
                    break;
                case 4:
                    System.out.println("Exiting the menu.");
                    System.exit(0); // Keluar dari aplikasi
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    public static void main(String[] args) {
        MainMenu menu = new MainMenu();
        menu.displayMenu();
    }
}
