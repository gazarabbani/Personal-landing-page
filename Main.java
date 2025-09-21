// NIM            : F1D02410121
// Nama           : Mochammad Gaza Hadi Rabbani
// Semester       : 3 (Tiga)
// Kelas          : D
// Mata Kuliah    : Algoritma dan Struktur Data
// Dosen Pengampu : Santi Ika Murpratiwi, S.Kom., M.Kom.
//                  Assesment 1 Single Linked List

package SingleLinkedlist;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        linkedlist Patientlist = new linkedlist();
        try (Scanner scanner = new Scanner(System.in)){
        int choice, NoAntrian = 0, NoToRemove = 0;
        do {
            System.out.println("\n|=========================================================================|");
            System.out.println("|                                 Menu                                    |");
            System.out.println("|=========================================================================|");
            System.out.println("| 1. Tambah Pasien                                                        |");
            System.out.println("| 2. Panggil Pasien                                                       |");
            System.out.println("| 3. Tampilkan Antrian Pasien                                             |");
            System.out.println("| 4. Keluar                                                               |");
            System.out.println("|=========================================================================|");
            System.out.print(" Pilih opsi (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character
            System.out.println("\n\n\n|=========================================================================|");

            switch(choice) {
                case 1:
                    System.out.print(" Masukkan Nama Pasien: ");
                    String name = scanner.nextLine();
                    NoAntrian +=1;
                    Patientlist.addPatient(name, NoAntrian);
                    break;
                case 2:
                    NoToRemove  += 1;
                    Patientlist.CallPatient(NoToRemove);
                    break;
                case 3:
                    Patientlist.ShowPatient();
                    break;
                case 4:
                    System.out.println(" Keluar dari program.");
                    break;
                default:
                    System.out.println(" Opsi tidak valid, silakan coba lagi.");
                    break;
            }
            System.out.println("|=========================================================================|\n\n");
        } while (choice != 4);
    }
    }
}