import java.util.Random;

public class BuddyInfo {
    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    private final String name;
    private final String address;
    private final String number;

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Jack", "444 street", "123456896");
        System.out.println("Hello "+ buddy.getName());
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }
}

