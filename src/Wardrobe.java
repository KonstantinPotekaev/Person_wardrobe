import java.lang.reflect.Executable;

public class Wardrobe {
    private boolean isOpen;


    public void openWardrobe(Person person) {
        if (!person.isOwner(this)){
            Exceptions.IsNotOwnerException();
        }
        else if (!person.besideWardrobe()){
            Exceptions.IsNotBesideWardrobe();
        }
        else{
            isOpen = true;
        }
    }

    public void closeWardrobe(Person person) {
        if (!person.isOwner(this)){
            Exceptions.IsNotOwnerException();
        }
        else if (!person.besideWardrobe()){
            Exceptions.IsNotBesideWardrobe();
        }
        else{
            isOpen = false;
        }
    }


}
