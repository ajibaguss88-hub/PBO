// File: DronePengirim.java
public class DronePengirim extends Armada {
    private int batasKetinggianMaksimal;

    public DronePengirim(String noPlat, String merk, double kapasitasKg, int batasKetinggianMaksimal) {
        super(noPlat, merk, kapasitasKg);
        this.batasKetinggianMaksimal = batasKetinggianMaksimal;
    }

    @Override
    public double hitungBiayaOperasional() {
        // Rumus biaya operasional drone: (Kapasitas * 10.000) + 50.000 (Asuransi)
        return (this.kapasitasKg * 10000.0) + 50000.0;
    }

    @Override
    public void tampilkanInfoArmada() {
        System.out.println("--- [DRONE PENGIRIM] ---");
        // Memanggil cetak info dasar dari parent class (Armada)
        super.tampilkanInfoArmada(); 
        System.out.println("Maks Ketinggian : " + batasKetinggianMaksimal + " Meter");
        System.out.println("Biaya/Hari      : Rp " + String.format("%,.2f", hitungBiayaOperasional()));
    }
}