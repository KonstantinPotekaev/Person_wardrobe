import java.lang.reflect.Executable;

public class Wardrobe {

    private boolean _isOpen;


    public void OpenWardrobe(Person person) {
        if (!person.isOwner(this)){
            Exceptions.IsNotOwnerException();
        }
        else if (!person.BesideWardrobe()){
            Exceptions.IsNotBesideWardrobe();
        }
        else{
            _isOpen = true;
        }
    }

    public void CloseWardrobe(Person person) {
        if (!person.isOwner(this)){
            Exceptions.IsNotOwnerException();
        }
        else if (!person.BesideWardrobe()){
            Exceptions.IsNotBesideWardrobe();
        }
        else{
            _isOpen = false;
        }
    }


}
