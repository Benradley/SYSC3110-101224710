public class AddressBook {

    private BuddyInfo buddies[];

    public AddressBook (){
        buddies = new BuddyInfo[10];
    }

    public int addBuddy(BuddyInfo buddy){
        for(int i=0; i<10; i++){
            if (buddies[i] == null){
                buddies[i]=buddy;
                return i;
            }
        }
        System.out.println("addBuddy; could not add buddy");
        return -1;
    }

    public int removeBuddy(BuddyInfo buddy){
        for(int i=0; i<10; i++){
            if (buddies[i].getName().equals(buddy.getName())){
                buddies[i]=null;
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "613", "Carleton");
        AddressBook addressbook = new AddressBook();
        addressbook.addBuddy(buddy);
        addressbook.removeBuddy(buddy);
        System.out.println("AddressBook done");
    }



}
