public class Main {
    public static void main(String[] args) {
        var wardrobe = new Wardrobe();
        var person = new Person(false);
        person.addWardrobe(wardrobe);
        person.changePosition(true);


        wardrobe.openWardrobe(new Person(true));
    }
}