import java.lang.reflect.Method;

public class MyDemo {
    public static void main(String args[]) {
        System.out.println("Hello World!");

        Animal animal = new Cat("Malous");
        System.out.println(animal.getClass().getName());
        isVeryImportantClass(animal);

        animal = new Dog("Agha Leoiii");
        System.out.println(animal);
        System.out.println(animal.getClass().getName());
        isVeryImportantClass(animal);
    }

    private static void isVeryImportantClass(Animal animal) {
        if (animal.getClass().isAnnotationPresent(VeryImportantClass.class)) {
            VeryImportantClass v = animal.getClass().getAnnotation(VeryImportantClass.class);
            System.out.println("this is an important class with a deggree of: " + v.importanceDegree());
        } else {
            System.out.println("this is NOT an important class!");
        }
    }
}