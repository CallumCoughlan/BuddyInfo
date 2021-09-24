public class BuddyInfo {

    public BuddyInfo() {
        this("Billie Jean", "1958 Michael Jackson Rd",  "219-843-3488");
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private String name, address, phoneNumber;

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo();
        System.out.println("Hello " + buddy.getName());
    }
}
