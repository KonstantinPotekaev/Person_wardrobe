public class Main {
    public static void main(String[] args) {
        var wardrobe = new Wardrobe();
        var person = new Person(false);
        person.AddWardrobe(wardrobe);
        person.ChangePosition(true);


        wardrobe.OpenWardrobe(new Person(true))ж
    }
}