package Transportasi;
import java.util.Scanner;

public class BMW {
    static String bil2;
    boolean b, on;
    int Gigi;
    Scanner input = new Scanner(System.in);

    public void Menu(){
    while(bil2 != "Keluar" ){
        System.out.println("::::::Jalankan Mobil::::::");
        System.out.println("1. Hidupkan Mesin");
        System.out.println("2. Berhentikan Mobil");
        System.out.println("3. Belok");
        System.out.println("4. Naikkan Gigi");
        System.out.println("5. Turunkan Gigi");
        System.out.println("6. Matikan Mesin");
        System.out.print("Masukan Pilihan Anda = ");
        int pilihan = input.nextInt();

        switch(pilihan){      
            case 1:              
            	if (b = true){
			        System.out.println("Mesin Dinyalakan");
	            }
                break;
            case 2:
	            System.out.println("Mobil Sekarang Berhenti");
                break;
            case 4:
                if(Gigi > 5 ){
                    System.out.println("Gigi Tidak Bisa Ditambah ");
                    break;
                }
                else{
                    ++ Gigi;
	                System.out.println("Gigi Telah Dinaikan : " + Gigi);
                }
                break;
            case 5:
                if(Gigi < 1 ){
                    System.out.println("Gigi Tidak Bisa Diturunkan ");
                    break;
                }

                else{
                    -- Gigi;
	                System.out.println("Gigi Telah Diturunkan : " + Gigi);
                }
                break;
            case 6:        
            	if (b = true){
			        System.out.println("Mesin Dimatikan");
	            }
                bil2 ="Keluar";
                System.out.println("Anda Telah Keluar Dari Mobil");
                break;
            case 3:
                System.out.println("Ketik 1 Untuk Belok Kanan Atau 2 Untuk Belok Kiri (1/2)");
                int pilih= input.nextInt();
                switch(pilih){
                    case 1:
                        System.out.println("Mobil Belok Kanan");
                        break;
                    case 2:
                        System.out.println("Mobil Belok Kiri");
                        break;     
                }
                break;
            default:
                System.out.println("Anda harus mengisi angka yang benar");
            }
        }
    }
}