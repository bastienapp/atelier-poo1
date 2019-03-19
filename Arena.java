public class Arena {
    
    public static void main (String[] args) {

        Monster bahaamut = new Monster("Bahaamut", 1, 2000);
        Monster chocobot = new Monster("Chocobot", 12, 400);
        
        while (!bahaamut.isKo() && !chocobot.isKo()) {
            chocobot.takeHit(bahaamut.getAttack());
            if (chocobot.getlife() > 0) {
                bahaamut.takeHit(chocobot.getAttack());
            } 
        }
    }
}
