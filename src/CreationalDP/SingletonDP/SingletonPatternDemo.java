package CreationalDP.SingletonDP;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //SingletonObject.getInstance();
        //SingletonObject obj = new SingletonObject();

        SingletonObject obj1 = SingletonObject.getInstance();
        System.out.println(obj1.message);   //Merhaba
        obj1.changeMessage();   //Merhaba Batch 130-131

        //2.objeyi üretiyorum
        SingletonObject obj2 = SingletonObject.getInstance();
        System.out.printf(obj2.message);

        System.out.println();

/*
        SingletonObject obj3 = SingletonObject.getInstance();
        System.out.printf(obj3.message);

        System.out.println();

        SingletonObject obj4 = SingletonObject.getInstance();
        obj4.changeMessage();

        SingletonObject obj5 = SingletonObject.getInstance();
        System.out.printf(obj5.message);
*/

    }
}
