import java.util.Objects;

public class Student {
    String name;
    String group;
    String studentId;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return name + ", " + group + ", " + studentId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !obj.getClass().equals(Student.class)) return false;
        Student st = (Student) obj;
        if (studentId.equals(st.studentId)) {
            System.out.println("Такой идентификатор уже существует, попробуйте другой");
        }
        return studentId.equals(st.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
