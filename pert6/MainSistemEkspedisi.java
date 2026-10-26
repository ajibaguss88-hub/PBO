// File: MainSistemEkspedisi.java
import java.util.ArrayList;
import java.util.List;

public class MainSistemEkspedisi {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   SISTEM MANAJEMEN LOGISTIK FASTSPEED EXPRESS   ");
        System.out.println("==================================================\n");

        // IMPLEMENTASI POLYMORPHISM: Menampung berbagai jenis subclass dalam 1 List
        List<Armada> armadaList = new ArrayList<>();
        
        // Memasukkan objek MotorExpress, MobilBox, dan DronePengirim
        armadaList.add(new MotorExpress("B 1234 KAA", "Yamaha NMAX", 30, false));
        armadaList.add(new MobilBox("L 9988 XZ", "Hino Dutro", 3000, 6));
        armadaList.add(new DronePengirim("DRN-007", "DJI Matrice 300 RTK", 15, 120));

        System.out.println(">>> REKAP BIAYA OPERASIONAL ARMADA HARIAN <<<");
        double totalOperasional = 0;
        
        // Looping untuk memanggil method yang di-override secara dinamis (Dynamic Method Dispatch)
        for (Armada armada : armadaList) {
            armada.tampilkanInfoArmada();
            totalOperasional += armada.hitungBiayaOperasional();
            System.out.println("----------------------------------");
        }
        
        System.out.println("TOTAL KESELURUHAN BIAYA ARMADA : Rp " + String.format("%,.2f", totalOperasional));
    }
}