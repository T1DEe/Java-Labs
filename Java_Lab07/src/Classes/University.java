package Classes;

public class University {

    private String name;

    public University(String name) {
        this.name = name;
    }

    public void goThroughTheDoor(Student student) throws InterruptedException {
            // Запрашиваем у семафора разрешение на выполнение
            student.semaphore.acquire();
            System.out.println ("Студент " + student.getStudentID() + " начинает выходить.");
            // Время выхода
            Thread.sleep(500);

            System.out.println ("Студент " + student.getStudentID() + " вышел.");
            student.semaphore.release();
    }


    @Override
    public String toString() {
        return this.name;
    }
}
