public class Tiger extends Animal {


    void voice() {
        System.out.println("Тигр рычит и хочет есть");;
    }


    void eat(String food) {
        super.eat(food); {
            if ("Meat".equals(food)) {
                System.out.println("Тигр обожает есть мясо");
            } else {
                System.out.println("Тигр не веган, он это не ест" + food);
            }
        }
    }
}
