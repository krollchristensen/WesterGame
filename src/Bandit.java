// Bandit: Skyder langsommere, men har høj skade
class Bandit extends Character {
    @Override
    public void shoot() {
        System.out.println("Bandit shoots with high damage, but slowly!");
    }

    @Override
    public void move() {
        System.out.println("Bandit moves slowly.");
    }
}