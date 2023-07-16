public class Boss {
    private int health;
    private int damage;
    private String protectionType;


    public Boss(int health, int damage, String protectionType) {
        this.health = health;
        this.damage = damage;
        this.protectionType = protectionType;
    }

    public int getHealth() {
        return health;
    }

    public void setProtectionType(String protectionType) {
        this.protectionType = protectionType;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        if (health <= 0) {
            System.out.println("You entered a negative number, please enter a positive number");
        } else {
            this.health = health;
        }
    }

        public String getProtectionType () {
            return protectionType;
        }

        public int getDamage () {
            return damage;
        }



    }

