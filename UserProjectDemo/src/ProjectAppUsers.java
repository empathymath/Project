import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class UserManager<T extends Comparable<T>> {
    private List<T> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public void addFile(T userName) {
       users.add(userName);
    }

    public void deleteUser(T userName) {
        users.remove(userName);
    }

    public boolean searchFile(T userName) {
        return users.contains(userName);
    }

    public void printUsersAscending() {
        Collections.sort(users);
        System.out.println("Files in ascending order:");
        for (T userName : users) {
            System.out.println(userName);
        }
    }

	public void deleteFile(String userNameToDelete) {
		// TODO Auto-generated method stub
		
	}
}

public class ProjectAppUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       UserManager<String> userManager = new UserManager<>();

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add User");
            System.out.println("2. Delete User");
            System.out.println("3. Search User");
            System.out.println("4. Print User Ascending");
            System.out.println("5. Exit");

            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter user name to add: ");
                    String userNameToAdd = scanner.nextLine();
                    userManager.addFile(userNameToAdd);
                    System.out.println("User added successfully.");
                    break;
                case 2:
                    System.out.print("Enter user name to delete: ");
                    String userNameToDelete = scanner.nextLine();
                    if (userManager.searchFile(userNameToDelete)) {
                        userManager.deleteFile(userNameToDelete);
                        System.out.println("User deleted successfully.");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter user name to search: ");
                    String userNameToSearch = scanner.nextLine();
                    if (userManager.searchFile(userNameToSearch)) {
                        System.out.println("user found.");
                    } else {
                        System.out.println("user not found.");
                    }
                    break;
                case 4:
                    userManager.printUsersAscending();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
