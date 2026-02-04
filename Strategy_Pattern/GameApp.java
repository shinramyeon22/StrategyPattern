package Strategy_Pattern;

interface AttackStrategy {
    void performAttack();
}

class SwingSword implements AttackStrategy {
    public void performAttack() {
        System.out.println("Swinging sword fiercely!");
    }
}

class CastSpell implements AttackStrategy {
    public void performAttack() {
        System.out.println("Casting a powerful spell!");
    }
}

class ShootArrow implements AttackStrategy {
    public void performAttack() {
        System.out.println("Shooting a precise arrow!");
    }
}

interface DefenseStrategy {
    void performDefense();
}

class Shield implements DefenseStrategy {
    public void performDefense() {
        System.out.println("Blocking with shield!");
    }
}

class Dodge implements DefenseStrategy {
    public void performDefense() {
        System.out.println("Dodging the attack!");
    }
}

class CreateMagicBarrier implements DefenseStrategy {
    public void performDefense() {
        System.out.println("Creating magic barrier!");
    }
}


abstract class Character {
    public String name;
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Character(String name, AttackStrategy attack, DefenseStrategy defend) {
        this.name = name;
        this.attackStrategy = attack;
        this.defenseStrategy = defend;
    }

    public void setAttackStrategy(AttackStrategy strategy) {
        this.attackStrategy = strategy;
    }

    public void setDefenseStrategy(DefenseStrategy strategy) {
        this.defenseStrategy = strategy;
    }

    public void attack() {
        System.out.print(name + " → ");
        attackStrategy.performAttack();
    }

    public void defend() {
        System.out.print(name + " → ");
        defenseStrategy.performDefense();
    }

    public void showKnightDefenses() {
        System.out.println(name + " (Knight) can use:");
        new Shield().performDefense();
        new Dodge().performDefense();
        new CreateMagicBarrier().performDefense();
    }

    public abstract void introduce();
}


class Knight extends Character {
    public Knight(String name) {
        super(name, new SwingSword(), new Shield());
    }

    public void introduce() {
        System.out.println("\nI am " + getClass().getSimpleName() + " " + name + " – brave warrior!");
    }
}

class Wizard extends Character {
    public Wizard(String name) {
        super(name, new CastSpell(), new CreateMagicBarrier());
    }

    public void introduce() {
        System.out.println("I am " + getClass().getSimpleName() + " " + name + " – master of arcane arts!");
    }
}

class Archer extends Character {
    public Archer(String name) {
        super(name, new ShootArrow(), new Dodge());
    }

    public void introduce() {
        System.out.println("I am " + getClass().getSimpleName() + " " + name + " – deadly from afar!");
    }
}

public class GameApp {
    public static void main(String[] args) {
        Character knight = new Knight("Arthur");
        Character wizard = new Wizard("Merlin");
        Character archer = new Archer("Legolas");

        System.out.print("-------------------------");

        knight.introduce();   knight.attack();   knight.defend();
        System.out.println();
        knight.showKnightDefenses();
        System.out.println("------------------------");

        wizard.introduce();   wizard.attack();   wizard.defend();
        System.out.println("------------------------");

        archer.introduce();   archer.attack();   archer.defend();

        System.out.println("\nArcher finds a magic sword!");
        archer.setAttackStrategy(new SwingSword());
        archer.attack();

        System.out.println("-------------------------");
    }
}