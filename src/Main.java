public class Main {
    public static void main(String[] args) {
        User user1 = User.getInstance();

        System.out.println("Information for the first user:");
        user1.printInformation();
        System.out.println();

        User user2 = User.getInstance();

        user2.setName("Gino");
        user2.setAge(35);

        System.out.println("Information for the second user after modification:");
        user2.printInformation();
        user1.printInformation();
    }
}
