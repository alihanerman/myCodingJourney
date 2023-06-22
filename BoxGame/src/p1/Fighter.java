package p1;

/**
 * Represents a fighter in a match.
 */
public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    /**
     * Constructs a Fighter object with the given attributes.
     *
     * @param name    The name of the fighter.
     * @param damage  The damage inflicted by the fighter.
     * @param health  The health of the fighter.
     * @param weight  The weight of the fighter.
     * @param dodge   The dodge chance of the fighter.
     */
    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    /**
     * Performs a hit on the opponent fighter.
     *
     * @param opponent The opponent fighter.
     * @return The updated health of the opponent after the hit.
     */
    public int hit(Fighter opponent) {

        System.out.println(this.name + " => " + opponent.name + " " + this.damage + " damage given.");

        // Check if the opponent dodges the attack
        if (opponent.isDodge()) {
            System.out.println(opponent.name + " dodged the damage.");
            return opponent.health;
        }

        // Calculate the updated health of the opponent after the hit
        return Math.max(opponent.health - this.damage, 0);
    }

    /**
     * Checks if the fighter successfully dodges an attack based on dodge chance.
     *
     * @return true if the fighter dodges, false otherwise.
     */
    public boolean isDodge() {
        double randomValue = Math.random() * 100;  // Generates a random value between 0.0 and 99.9
        return randomValue <= this.dodge;
    }
}


