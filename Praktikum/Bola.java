public class Bola{
    private double jari;

    public void setJari(double jari){
        this.jari=jari;
    }
    public double getJari(){
        return jari;
    }
    public void showVolume(){
        double volume =  4/3 * Math.PI * Math.pow(jari, 3);
        System.out.println("Volume: "+ volume);
    }
    public void showDiameter(){
        double diameter = jari * 2;
        System.out.println("Diameter: "+ diameter);
    }
    public void showLuasPermukaan(){
        double luaspermukaan = 4*Math.PI*Math.pow(jari, 2);
        System.out.println("Luas Permukaan: "+ luaspermukaan);
    }
    
}