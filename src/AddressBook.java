import java.util.*;

public class AddressBook {
    private LinkedList<BuddyInfo> addressBook;
    public static void main(String[] args) {
        System.out.println("Address Book");
    }

    public void addBuddy(BuddyInfo buddyInfo) {
        this.addressBook.add(buddyInfo);
    }

    public void removeBuddy(BuddyInfo buddyInfo) {
        this.addressBook.add(buddyInfo);
    }
}
