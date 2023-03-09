public class Fighter {

    // TODO: Answer the following question:
    // Why do we have the access specifier protected in front of the variable names?
    protected final String name;

    protected final String type;

    protected final int skill;

    protected int stamina;

    protected final GameEngine theGameEngine;

    private static final int DAMAGE_VALUE = 2;

    public Fighter(String name, String type, int skill, int stamina, GameEngine theGameEngine) {

        this.name = name;
        this.type = type;
        this.skill = skill;
        this.stamina = stamina;
        this.theGameEngine = theGameEngine;

    }

    public void takeDamage(int damage) {
        stamina = Math.max(stamina - damage, 0);
    }

    public int calculateDamage() {
        return DAMAGE_VALUE;
    }

    public int calculateAttackScore() {
        return skill + theGameEngine.rollDice()
                + theGameEngine.rollDice();
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " - " + type + " - skill: " + skill
                + "; stamina: " + stamina;
    }

    public boolean isDead() {
        return stamina == 0;
    }
}
