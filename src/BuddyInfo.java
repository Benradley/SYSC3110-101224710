public class BuddyInfo {

    private String name;
    private String phone_num;
    private String address;


    public BuddyInfo(String name, String phone_num, String address) {
        this.name = name;
        this.phone_num = phone_num;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo homer = new BuddyInfo("Homer","234","123");

        System.out.println("Hello World!");
        System.out.println(homer.getName());
    }
}
