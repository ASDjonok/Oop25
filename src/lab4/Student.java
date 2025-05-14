package lab4;

public class Student {
    private String name;
    private String faculty;
    private String group;

    void setFaculty(String faculty, String group/*, String passwordToken*/, String userRole) {
        /*if (!passwordToken.equals("123456")) {
            System.out.println("Invalid password token");
            return;
        }*/
        if (!userRole.equals("admin")) {
            System.out.println("Access denied");
            return;
        }

        this.faculty = faculty;
        this.group = group;
    }

    void setGroup(String group) {
        this.group = group;
    }

    // constructor
    public Student(String name, String faculty, String group) {
        this.name = name;
        this.faculty = faculty;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
