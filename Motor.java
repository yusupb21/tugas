public class Motor {
    String nama; 
    String jenis; 
    String warna; 
    String gas; 
    String rem;
    
    public void melaju(){
        this.gas = "di tarik";
        System.out.println("Motor"+this.nama+" Sedang melaju");
    }
    
    public void berhenti(){
        this.rem = "di tekan";
        System.out.println("Motor "+this.nama+" Akan berhenti");
    }
}
