package Animal;

public abstract class canine extends animal {
    String breed;
    String sex;

    public canine(String name, int age, String breed, String sex){
        super(name, age);
        this.breed = breed;
        this.sex = sex;
    }

    public abstract void hunts();
}
