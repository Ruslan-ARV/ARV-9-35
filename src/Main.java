public class Main {
    public static void main(String[] args) {

//        Task 1 // Создать логически верную иерархию животных

        Dog dog = new Dog();
        dog.voice();
        dog.eat("Meat");
        dog.eat("Grass");

        Tiger tiger = new Tiger();
        tiger.voice();
        tiger.eat("Meat");
        tiger.eat("Grass");

        Rabbit rabbit = new Rabbit();
        rabbit.voice();
        rabbit.eat("Grass");
        rabbit.eat("Meat");

    }
}