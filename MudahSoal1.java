import java.util.Scanner;

public class MudahSoal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Masukkan Jarak Pengiriman (KM) : ");
        System.out.println("------------------------------");
        int jarak = input.nextInt();
        int biaya;
        System.out.println("==============================");
        System.out.println("Masukkan Ukuran Paket : ");
        System.out.println("------------------------------");
        System.out.println("Panjang (cm) :");
        int panjang = input.nextInt();
        System.out.println("Lebar (cm) :");
        int lebar = input.nextInt();
        System.out.println("Tinggi (cm) :");
        int tinggi = input.nextInt();
        System.out.println("------------------------------");
        System.out.println("Berat Paket (KG) : ");
        int berat = input.nextInt();
        System.out.println("==============================");


        if (jarak <= 10) {
            biaya = 4250;
        } else if (jarak > 10) {
            biaya = 6000;
        } else {
            biaya = 0;

    }

        //pengukuran
        int ukuran = panjang * lebar * tinggi;
        int totalBiaya = biaya * berat;

        if (ukuran > 100) {
            totalBiaya = totalBiaya + 50000;
        }else {
            totalBiaya = totalBiaya;
        }

        System.out.println(" Total Biaya Pengiriman : " + totalBiaya + " Rupiah");
        System.out.println("==============================");

}
}
