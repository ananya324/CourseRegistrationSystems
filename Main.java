import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create system + one student
        RegistrationSystem regSys = new RegistrationSystem();
        Student student = new Student("S101", "John Doe");

        int choice;
        do {
            System.out.println("\n===== Course Registration System =====");
            System.out.println("1. View Available Courses");
            System.out.println("2. Register for a Course");
            System.out.println("3. Drop a Course");
            System.out.println("4. View Registered Courses");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    regSys.viewAvailableCourses();
                    break;
                case 2:
                    System.out.print("Enter Course Code to Register: ");
                    String code = sc.nextLine();
                    Course c = regSys.findCourse(code);
                    if (c != null) {
                        student.registerCourse(c);
                    } else {
                        System.out.println("❌ Invalid Course Code!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Course Code to Drop: ");
                    String dropCode = sc.nextLine();
                    student.dropCourse(dropCode);
                    break;
                case 4:
                    student.viewRegisteredCourses();
                    break;
                case 5:
                    System.out.println("👋 Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("⚠ Invalid choice. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
