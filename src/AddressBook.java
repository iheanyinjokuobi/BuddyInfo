import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfos;
    public AddressBook() {
        buddyInfos = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddyInfos.add(buddy);
        }

    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < buddyInfos.size()) {
            return buddyInfos.remove(index);
        }
        return null;
    }

    public void call(BuddyInfo buddy) {
        System.out.println("Calling "+buddy.getName()+".....");
    }

    public static void main(String [] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        System.out.println("I added then I removed!!!");
        System.out.println("I came, I saw, I praised the Lord!!");
        addressBook.call(buddy);
    }
}
