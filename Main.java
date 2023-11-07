package days30;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        byte angka;
        
        System.out.print("Masukkan angka = ");
        angka = input.nextByte();
        
        String hasil = (angka > 10)?"Angka lebih besar dari 10":"angka lebih kecil dari 10";
        
        System.out.println(hasil);
    }
    
}
    
    
