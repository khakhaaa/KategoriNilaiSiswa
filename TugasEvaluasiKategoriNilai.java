package MateriDasar;
import java.util.Scanner;

public class TugasEvaluasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Nilai "+nama+":");
        int nilai = input.nextInt();
        
        String predikat = null; 
        String kategori = null;
        
        //96-100
        if(nilai > 96 && nilai <=100){
            predikat = "A+";
            kategori = "Sangat baik";
        }
        
        //91-95
        else if(nilai > 90 && nilai <=95){
            predikat = "A";
            kategori = "Sangat baik";
        }
        
        else if(nilai > 85 && nilai <=80){
            predikat = "B+";
            kategori = "Baik";
        }
        
        else if(nilai > 80 && nilai <=85){
            predikat = "B";
            kategori = "Baik";
        }
        
        else if(nilai > 74 && nilai <=80){
            predikat = "B-";
            kategori = "Baik";
        }
        
        else if(nilai > 69 && nilai <=74){
            predikat = "C+";
            kategori = "Cukup";
        }
        
        else if(nilai > 64 && nilai <=69){
            predikat = "C";
            kategori = "Cukup";
        }
        
        else if(nilai > 59 && nilai <=64){
            predikat = "C-";
            kategori = "Cukup";
        }
        
        else if(nilai > 54 && nilai <=59){
            predikat = "D+";
            kategori = "Kurang";
        }
        
        else if(nilai > 0 && nilai <=54){
            predikat = "D";
            kategori = "Kurang";
        }
        
        System.out.println("Nama: "+nama);
        System.out.println("Nilai: "+nilai);
        System.out.println(predikat);
        System.out.println(kategori);
        
        }
}
