package inheritance.basic;

public class Father extends GrandFather{

    private String devilFruit;

    public String getDevilFruit() {
        return devilFruit;
    }

    public void setDevilFruit(String devilFruit) {
        this.devilFruit = devilFruit;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Devil Fruit: " + devilFruit);
    }

}
