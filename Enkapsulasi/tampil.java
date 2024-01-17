public class tampil {
    public static void main(String[] args) {
        Buku b = new Buku();
        b.tampilNama();
        b.tampilKategori();
        b.tampilHarga();
        System.out.println(b.getKategori());
        System.out.println(b.harga);
    }
}
