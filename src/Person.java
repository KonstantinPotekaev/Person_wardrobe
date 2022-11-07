import java.lang.reflect.Executable;
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

    public boolean BesideWardrobe(){
        return _BesideWardrobe;
    }
    public void AddWardrobe(Wardrobe wardrobe){
        boolean flag = true;
        for (var i : wardrobes){
            if (i == wardrobe){
                Exceptions.WardrobeAlreadyExistsException();
                flag = false;
            }
        }
        if(flag) {
            wardrobes.add(wardrobe);
        }
    }


}
