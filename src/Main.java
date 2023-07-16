public class Main {
    public static void main(String[] args) {

       Boss boss = new Boss(800, 150, "Armor");
        System.out.println(" BOSS in :");
        System.out.println("HEALTH: " + boss.getHealth() + " DAMAGE: " + boss.getDamage()
              + " PROTECTION TYPE: " + boss.getProtectionType());
        System.out.println();



        Hero[] heroes = createHeroes();
        System.out.println("Heroes Information:");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Hero " + (i+1) + ":");
            System.out.println("Health: " + heroes[i].getHealth());
            System.out.println("Damage: " + heroes[i].getDamage());
            System.out.println("Superpower: " + heroes[i].getSuperPower());
            System.out.println();
        }
    }
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(300, 40, "Flying");
        Hero hero2 = new Hero(280, 70);
        Hero hero3 = new Hero(320, 50, "Invisibility");

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;

    }

   }


