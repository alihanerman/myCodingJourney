package p1;

/**
 * Represents a match between two fighters.
 */
public class Match {
    private final Fighter f1;
    private final Fighter f2;
    private final int minWeight;
    private final int maxWeight;

    /**
     * Constructs a Match object with the given fighters and weight range.
     *
     * @param f1         The first fighter.
     * @param f2         The second fighter.
     * @param minWeight  The minimum weight for the match.
     * @param maxWeight  The maximum weight for the match.
     */
    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    /**
     * Runs the match between the fighters.
     */
    public void run() {
        // Generate a random number between 0 and 10 to determine the starting fighter
        double randomStart = Math.random() * 10;

        if (isCheck()) {
            // Randomly determine the starting fighter and opponent
            Fighter startingFighter = (randomStart < 5) ? f1 : f2;
            Fighter opponentFighter = (startingFighter == f1) ? f2 : f1;

            int round = 1; // Initialize the round counter

            // Continue the match until one of the fighters' health reaches 0
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("Round " + round + " Started.");

                // The starting fighter hits the opponent
                startingFighter.health = opponentFighter.hit(startingFighter);

                // Check if the match has been won
                if (isWin()) {
                    break;
                }

                // Switch the starting fighter and opponent for the next turn
                Fighter temp = startingFighter;
                startingFighter = opponentFighter;
                opponentFighter = temp;

                round++; // Increment the round counter
            }
        } else {
            System.out.println("Weight does not match!");
        }
    }

    /**
     * Checks if the weight of both fighters falls within the specified range.
     *
     * @return true if both fighters' weight is within the range, false otherwise.
     */
    private boolean isCheck() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) &&
                (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    /**
     * Checks if the match has been won by either fighter.
     *
     * @return true if one of the fighters' health is 0, indicating a win, false otherwise.
     */
    private boolean isWin() {
        if (f1.health == 0) {
            System.out.println(f2.name + " => Winner");
            return true;
        }
        if (f2.health == 0) {
            System.out.println(f1.name + " => Winner");
            return true;
        }
        return false;
    }
}
