package CreationalDP.PrototypeDP;

public class PrototypePatternDemo {
    public static void main(String[] args) {

        //1.Yol savaşabilen asker
        //Savasmaya hazır asker objesi
        Soldier availableSoldier1 = new Soldier(100,45,20,50,60,5,"Kilic",true);

        //1-savaşamayan asker - Uzun yol
        Soldier notAvailableSoldier1 = new Soldier(100,45,20,50,60,5,"Kilic",false);


        //2-savaşamayan asker - Yukardaki parametreli const. klonlicaz
        //"implements Cloneable" diycez
        //savaşabilen askerin yedeği oluştu
        Soldier notAvailableSoldier2 = availableSoldier1.clone();
        notAvailableSoldier2.setAvailableForWar(false);


        System.out.println("***********************");
        System.out.println("notAvailableSoldier icin cikti : ");
        notAvailableSoldier1.showSoldierInfo();
        System.out.println("******************************");
        System.out.println("Clone ozelligi kullanilarak uretilen Askerin ciktisi ");
        notAvailableSoldier2.showSoldierInfo();



    }
}
