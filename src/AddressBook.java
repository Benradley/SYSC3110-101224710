import java.util.ArrayList;

public class AddressBook {
//testing editing inside of github
    private ArrayList<BuddyInfo> buddies;

    public AddressBook (){
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if(buddy != null){
            buddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if(index >=0 && index < buddies.size()){
            return buddies.remove(index);
        }
        return null;
    }


    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "613", "Carleton");
        AddressBook addressbook = new AddressBook();
        addressbook.addBuddy(buddy);
        addressbook.removeBuddy(0);
        System.out.println("AddressBook done");
    }



}
