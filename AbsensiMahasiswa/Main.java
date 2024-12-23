package AbsensiMahasiswa;


import AbsensiMahasiswa.Controllers.AbsensiController;
import AbsensiMahasiswa.Controllers.LoginController;
import AbsensiMahasiswa.Controllers.MahasiswaController;
import AbsensiMahasiswa.Utils.DatabaseHelper;
import AbsensiMahasiswa.Views.LoginView;

public class Main {
    public static void main(String[] args) {
         // Instance db helper
         DatabaseHelper databaseHelper = new DatabaseHelper("localhost", "absensi_mahasiswa", "root", "");

         // Instance mahasiswa controller
         MahasiswaController mahasiswaController = new MahasiswaController(databaseHelper);
 
         // Instance absensi controller
         AbsensiController absensiController = new AbsensiController(databaseHelper);
 
         // Instance login
         LoginController loginController = new LoginController(databaseHelper);
 
         // Instance login view x controller
         LoginView loginView = new LoginView(loginController, mahasiswaController, absensiController);
 
         // Menampilkan Login View
         loginView.show();
        
    }
}
