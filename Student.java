import java.util.ArrayList;

public class Student {
    private String studentId;
    private String name;
    private ArrayList<Course> registeredCourses;

    // Constructor
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    // Get total credits registered
    public int getTotalCredits() {
        int sum = 0;
        for (Course c : registeredCourses) {
            sum += c.getCredits();
        }
        return sum;
    }

    // Register for a course
    public boolean registerCourse(Course course) {
        int newCredits = getTotalCredits() + course.getCredits();
        if (newCredits > 21) {
            System.out.println("❌ Cannot register " + course.getCourseName() + ". Credit limit exceeded!");
            return false;
        }
        registeredCourses.add(course);
        System.out.println("✅ Registered for: " + course.getCourseName());
        return true;
    }

    // Drop a course
    public boolean dropCourse(String courseCode) {
        for (Course c : registeredCourses) {
            if (c.getCourseCode().equals(courseCode)) {
                registeredCourses.remove(c);
                System.out.println("✅ Dropped: " + c.getCourseName());
                return true;
            }
        }
        System.out.println("❌ Course not found in your registrations.");
        return false;
    }

    // View registered courses
    public void viewRegisteredCourses() {
        if (registeredCourses.isEmpty()) {
            System.out.println("⚠ No courses registered yet.");
        } else {
            System.out.println("📚 Courses registered by " + name + ":");
            for (Course c : registeredCourses) {
                System.out.println(c);
            }
            System.out.println("➡ Total Credits: " + getTotalCredits());
        }
    }
}
