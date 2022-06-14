@VeryImportantClass(importanceDegree = 4)
public class Cat implements Animal {
    private String name;
    Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSound() {
        return "Meow Meow!";
    }

    @Override
    public String toString() {
        return "Cat name is " + name;
    }
}
