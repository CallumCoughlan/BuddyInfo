//Adding comment for assignment
import java.util.*;

public class AddressBook {
    private LinkedList<BuddyInfo> addressBook;
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddyInfo = new BuddyInfo("Billie Jean", "1958 Michael Jackson Rd",  "219-843-3488");
        addressBook.addBuddy(buddyInfo);
        addressBook.removeBuddy(buddyInfo);
    }

    public AddressBook() {
        addressBook = new LinkedList<>();
    }

    public void addBuddy(BuddyInfo buddyInfo) {
        this.addressBook.add(buddyInfo);
    }

    public void removeBuddy(BuddyInfo buddyInfo) {
        this.addressBook.remove(buddyInfo);
    }
}
