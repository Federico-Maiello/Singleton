public class User {
    private static User user;
    public static User getInstance() {
        if(user == null) {
            user = new User("Default", 34);
        }
        return user;
    }
    private String name;
    private int age;

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
