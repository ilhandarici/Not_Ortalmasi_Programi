import java.util.Scanner;
public class Not_Ortalamasi_Programi {
    public static void main(String[] args) {
    
     // eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
    
     // scanner atandı.
     Scanner inp = new Scanner(System.in);
     
     // değişkenler tanımlandı.
     int mat,fiz,kim,tur,tar,muzik,toplam;
     
     // kullanıcıdan veri alındı.
     try {
     System.out.print("Matematik dersi notunuzu giriniz :");
     mat = inp.nextInt();

     System.out.print("Fizik dersi notunuzu giriniz :");
     fiz = inp.nextInt();

     System.out.print("Kimya dersi notunuzu giriniz :");
     kim = inp.nextInt();

     System.out.print("Türkçe dersi notunuzu giriniz :");
     tur = inp.nextInt();

     System.out.print("Tarih dersi notunuzu giriniz :");
     tar = inp.nextInt();

     System.out.print("Müzik dersi notunuzu giriniz :");
     muzik = inp.nextInt();
     } finally{
         inp.close();
     }
    
     // matematiksel işlemler yapıldı. 
     toplam = mat + fiz + kim + tur + tar + muzik;
     double sonuc = toplam / 6;

     // koşul işlemi yapıldı.
     String kosul = (sonuc >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
     System.out.println("Not ortalamanız : "+sonuc);
     System.out.println("Sınıfı Geçme/Kalma durumunuz : "+kosul);
     
    }
    
}
