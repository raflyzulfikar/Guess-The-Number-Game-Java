import java.util.Scanner;
import java.util.Random;

public class GameTebakAngka {
    public static void main(String[] args) {
    Scanner input0192 = new Scanner(System.in);
    Random random0192 = new Random();

    int angkaRahasia0192 = random0192.nextInt(10) + 1;
    int tebakan0192;
    int jumlahTebakan0192 = 0;

    System.out.println("Selamat Datang di Permainan Tebak Angka!");
    System.out.println("Saya telah memilih sebuah angka antara 1 dan 10.");
    System.out.println("Bisakah kamu menebaknya?");

    do {
        System.out.print("Tebakanmu: ");
        tebakan0192 = input0192.nextInt();
        jumlahTebakan0192++;

        if (tebakan0192 < angkaRahasia0192) {
            System.out.println("Terlalu rendah! Coba lagi.");
        }
        else if (tebakan0192 > angkaRahasia0192) {
            System.out.println("Terlalu tinggi! Coba lagi.");
        }
        else {
            System.out.println("Selamat! Kamu berhasil menebak angkanya dalam " + jumlahTebakan0192 + " percobaan!");
        }
    }while (tebakan0192 != angkaRahasia0192);

    input0192.close();
    }
}
