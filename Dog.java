public class Dog implements Animal {
    private String name;
    Dog(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSound() {
        return "Wag Wag!";
    }

    @Override
    public String toString() {
        return "Dog name is " + name;
    }
}
