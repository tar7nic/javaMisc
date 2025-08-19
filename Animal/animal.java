package Animal;

public abstract class animal {
    String name;
    int age;
    
    public animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();
}

