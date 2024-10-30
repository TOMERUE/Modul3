import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Class Barang merepresentasikan barang dengan atribut nama dan harga.
 */
class Barang {
    private String nama;
    private int harga;

    /**
     * Konstruktor Barang untuk menginisialisasi nama dan harga barang.
     *
     * @param nama  Nama dari barang.
     * @param harga Harga dari barang.
     */
    public Barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    /**
     * Mengembalikan nama barang.
     *
     * @return Nama dari barang.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengembalikan harga barang.
     *
     * @return Harga dari barang.
     */
    public int getHarga() {
        return harga;
    }
}

/**
 * Class SortingBarang2 berfungsi untuk mendemonstrasikan cara pengurutan (sorting)
 * barang berdasarkan nama dan harga.
 */
public class SortingBarang2 {

    /**
     * Metode utama yang menginisialisasi daftar barang, mengurutkan daftar berdasarkan nama
     * (secara ascending) dan berdasarkan harga (secara descending), lalu mencetak hasilnya.
     *
     * @param args Argumen baris perintah.
     */
    public static void main(String[] args) {
        List<Barang> barangList = initializeBarangList();

        System.out.println("Sorting berdasarkan nama (Ascending):");
        sortByName(barangList);
        printBarangList(barangList);

        System.out.println("\nSorting berdasarkan harga (Descending):");
        sortByHarga(barangList);
        printBarangList(barangList);
    }

    /**
     * Menginisialisasi daftar barang dengan beberapa contoh data.
     *
     * @return Daftar barang yang telah diinisialisasi.
     */
    private static List<Barang> initializeBarangList() {
        List<Barang> barangList = new ArrayList<>();
        barangList.add(new Barang("Buku", 10000));
        barangList.add(new Barang("Pensil", 2000));
        barangList.add(new Barang("Laptop", 10000000));
        barangList.add(new Barang("Mouse", 150000));
        return barangList;
    }

    /**
     * Mengurutkan daftar barang berdasarkan nama secara ascending.
     *
     * @param barangList Daftar barang yang akan diurutkan.
     */
    private static void sortByName(List<Barang> barangList) {
        Collections.sort(barangList, Comparator.comparing(Barang::getNama));
    }

    /**
     * Mengurutkan daftar barang berdasarkan harga secara descending.
     *
     * @param barangList Daftar barang yang akan diurutkan.
     */
    private static void sortByHarga(List<Barang> barangList) {
        Collections.sort(barangList, Comparator.comparingInt(Barang::getHarga).reversed());
    }

    /**
     * Mencetak daftar barang dengan menampilkan nama dan harga setiap barang.
     *
     * @param barangList Daftar barang yang akan dicetak.
     */
    private static void printBarangList(List<Barang> barangList) {
        for (Barang barang : barangList) {
            System.out.println("Nama: " + barang.getNama() + ", Harga: " + barang.getHarga());
        }
    }
}
