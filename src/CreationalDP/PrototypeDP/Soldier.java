package CreationalDP.PrototypeDP;

public class Soldier implements Cloneable{

    private int healt;
    private int speed;
    private int maxLifeTime;
    private int agility;
    private int power;
    private int rank;
    private String weapon;

    private boolean isAvailableForWar;


    public Soldier(int healt, int speed, int maxLifeTime, int agility, int power, int rank, String weapon, boolean isAvailableForWar) {
        this.healt = healt;
        this.speed = speed;
        this.maxLifeTime = maxLifeTime;
        this.agility = agility;
        this.power = power;
        this.rank = rank;
        this.weapon = weapon;
        this.isAvailableForWar = isAvailableForWar;
    }


    public void showSoldierInfo(){
        System.out.println("Saglik: " + healt);
        System.out.println("Hiz: " + speed);
        System.out.println("Guc: " + power);

        if(isAvailableForWar){
            System.out.println("Savasa Hazir !!");
        }else{
            System.out.println("Bu asker savasamaz !!");
        }

    }

    //clone() methodunu override ettim
    @Override
    protected Soldier clone(){
        Soldier soldier = null;
        //clone() methodunu doldurcaz
        //Sen klonlarken şurdan clone al gel
        try {
            soldier = (Soldier)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Asker kopyalama sırasında bir hata oluştur.");
            e.printStackTrace();
        }
        return soldier;
    }

    public int getHealt() {
        return healt;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxLifeTime() {
        return maxLifeTime;
    }

    public void setMaxLifeTime(int maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isAvailableForWar() {
        return isAvailableForWar;
    }

    public void setAvailableForWar(boolean availableForWar) {
        isAvailableForWar = availableForWar;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }
}
