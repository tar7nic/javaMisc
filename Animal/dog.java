package Animal;

public class dog extends canine implements pet{
    String Ownername;

    public dog(String name, int age, String breed, String sex, String Ownername){
        super(name, age, breed, sex);
        this.Ownername = Ownername;
    }
    
    public void beFriendly(){
        System.out.println("Dog is being Friendly");

    }

    public void play(){
        System.out.println("The dog is playing.");
    }

    public void makeSound(){
        System.out.println("Bhow bhow");
    }

    public void hunts(){
        System.out.println("Dog hunts pussi cat.");
    }

    public void displayInfo(){
        System.out.println("name" + name);
        System.out.println("Owner" + Ownername);
        System.out.println("Sex" + sex);
        System.out.println("breed" + breed);
        System.out.println("Age" + age);
    }
}
