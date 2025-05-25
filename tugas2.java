import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;

        do {
            System.out.println("====================================");
            System.out.println("PROGRAM JAVA");
            System.out.println("PERHITUNGAN GAJI KARYAWAN");
            System.out.println("====================================");
            
            char golongan;
            int jamLembur;
            double gajiPokok = 0;
            double gajiLembur;

            while (true) {
                System.out.print("Masukkan Golongan (A/B/C): ");
                golongan = input.next().toUpperCase().charAt(0);

                if (golongan == 'A' || golongan == 'B' || golongan == 'C') {
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

            switch (golongan) {
                case 'A': gajiPokok = 5000000; break;
                case 'B': gajiPokok = 6500000; break;
                case 'C': gajiPokok = 9500000; break;
            }

            if (jamLembur == 0) {
                gajiLembur = 0;
            } else if (jamLembur == 1) {
                gajiLembur = gajiPokok * 0.30;
            } else if (jamLembur == 2) {
                gajiLembur = gajiPokok * 0.32;
            } else if (jamLembur == 3) {
                gajiLembur = gajiPokok * 0.34;
            } else if (jamLembur == 4) {
                gajiLembur = gajiPokok * 0.36;
            } else {
                gajiLembur = gajiPokok * 0.38;
            }

            double totalPenghasilan = gajiPokok + gajiLembur;
            System.out.println("------------------------------------");
            System.out.println("Total Penghasilan: Rp. " + totalPenghasilan);
            System.out.println("====================================");

            System.out.print("Apakah Anda ingin menghitung lagi? (Y/T): ");
            ulang = input.next().toUpperCase();

        } while (ulang.equals("Y"));

        System.out.println("Program selesai. Terima kasih!");
        input.close();
    }
}
