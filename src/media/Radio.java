
package media;


public class Radio {
    private double fmFerquency;
    private int amFerquency;
    private char band;
    
    public Radio(double fmFerquency, int amFerquency, char band){
        this.fmFerquency = fmFerquency;
        this.amFerquency = amFerquency;
        this.band = band;
        
    }

    public double getFmFerquency() {
        return fmFerquency;
    }

    public void setFmFerquency(double fmFerquency) {
        this.fmFerquency = fmFerquency;
    }

    public int getAmFerquency() {
        return amFerquency;
    }

    public void setAmFerquency(int amFerquency) {
        this.amFerquency = amFerquency;
    }

    public char getBand() {
        return band;
    }

    public void setBand(char band) {
        this.band = band;
    }
    
    public void showData(){
        System.out.println("Fm Radio: " + getFmFerquency());
        System.out.println("Am Radio: " + getAmFerquency());
        System.out.println("Band: " + getBand());
        System.out.println();
              
    }
    
    
}
