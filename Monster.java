public class Monster {

    private String name;
    private int attack;
    private int life;

    public Monster(String name, int attack, int life){
        this.name = name;
        this.attack = attack;
        this.life = life;
    }

    public String getName() {
        return this.name;
    }
    public int getAttack() {
        return this.attack;
    }
    public int getlife() {
        return this.life;
    }

    public void setName(String name) {
       this.name = name;
    }
    public void setAttack(int attack) {
       this.attack = attack;
    }
    public void setlife(int life) {
       this.life = life;
    }

    public void takeHit(int hit) {
        this.life = this.life - hit;
        System.out.println(this.name + " has " + this.life + " points remaining. ");
        System.out.println (this.isKo() ? this.name + " is KO ": this.name + " is still alive");
        // opérateur ternaire :
        // condition ? si vrai : si faux
    }

    public boolean isKo() {
       return this.life <= 0;   
    }
}
