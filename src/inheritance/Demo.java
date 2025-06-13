package inheritance;

import inheritance.basic.Father;
import inheritance.basic.GrandFather;
import inheritance.basic.Son;

public class Demo {
    public static void main(String[] args) {

        GrandFather grandFather = new GrandFather();
        grandFather.setLastname("Garp");
        grandFather.showInfo();

        Father father = new Father();
        father.setLastname("Dragon");
        father.setDevilFruit("Wind Wind Fruit");
        father.showInfo();

        Son son = new Son();
        son.setLastname("Luffy");
        son.setDevilFruit("Gum Gum Fruit");
        son.showInfo();

    }
}
