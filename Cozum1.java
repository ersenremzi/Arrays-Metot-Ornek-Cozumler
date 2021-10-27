package array_metot_bolumsonucozumleri;

//100 elemanlı bir dizi oluşturun ve bu dizinin tüm elemanlarını rastgele olucak şekilde üretin. >>>
//Bu işlemden sonra dizideki elemanların ortalamasını hesaplayarak bu ortalamaın altında kaç tane eleman olduğunu yazdırın.

public class Cozum1 {

    public static void main(String[] args) {
        int sayilar[] = new int[100];
        int tumSayilarınToplamı = 0;

        for (int i = 0; i < sayilar.length; i++) {
            int rastgeleSayi = (int) (Math.random() * 100);
            sayilar[i] = rastgeleSayi;
            tumSayilarınToplamı += rastgeleSayi;
            //tumSayilarınToplamı = tumSayilarınToplamı + rastgeleSayi;
        }

        double ortalama = (double) tumSayilarınToplamı / (double) sayilar.length;

        int ortalamaAltindakiDegerlerinSayisi = 0;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] < ortalama) {
                ortalamaAltindakiDegerlerinSayisi++;
            }

        }

        System.out.println("Ortalama : " + ortalama + " ve ortalamanın altındaki değerlerin sayısı : " + ortalamaAltindakiDegerlerinSayisi);
    }

}
