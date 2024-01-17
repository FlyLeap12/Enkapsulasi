public class Buku {
    String namaBuku="Sihaboedin";
    private String kategori="Komik";
    protected int harga=50000;

    public void tampilNama(){
        System.out.println("Nama Buku: "+namaBuku);
    }
    public void tampilKategori(){
        System.out.println("Kategori: "+kategori);
    }
    public void tampilHarga(){
        System.out.println("Harga: "+harga);
    }
    // Mutator Method
    public void setKategori(){
        this.kategori=kategori;
    }
    // Asesor Method
    public String getKategori(){
        return kategori;
    }

    public Buku(){
        System.out.println("Selamat Datang di Perpustakaan");
    }
}
