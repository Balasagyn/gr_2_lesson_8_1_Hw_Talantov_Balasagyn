package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int increaseAttack = RPG_Game.random.nextInt(10);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes [i].getHealth() > 0 && increaseAttack > 0 && this != heroes[i]){
                heroes[i].setDamage(heroes[i].getDamage() + increaseAttack);
                System.out.println(this.getName() + " increased " + heroes[i].getName() + " attack by " + increaseAttack);
            }
        }
    }
}
