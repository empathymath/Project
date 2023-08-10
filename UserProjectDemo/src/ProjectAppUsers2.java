import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class UserManager<P> {
    private List<P> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public void addFile(P userName) {
       users.add(userName);
    }

    public void deleteUser(P userName) {
        users.remove(userName);
    }


    public void printUsersAscending() {
        Collections.sort((List<P>) users);
        System.out.println("Users in ascending order:");
        for (P userName : users) {
            System.out.println(userName);
        }
    }

	public void deleteFile(String userNameToDelete) {
		// TODO Auto-generated method stub
		
	}

	public boolean searchFile(String userNameToDelete) {
		// TODO Auto-generated method stub
		return false;
	}
}

public class ProjectAppUsers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       UserManager userManager = new UserManager();

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add User");
            System.out.println("2. Delete User");
            System.out.println("3. Print User Ascending");
            System.out.println("4. Exit");

            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter user name to add: ");
                    String userNameToAdd = scanner.nextLine();
                    
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
                    userManager.printUsersAscending();
                    break;
                case 4:
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
