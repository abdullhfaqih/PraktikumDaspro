import java.util.Scanner;

public class ifCetakKRS01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("--- Cetak KRS SIAKAD ---");
    System.out.print("Apakah UKT sudah lunas? (true/false) : ");
    boolean uktLunas = input.nextBoolean();

    // Modifikasi Program
    // IF-ELSE Menggunakan ternary operator
    String output = uktLunas ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA!"
        : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

    System.out.println(output);

    // if (uktLunas) {
    // System.out.println("Pembayaran UKT terverifikasi");
    // System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA!");
    // } else {
    // // Modifikasi program
    // // jika input bernilai false, maka tampilkan pesan
    // System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
    // }

    input.close();
  }
}