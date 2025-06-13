package encapsulation.basic;

public class Student {

    private String name;

    public void setName(String name) {
        if (name.isBlank()) {
            System.out.println("Name is required");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

}
