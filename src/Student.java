public class Student {
    private String name;
    private double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double calculateGPA() {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.printf("GPA: %.2f%n", convertToGradePoint(calculateGPA()));
    }

    private double convertToGradePoint(double grade) {
        if (grade >= 90) return 4.0;
        else if (grade >= 85) return 3.7;
        else if (grade >= 80) return 3.3;
        else if (grade >= 75) return 3.0;
        else if (grade >= 70) return 2.7;
        else if (grade >= 65) return 2.3;
        else if (grade >= 60) return 2.0;
        else if (grade >= 50) return 1.0;
        else return 0.0;
    }

    public static void main(String[] args) {
        double[] grades = {85.5, 90.0, 78.0, 92.0, 88.5};
        Student student = new Student("Alice", grades);
        student.printInfo();
    }
}

