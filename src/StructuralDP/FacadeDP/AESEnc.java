package StructuralDP.FacadeDP;

public class AESEnc {

    //AES ile şifreleme yapıyor

    //Kod uzamasın diye interface kullanmadık.Normalde interface kullanmamız lazım.

    //Normalde AES algoritmasıyla şifrelenmiş text dönmesini istiyoruz.
    //Sadece konuyu anlamak için void yaptık
    public void encrypt(String text){
        System.out.println("<AES> " + text + " </AES>");
    }

}
