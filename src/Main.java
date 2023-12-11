public class Main {
    public static void main(String[] args) {
        User user1 = new User("Giulia", 25);

        System.out.println("Information for the first user:");
        user1.printInformation();
        System.out.println();

        User user2 = new User("Franco", 30);

        user2.setName("NewName");
        user2.setAge(35);

        System.out.println("Information for the second user after modification:");
        user2.printInformation();
    }
}
