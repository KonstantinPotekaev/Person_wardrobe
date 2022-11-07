public class Wardrobe {
    private boolean _isOpen;


    public void OpenWardrobe(Person person){
        if (person.isOwner(this)){
            _isOpen = true;
        }
        else{
            IsNotOwnerExeption();
        }
    }
    public void CloseWardrobe(Person person){
        if (person.isOwner(this)){
            _isOpen = false;
        }
        else{
            IsNotOwnerExeption();
        }
    }

    private void IsNotOwnerExeption(){
        System.out.println("У человека нет такого шкафа");
    }
}
