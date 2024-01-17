public class TestSiswa {
public static void main(String[] args) {
EncapSiswa siswa = new EncapSiswa();
siswa.setName("agus");
siswa.setAbsen(20);
siswa.setAddress("Malang");

    System.out.print("nama: "+siswa.getName()
    + " Alamat: "+siswa.getAddress()+ " Absen: "+siswa.getAbsen());
}
    
}
