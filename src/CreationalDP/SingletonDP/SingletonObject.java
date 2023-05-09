package CreationalDP.SingletonDP;
/*
    1-Private static instance oluştur
    2-Parametresiz Constructor'ı private yap
    3-Public bir method oluştur, bu method üzerinde private ve static yaptığım değişken üzerinden aynı objenin gönderilmesini sağla.
    **Artık objeler singleton olacak
    **Sadece 1 defa new'ledik
*/
public class SingletonObject {

    String message = "Merhaba";

    //1-Gelen bütün objelerin aynı olması için parametresiz constructor'ı private yaptık.
    //Ama bu sefer de obje üretemem.
    private SingletonObject(){};

    //2-private olarak static erişim belirleyicisine sahip instance oluşturuyoruz.
    //Burda new'liyorum ama static olduğu için aynı obje dönüyor.
    private static SingletonObject instance = new SingletonObject();

    //3-public erişim belirleyicisinde bir method oluşturuyorum.Bu sefer singleton instance oluşacak.
    public static SingletonObject getInstance(){
        return instance;
    }

    //Bu method çağırılınca çağırılan classın message değerini değiştirsin
    public void changeMessage(){
        this.message = this.message + " Batch 130-131";
        System.out.println(this.message);
    }


    //SingletonObject.getInstance()

}
