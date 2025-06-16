package exercise.exercise1;

public class Demo {
    public static void main(String[] args) {
        Double[] scores={67d,98d,76d,56d,100d};
        Student student= new Student("Keang",scores);

        System.out.println("Student name: "+ student.getName());
        System.out.println("Student scores: "+ student.calculateGPA());
    }
}
