package StructuralDP.FacadeDP;

public class SHAEnc {

    //SHA ile şifreleme yapıyor

    public void encrypt(String text, String key, boolean type){
        if(type){
            System.out.println("<SHA> " + text + key + "</SHA>");
        }else{
            System.out.println("<SHA> " + key + text + "</SHA>");
        }
    }

}
