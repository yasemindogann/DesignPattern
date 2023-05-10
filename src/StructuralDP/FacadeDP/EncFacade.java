package StructuralDP.FacadeDP;

public class EncFacade {

    //key ve boolen değerlerini ben set'licem
    //Kullanıcıdan gereksiz data almicaz
    //User sadece text girecek send'e basacak

    private AESEnc aesEnc = new AESEnc();
    private MD5Enc md5Enc = new MD5Enc();
    private SHAEnc shaEnc = new SHAEnc();



    //Bana bir değer dönmesine gerek yok, String ifadeyi ben döndürcem
    public void encrypt(String text, EncType encType){
        switch (encType){
            case AES: aesEnc.encrypt(text);
            break;
            case MD5: md5Enc.encrypt(text,"KEY");
            break;
            case SHA: shaEnc.encrypt(text, "KEY", true);
            break;
            default: throw new IllegalArgumentException(encType.toString());
        }
    }


    public enum EncType{
        SHA,
        MD5,
        AES
    }


}
