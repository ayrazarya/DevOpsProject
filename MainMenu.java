import java.util.Scanner;

public class MainMenu {

    // Method untuk menampilkan menu utama setelah login berhasil
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Welcome to the Main Menu!");
            System.out.println("1. Dance with the Unicorn");
            System.out.println("2. Travel to the Moon");
            System.out.println("3. Solve a Rubik's Cube with Your Mind");
            System.out.println("4. Summon a Dragon");
            System.out.println("5. Exit");
            
            // Menerima input dari pengguna
            System.out.print("Please choose an option (1-5): ");
            int choice = scanner.nextInt();
            
            // Menangani pilihan
            switch (choice) {
                case 1:
                    System.out.println("You selected 'Dance with the Unicorn'. A unicorn appears and starts dancing with you!");
                    Dance dance = new Dance();  // Membuat objek dari kelas Dance
                    try {
                        dance.unicornDance();  // Memanggil metode unicornDance dari kelas Dance
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("You selected 'Travel to the Moon'. A spaceship lands and takes you to the moon!");
                    break;
                case 3:
                    System.out.println("You selected 'Solve a Rubik's Cube with Your Mind'. You solved it in seconds using telekinesis!");
                    break;
                case 4:
                    System.out.println("You selected 'Summon a Dragon'. A dragon swoops down from the sky and roars!");
                    break;
                case 5:
                    System.out.println("Exiting the menu. Goodbye!");
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

