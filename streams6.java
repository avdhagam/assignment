import java.util.*;

class Students {
    private String name;
    private String department;

    public Students(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }
}

public class streams6 {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students("av", "cse"));
        students.add(new Students("diya", "ece"));
        students.add(new Students("MARIYA\uD83D\uDC9C", "eee"));
        students.add(new Students("isha", "cse"));

        // Create a Map for grouping students by department
        Map<String, List<Students>> deptmap = new HashMap<>();
        for (Students stud : students) {
            deptmap.computeIfAbsent(stud.getDepartment(), k -> new ArrayList<>()).add(stud);
        }

        // Print the map of departments and their students
        System.out.println("Students grouped by department:");
        for (Map.Entry<String, List<Students>> entry : deptmap.entrySet()) {
            System.out.println("Department: " + entry.getKey());
            for (Students s : entry.getValue()) {
                System.out.println("  - " + s.getName());
            }
        }

        Map<String, Integer> departmentCount = new HashMap<>();
        for (Map.Entry<String, List<Students>> entry : deptmap.entrySet()) {
            departmentCount.put(entry.getKey(), entry.getValue().size());
        }

        System.out.println("\nNumber of students in each department:");
        for (Map.Entry<String, Integer> entry : departmentCount.entrySet()) {
            System.out.println("Dept: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
