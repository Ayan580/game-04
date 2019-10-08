import java.util.Random;

public class Main {

    public static int bossHealth = 700;
    public static int[] heroesHealth = {250, 250, 250,};


    public static int bossAttack = 50;
    public static int[] heroesAttack = {20, 20, 20};

    public static String bossDefenceType = " ";
    public static String[] heroesAttackType = {"Physical", "Magical", "Kinetic"};

    public static void main(String[] args) {

    }

    public static boolean isFinshed() {
        if (bossHealth <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        if (heroesHealth[0] <= 0 && heroesHealth[1] <= 0 && heroesHealth[2] <= 0) {
            System.out.println("Boss won!!!");
            return true;
        }
        return false;
    }

    public static void bossHit() {
        for (int i = 0; i < heroesHealth.length; i++) {
            heroesHealth[i] = heroesHealth[i] - bossAttack;

        }
    }

    public static void heroeshit() {
        for (int i = 0; i < heroesAttack.length; i++) {
            bossHealth = bossHealth - heroesAttack[1]; // bossHealth -= heroesAttack[i];


        }
    }

    public static void printStatistics() {
        System.out.println("Boss Health " + bossHealth);
        System.out.println("Warrior Health " + heroesHealth[0]);
        System.out.println("Magic Health " + heroesHealth[1]);
        System.out.println("kinetic Health " + heroesHealth[1]);
    }
}
