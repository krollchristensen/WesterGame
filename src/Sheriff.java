// Sheriff: Kan skyde præcist og bevæger sig langsommere, men har mere liv
class Sheriff extends Character {
    @Override
    public void shoot() {
        System.out.println("Sheriff shoots with precision!");
    }

    @Override
    public void move() {
        System.out.println("Sheriff moves steadily, but has more health.");
    }
}