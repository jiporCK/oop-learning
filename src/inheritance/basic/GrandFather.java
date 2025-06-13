package inheritance.basic;

public class GrandFather {

    private String firstName = "Monkey D.";

    private String lastname;

    public String getFirstName() {
        return firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void showInfo() {
        System.out.println("=====| Info |=====");
        System.out.println("Fist name: " + firstName);
        System.out.println("Last name: " + lastname);
    }

}
