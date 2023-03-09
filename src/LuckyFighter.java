public class LuckyFighter extends Fighter {

    // A field for us to always have the original stamina of the fighter
    private final int initialStamina;

    private int luck;

    private final Strategy strategy;

    // When an aggressive fighter will try their luck
    // In order to reduce inflicted damage
    private static final int AGGRESSIVE_RESISTANCE_THRESHOLD = 2;

    // The multiple by which damage should be increased
    private static final int AGGRESSIVE_MULTIPLIER = 2;
    private static final int MISS_PENALTY = 1;

    public LuckyFighter(String name, String type, int skill, int stamina, int luck, Strategy strategy,
                        GameEngine theGameEngine) {

        super(name, type, skill, stamina, theGameEngine);

        this.initialStamina = stamina;
        this.luck = luck;
        this.strategy = strategy;
    }


    // TODO: Complete this method
    /* If a fighter gets hit during a battle, the fighter can test their luck
     If the fighter has an average strategy they will only test their luck if their
     stamina is below the averageResistanceThreshold
     If the fighter has an aggressive strategy then they test their luck if their
     stamina is below the AGGRESSIVE_RESISTANCE_THRESHOLD
     If they are defensive then they will always test their luck when taking damage
     If the fighter is lucky, the damage inflicted is reduced by one,
     but if the fighter is unlucky, the damage inflicted is increased by one.
     You can only test your luck if you have a luck value greater than 0.
    */
    @Override
    public void takeDamage(int damage) {

        final int averageResistanceThreshold = initialStamina / 2;

        // INSERT CODE

        super.takeDamage(damage);

    }

    // TODO: Complete this method
    /* If the fighter is lucky, the damage inflicted is reduced by one,
     but if the fighter is unlucky, the damage inflicted is increased by one.
     Only aggressive fighters will test their luck with this
     */
    @Override
    public int calculateDamage() {

        // INSERT CODE

        return super.calculateDamage();
    }

    // TODO: Answer the following question.
    // Why do you think that this method may be private?

    // TODO: Complete this method that allows a fighter to test their luck.
    // They roll two dice, and are lucky if and only if
    // The sum of the numbers on the dice is less than or equal to their current luck
    // Each time a fighter tests their luck - the luck value is decreased by one until 0
    // (log whether the fighter is lucky or not)
    private boolean testLuck() {

        theGameEngine.log(getName() + " tests luck...");

        // INSERT CODE

        return false;
    }

    @Override
    public String toString() {
        return name + " - " + strategy + " " + type + " - skill: "
                + skill + "; stamina: " + stamina + "; luck: " + luck;
    }
}
