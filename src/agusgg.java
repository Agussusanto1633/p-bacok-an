import java.util.Scanner;

class LibrarySystem {
    Scanner scanner = new Scanner(System.in);

    void start() {
        int choice;
        String nim, username, password;
        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your NIM: ");
                    nim = scanner.next();
                    isLoggedIn = loginStudent(nim);
                    break;
                case 2:
                    System.out.print("Enter your username (admin): ");
                    username = scanner.next();
                    System.out.print("Enter your password (admin): ");
                    password = scanner.next();
                    isLoggedIn = loginAdmin(username, password);
                    break;
                case 3:
                    System.out.println("adios");
                    System.exit(0);
                default:
                    System.out.println("Invalid option, please choose a number between 1 and 3.");
            }
        }
    }

    boolean loginStudent(String nim) {
        if (nim.length() == 15) {
            if ("202310370311373".equals(nim)) {
                System.out.println("Successful Login as Student");
                return true;
            } else {
                System.out.println("User Not Found");
            }
        } else {
            System.out.println("Invalid NIM format, please use a 15-digit number.");
        }
        return false;
    }

    boolean loginAdmin(String username, String password) {
        if ("admin".equals(username) && "admin".equals(password)) {
            System.out.println("Successful Login as Admin");
            return true;
        } else {
            System.out.println("Admin User Not Found");
        }
        return false;
    }
}

public class agusgg {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.start();
    }
}