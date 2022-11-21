import java.lang.reflect.Executable;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private boolean besideWardrobe;
    private List<Wardrobe> wardrobes = new ArrayList<>();
    public Person(boolean besideWardrobe) {
        this.besideWardrobe = besideWardrobe;
    }
    public void changePosition(boolean BesideWardrobe){
        this.besideWardrobe = BesideWardrobe;
    }

    public boolean isOwner(Wardrobe wardrobe){
        for (var i : wardrobes) {
            if (i == wardrobe){
                return true;
            }
        }
        return false;
    }

    public boolean besideWardrobe(){
        return this.besideWardrobe;
    }
    public void addWardrobe(Wardrobe wardrobe){
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
