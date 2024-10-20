public class Main {
    public static void main(String[] args) {
        // Opretter en array af forskellige karakterer
        Character[] characters = {new Cowboy(), new Bandit(), new Sheriff()};

        // Alle karakterer skyder og bevæger sig, baseret på deres unikke egenskaber
        for (Character character : characters) {
            character.shoot();
            character.move();
        }
    }
}