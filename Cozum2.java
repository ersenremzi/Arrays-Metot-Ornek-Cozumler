package array_metot_bolumsonucozumleri;

//Her bir elemanı rastgele oluşturulmuş 3*2lik bir matriste bulunan
//sayıların toplamını yazdıran program yazınız.Ayrıca bu matriste yer
//alan en küçük ve en büyük sayıyı da mesaj olarak göstersin.

public class Cozum2 {

    public static void main(String[] args) {
        int [][] matris = new int[3][2];
        int enKucukSayi = 900 , enBuyukSayi=0;

        for (int satır = 0 ; satır < matris.length ; satır++){
            for (int sutun = 0 ; sutun < matris[satır].length; sutun++){
                int rastgeleSayi = (int)(Math.random()*100);
                matris[satır][sutun] = rastgeleSayi;
                System.out.println(satır+ " . satıradki " + sutun + " . sutununun elemanı : " + matris[satır][sutun]);

                if (enKucukSayi > rastgeleSayi){
                    enKucukSayi = rastgeleSayi;
                }
                if (enBuyukSayi < rastgeleSayi){
                    enBuyukSayi = rastgeleSayi;
                }
            }
        }
        System.out.println("Bu matristeki en küçük sayı : " + enKucukSayi + " \nBu matristeki en büyük sayı : " + enBuyukSayi);
    }

}
