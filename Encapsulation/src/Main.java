public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        player.fullName = "sharad";
        player.health = 20;
        player.weapon = "AKM";

        int damage =30;
        player.loseHealth(damage);
        System.out.println("Remaining health ="+player.healthRemaining());

        player.loseHealth(11);
        System.out.println("remaining health "+player.healthRemaining());
    }
}