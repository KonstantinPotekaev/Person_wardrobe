import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private boolean _BesideWardrobe;
    private List<Wardrobe> wardrobes = new ArrayList<>();
    public Person(boolean BesideWardrobe) {
        _BesideWardrobe = BesideWardrobe;
    }
    public void ChangePosition(boolean BesideWardrobe){
        _BesideWardrobe = BesideWardrobe;
    }

    public boolean isOwner(Wardrobe wardrobe){
        for (var i : wardrobes) {
            if (i == wardrobe){
                return true;
            }
        }
        return false;
    }

    public void AddWardrobe(Wardrobe wardrobe){
        for (var i : wardrobes){
            if (i == wardrobe){
                throw
            }
        }
        wardrobes.add(wardrobe);
    }

}
