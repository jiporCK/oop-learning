package exercise.exercise1;

public class Student {
    private String name;
    private Double[] scores;

    public Student(String name, Double[] scores){
        this.name=name;
        this.scores=scores;
    }
    public String getName(){
        return name;
    }
    public double calculateGPA(){
        double total=0;
        for(double score : scores){
            total+=score;
        }
        double average = total / scores.length;
        if(average>=93){
            System.out.println("GPA: 4.0");
        }else if(average>=90){
            System.out.println("GPA: 3.7");
        }else if(average>=87){
            System.out.println("GPA: 3.3");
        }else if(average>=83){
            System.out.println("GPA: 3.0");
        }else if(average>=80){
            System.out.println("GPA: 2.7");
        }else if(average>=77){
            System.out.println("GPA: 2.3");
        }else if(average>=73){
            System.out.println("GPA: 2.0");
        }else if(average>=70){
            System.out.println("GPA: 1.7");
        }else if(average>=67){
            System.out.println("GPA: 1.3");
        }
        else if(average>=65){
            System.out.println("GPA: 1.0");
        }
        else {
            System.out.println("GPA: 0.0");
        }
            return average;
    }
}
