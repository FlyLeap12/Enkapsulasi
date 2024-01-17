public class Bus {
    private int penumpang;
    private int maxpenumpang;
 
    public Bus(int var1) {
       this.maxpenumpang = var1;
       this.penumpang = 0;
    }
 
    public void pluspenumpang(int var1) {
       int var2 = this.penumpang + var1;
       if (var2 >= this.maxpenumpang) {
          System.out.println("Overload penumpang");
       } else {
          this.penumpang = var2;
       }
 
    }
 
    public void cetak() {
       System.out.println("Penumpang sekarang = " + this.penumpang);
       System.out.println("penumpang seharusnya adalah =" + this.maxpenumpang);
    }
}
