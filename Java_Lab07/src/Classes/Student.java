package Classes;

import java.util.concurrent.Semaphore;

public class Student extends Thread {

    private int studentID;
    private University university;
    Semaphore semaphore;

    public int getStudentID() {
        return studentID;
    }

    public Student(int studentID, University university, Semaphore semaphore) {
        super(String.valueOf(studentID));

        this.studentID = studentID;
        this.university = university;
        this.semaphore = semaphore;
    }



    @Override
    public void run() {
        try {
            university.goThroughTheDoor(this);
        }
        catch (InterruptedException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
