class User {
    private static int totalUsers = 0;

    User() {
        totalUsers++;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }
}

class UserTest {
    public static void main(String[] args) {
        new User();
        new User();
        new User();

        System.out.println("Total Users: " + User.getTotalUsers());
    }
}
