public class Main {
    public static void main(String[] args) {
        // Your code here
        Dog dog = new Dog();
        dog.main();
    }
}

class Animal {
    public String speak() {
        // Your code here
        return "Animal sound...";
    }
}

class Dog extends Animal {
    public String speak() {
        // Your code here
        return "Bark!";
    }

    public static void main(){
        Dog fido = new Dog();
        System.out.println(fido.speak());
    }
}