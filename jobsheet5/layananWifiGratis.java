import java.util.Scanner;

public class layananWifiGratis {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan jenis pengguna (Dosen/Mahasiswa): ");
    String jenisPengguna = input.next();

    if (jenisPengguna.equalsIgnoreCase("Dosen")) {
      System.out.println("Akses diberikan (Dosen)");
    } else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
      System.out.println("Masukkan jumlah SKS anda: ");
      int sks = input.nextInt();
      if (sks >= 12) {
        System.out.println("Akses diberikan (Mahasiswa Aktif)");
      } else {
        System.out.println("Akses ditolak, SKS kurang dari 12");
      }
    } else {
      System.out.println("Jenis pengguna tidak valid");
    }

    input.close();
  }
}
