package kg.geektech.game.players;


import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
      savedDamage = RPG_Game.random.nextInt(boss.getDamage());
      this.setHealth(this.getHealth() - savedDamage);
      boss.setHealth(boss.getHealth() - savedDamage);
        System.out.println(this.getName() + " hit boss with saved damage of " + savedDamage);
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }
}
