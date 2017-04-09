public class Kendaraan extends Motor{

    public static void main(String[] args){
        Motor motormio = new Motor();
        motormio.nama = "Mio";
        motormio.warna = "Merah";
        System.out.println("Motor "+motormio.nama+" warnanya "+motormio.warna);
       
        motormio.melaju();
        System.out.println("Gas "+motormio.gas);
        motormio.berhenti();
        System.out.println("Rem "+motormio.rem);
	System.out.println("");

        Motor motorjupiter = new Motor();
        motorjupiter.nama = "Jupiter";
        motorjupiter.warna = "Putih";
        System.out.println("Motor "+motorjupiter.nama+" warnanya "+motorjupiter.warna);
        
        motorjupiter.melaju();
        System.out.println("Gas "+motorjupiter.gas);
        motorjupiter.berhenti();
        System.out.println("Rem "+motorjupiter.rem);
	System.out.println();

	System.out.println("Rubah Motor Jupiter");
	motorjupiter.nama = "VIXION";
        motorjupiter.warna = "MERAH";
        System.out.println("Motor "+motorjupiter.nama+" warnanya "+motorjupiter.warna);

	motorjupiter.melaju();
        System.out.println("Gas "+motorjupiter.gas);
        motorjupiter.berhenti();
        System.out.println("Rem "+motorjupiter.rem);
        
    }

}
