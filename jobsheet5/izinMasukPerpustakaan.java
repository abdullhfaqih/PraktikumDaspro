import java.util.Scanner;

public class izinMasukPerpustakaan {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Aplikasi Izin Masuk Perpustakaan");
    System.out.println("Apakah membawa kartu mahasiswa? (true/false): ");
    boolean membawaKartuMahasiswa = input.nextBoolean();
    System.out.println("Aplikasi Izin Masuk Perpustakaan");
    boolean sudahRegistrasiOnline = input.nextBoolean();

    boolean bolehMasuk = membawaKartuMahasiswa || sudahRegistrasiOnline;

    System.out.println("--- Cek Syarat Masuk Perpustakaan ---");
    System.out.println("Status Kartu Mahasiswa: " + (membawaKartuMahasiswa ? "Ada" : "Tidak Ada"));
    System.out.println("Status Registrasi Online: " + (sudahRegistrasiOnline ? "Sudah" : "Belum"));
    System.out.println("------------------------------------");

    if (bolehMasuk) {
      System.out.println("Keputusan: ANDA DIIZINKAN MASUK PERPUSTAKAAN");
      System.out.println("Selamat datang!");
    } else {
      System.out.println("Keputusan: ANDA TIDAK DIIZINKAN MASUK PERPUSTAKAAN");
      System.out.println("Mohon lengkapi syarat (Kartu Mahasiswa ATAU Registrasi Online) terlebih dahulu.");
    }

    input.close();
  }
}
