// Cowboy: Kan skyde med revolver og bevæger sig hurtigt
class Cowboy extends Character {
    @Override
    public void shoot() {
        System.out.println("Cowboy shoots with revolver!");
    }

    @Override
    public void move() {
        System.out.println("Cowboy moves quickly.");
    }
}