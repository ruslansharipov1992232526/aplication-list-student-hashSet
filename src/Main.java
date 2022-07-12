import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> infoStudent = new HashSet<>();

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите информацию о студенте: (ФИО, номер группы, номер студенческого билета)");
            System.out.println("Иванов Петр Николаевич, 1243-Б, 31231343 <enter>");

            String input = scanner.nextLine();
            String[] separator = input.split(", ");
            String nameFamilyPatronymic = separator[0];
            if (nameFamilyPatronymic.equals("end")) {
                System.out.println("Список студентов: ");
                for (Student info : infoStudent) {
                    System.out.println(" - " + info);
                }
                return;
            }
            String numberGroup = separator[1];
            String studentId = separator[2];

            for (Student infoTwo : infoStudent) {
                if (studentId.equals(infoTwo.studentId)) {
                    System.out.println("Такой ID же существует в базе, попробуйте другой");
                }
            }

            infoStudent.add(new Student(nameFamilyPatronymic, numberGroup, studentId));
        }
    }
}
