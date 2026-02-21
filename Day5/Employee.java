class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    Employee(int id, String name) {
        this(id, name, "Unassigned", 0.0);
    }

    Employee(int id) {
        this(id, "Unknown", "Unassigned", 0.0);
    }
}
