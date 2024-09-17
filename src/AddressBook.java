import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfos;
    public AddressBook() {
        buddyInfos = new ArrayList<>();
    }

    public static void main(String [] args) {
            System.out.println("Address Book");
    }

    public void addBuddy(BuddyInfo buddy) {
        buddyInfos.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddyInfos.remove(buddy);
    }
}
