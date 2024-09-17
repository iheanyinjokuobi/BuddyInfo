import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfos;
    public AddressBook() {
        buddyInfos = new ArrayList<>();
    }

    public static void main(String [] args) {
            BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
            AddressBook addressBook = new AddressBook();
            addressBook.addBuddy(buddy);
            addressBook.removeBuddy(buddy);
    }

    public void addBuddy(BuddyInfo buddy) {
        buddyInfos.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddyInfos.remove(buddy);
    }
}
