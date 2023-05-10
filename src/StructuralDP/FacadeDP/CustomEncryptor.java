package StructuralDP.FacadeDP;

public class CustomEncryptor {
    public static void main(String[] args) {

        String text = " Content ";

/*
        //Bu mimari uygun değil.Kötü dizayn örneği
        //Ben değerleri kullanıcıdan alamam
        //Gereksiz data alarak kullanıcıyı yoramam.
        //Ne yapmam lazım?
        //Araya ek bir class koymam lazım

        AESEnc aesEnc = new AESEnc();
        aesEnc.encrypt(text);

        MD5Enc md5Enc = new MD5Enc();
        md5Enc.encrypt(text, "KEY ");

        SHAEnc shaEnc = new SHAEnc();
        shaEnc.encrypt(text, "KEY ", true);
*/

        //İyi dizayn örneği
        System.out.println("*******************************");
        EncFacade encFacade = new EncFacade();
        encFacade.encrypt(text, EncFacade.EncType.SHA);



    }
}
