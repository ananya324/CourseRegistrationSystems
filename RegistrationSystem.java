import java.util.ArrayList;

public class RegistrationSystem {
    private ArrayList<Course> availableCourses;

    public RegistrationSystem() {
        availableCourses = new ArrayList<>();
        loadDefaultCourses();
    }

    // Add some default courses
    private void loadDefaultCourses() {
        availableCourses.add(new Course("CSE101", "Introduction to Programming", 4));
        availableCourses.add(new Course("CSE102", "Data Structures", 3));
        availableCourses.add(new Course("CSE103", "Database Systems", 3));
        availableCourses.add(new Course("CSE104", "Operating Systems", 4));
        availableCourses.add(new Course("CSE105", "Computer Networks", 3));
    }

    // View all available courses
    public void viewAvailableCourses() {
        System.out.println("📋 Available Courses:");
        for (Course c : availableCourses) {
            System.out.println(c);
        }
    }

    // Find course by course code
    public Course findCourse(String courseCode) {
        for (Course c : availableCourses) {
            if (c.getCourseCode().equals(courseCode)) {
                return c;
            }
        }
        return null;
    }
}
