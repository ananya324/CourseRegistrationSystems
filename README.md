# 🎓 Course Registration System (Java)

## 📌 Project Description

The **Course Registration System** is a console-based Java application that allows students to register for courses, drop courses, and view their registered courses.
It simulates a simple academic registration portal with credit validation to ensure students stay within a defined range of credit hours.

This project demonstrates **Object-Oriented Programming (OOP)** concepts such as encapsulation, abstraction, and collections in Java.

---

## 🚀 Features

* 📋 View all available courses
* ➕ Register for a course (with credit limit check: 15–21 credits)
* ➖ Drop a registered course
* 📚 View all registered courses with total credits
* ✅ Menu-driven console interface

---

## 🛠 Tech Stack

* **Language**: Java (Core)
* **IDE**: IntelliJ IDEA Community Edition
* **Data Structures**: ArrayList (for storing courses and student registrations)

---

## ⚙️ Setup Instructions

1. Clone this repository:

   ```bash
   git clone https://github.com/ananya324/CourseRegistrationSystems.git
   ```
2. Open IntelliJ IDEA → **File → Open** → select the cloned project folder.
3. Ensure the **JDK** is set up (IntelliJ may prompt you to set it).
4. Inside `src/`, find `Main.java`.
5. Run the program:

   * Click the **green ▶ button** near `public static void main`
   * The console will display the menu to interact with the system.

---

## 📖 Implementation Approach

* **Classes Used:**

  * `Course` → stores course code, name, and credits
  * `Student` → stores student info and registered courses
  * `RegistrationSystem` → manages available courses
  * `Main` → menu-driven interface for student interaction

* **Logic:**

  * Students can register only if total credits ≤ 21 and ≥ 15.
  * ArrayLists are used to dynamically store courses and registrations.
  * Menu options allow viewing, adding, and dropping courses easily via console.

* **OOP Concepts Demonstrated:**

  * **Encapsulation:** private attributes with getters/setters
  * **Abstraction:** separate classes for modular functionality
  * **Collections:** dynamic data management using ArrayList

