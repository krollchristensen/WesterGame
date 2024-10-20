// Superklasse Character
abstract class Character {
    // Alle karakterer har en abstrakt metode shoot() som skal implementeres af underklasserne
    public abstract void shoot(); 

    // Alle karakterer har en move() metode, som kan overskrives af underklasserne
    public void move() {
        System.out.println("Character moves.");
    }
}
