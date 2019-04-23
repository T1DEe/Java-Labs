import Classes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {

    private static List<Student> students = new ArrayList<>();
    private static University university = new University("BSTU");
    private static Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) {
        // Lab07 part 1
        studentsInit();
        for (Student item: students) {
            item.start();
        }

        // Lab07 part 2
        Restaurant.Task(2, 7);
    }


    public static void studentsInit() {
        students.add(new Student(1, university, semaphore));
        students.add(new Student(2, university, semaphore));
        students.add(new Student(3, university, semaphore));
        students.add(new Student(4, university, semaphore));
        students.add(new Student(5, university, semaphore));
        students.add(new Student(6, university, semaphore));
        students.add(new Student(7, university, semaphore));
        students.add(new Student(8, university, semaphore));
        students.add(new Student(9, university, semaphore));
        students.add(new Student(10, university, semaphore));
        students.add(new Student(11, university, semaphore));
        students.add(new Student(12, university, semaphore));
        students.add(new Student(13, university, semaphore));
        students.add(new Student(14, university, semaphore));
        students.add(new Student(15, university, semaphore));
        students.add(new Student(16, university, semaphore));
        students.add(new Student(17, university, semaphore));
        students.add(new Student(18, university, semaphore));
        students.add(new Student(19, university, semaphore));
        students.add(new Student(20, university, semaphore));
        students.add(new Student(21, university, semaphore));
        students.add(new Student(22, university, semaphore));
        students.add(new Student(23, university, semaphore));
        students.add(new Student(24, university, semaphore));
        students.add(new Student(25, university, semaphore));
    }
}
