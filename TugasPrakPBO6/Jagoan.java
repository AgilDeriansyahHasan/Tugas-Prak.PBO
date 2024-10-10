public class Jagoan {
    private String name;
    private int baseHealth;
    private int baseAttack;
    private Jubah jubah;
    private Senjata senjata;
    private int level;
    private int incrementHealth;
    private int incrementAttack;

    public Jagoan(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
    }

    public void display(){
        System.out.println("Jagoan\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("MaxHealth\t: " + this.maxHealth());
        System.out.println("Attack\t\t: " + this.getAttackPower() + "\n");
    }

    public void levelUp(){
        this.level++;
    }

    public void setJubah(Jubah jubah){
        this.jubah = jubah;
    }

    public void setSenjata(Senjata senjata){
        this.senjata = senjata;
    }

    public int maxHealth(){
        return this.baseHealth + this.level * this.incrementHealth + this.jubah.getAddHealth();
    }

    public int getAttackPower(){
        return this.baseAttack + this.level * this.incrementAttack + this.senjata.getAttack();
    }

    public void attack(Jagoan opponent) {
        int damage = this.getAttackPower();
        System.out.println(this.name + " menyerang " + opponent.name + " dengan " + this.senjata.getName() + " dan memberikan damage sebesar " + damage + "!");
        opponent.receiveDamage(damage);
    }

    public void receiveDamage(int damage) {
        int health = this.maxHealth() - damage;
        System.out.println(this.name + " menerima " + damage + " damage! Sisa kesehatan: " + health + "\n");
    }
}
