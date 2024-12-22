public class Dance {

    // Fungsi untuk menampilkan unicorn yang menari
    public void unicornDance() throws InterruptedException {
        String unicorn = 
            "          \n" +
            "           \\     /\\      \n" +
            "            \\   /  \\     \n" +
            "             |  |    |    \n" +
            "             |  |    |    \n" +
            "          /\\ |  |    |    \n" +
            "         /  \\|  |    |    \n" +
            "        /    \\|  |    |    \n" +
            "       |      |  |    |    \n" +
            "       |      |  |    |    \n" +
            "      /       |  |    |    \n" +
            "     /        |  |    |    \n" +
            "    /_________|__|____|    \n" +
            "        \\    |     |    \n" +
            "         \\___|_____|    \n" +
            "         / /\\  |     | \n" +
            "        / /  \\ |     | \n" +
            "       / /    \\|     | \n" +
            "      /_/      \\_____/ ";

        // Melakukan perulangan untuk membuat unicorn bergerak
        for (int i = 0; i < 10; i++) {
            // Membersihkan layar dengan menampilkan baris kosong
            clearConsole();

            // Menampilkan unicorn dengan spasi untuk gerakan
            System.out.println(" ".repeat(i) + unicorn);
            
            // Menunggu sebentar sebelum menggambar ulang
            Thread.sleep(500); // Delay dalam milidetik (500ms = 0.5 detik)
        }
    }

    // Fungsi untuk membersihkan layar konsol
    public static void clearConsole() {
        try {
            // Untuk Windows
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            // Untuk Linux/MacOS
            else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
