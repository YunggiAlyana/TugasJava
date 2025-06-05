import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] gajiGolongan = {5000000, 6500000, 9500000};

        double[] persenLembur = {0.30, 0.32, 0.34, 0.36, 0.38};

        String ulang; 

        do {
            System.out.println("====================================");
            System.out.println("PROGRAM JAVA");
            System.out.println("PERHITUNGAN GAJI KARYAWAN");
            System.out.println("====================================");

            char golongan;
            int indexGolongan = -1;
            int jamLembur;
            double gajiPokok;
            double gajiLembur;

            while (true) {
                System.out.print("Masukkan Golongan (A/B/C): ");
                golongan = input.next().toUpperCase().charAt(0);

                if (golongan == 'A') {
                    indexGolongan = 0;
                    break;
                } else if (golongan == 'B') {
                    indexGolongan = 1;
                    break;
                } else if (golongan == 'C') {
                    indexGolongan = 2;
                    break;
                } else {
                    System.out.println("Input tidak valid! Golongan hanya boleh A, B, atau C.");
                }
            }

            while (true) {
                System.out.print("Masukkan Jam Lembur (>= 0): ");
                if (input.hasNextInt()) {
                    jamLembur = input.nextInt();
                    if (jamLembur >= 0) {
                        break;
                    } else {
                        System.out.println("Jam lembur tidak boleh negatif!");
                    }
                } else {
                    System.out.println("Input tidak valid! Harus berupa angka.");
                    input.next(); 
                }
            }

            gajiPokok = gajiGolongan[indexGolongan];

            if (jamLembur == 0) {
                gajiLembur = 0;
            } else if (jamLembur == 1) {
                gajiLembur = gajiPokok * persenLembur[0];
            } else if (jamLembur == 2) {
                gajiLembur = gajiPokok * persenLembur[1];
            } else if (jamLembur == 3) {
                gajiLembur = gajiPokok * persenLembur[2];
            } else if (jamLembur == 4) {
                gajiLembur = gajiPokok * persenLembur[3];
            } else {
                gajiLembur = gajiPokok * persenLembur[4];
            }

            double totalGaji = gajiPokok + gajiLembur;

            System.out.println("------------------------------------");
            System.out.printf("Gaji Pokok        : Rp. %,d%n", (int) gajiPokok);
            System.out.printf("Gaji Lembur       : Rp. %,d%n", (int) gajiLembur);
            System.out.printf("Total Penghasilan : Rp. %,d%n", (int) totalGaji);

            System.out.println("====================================");

            System.out.print("Ingin menghitung lagi? (Y/T): ");
            ulang = input.next().toUpperCase();

        } while (ulang.equals("Y"));

        System.out.println("Program selesai. Terima kasih!");
        input.close();
    }
}
