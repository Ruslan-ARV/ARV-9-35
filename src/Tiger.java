public class Tiger extends Animal {


    void voice() {
        System.out.println("Тигр рычит и хочет есть");;
    }

    void  eat (String food) {
        switch (food) {
            case "Meat":
                System.out.println("Тигр обожает есть мясо");
                break;
            default:
                System.out.println("Тигр не веган, он это не ест" + food);
                break;
        }


//    void eat(String food) {
//        super.eat(food); {
//            if ("Meat".equals(food)) {
//                System.out.println("Тигр обожает есть мясо");
//            } else {
//                System.out.println("Тигр не веган, он это не ест" + food);
//            }
//        }
    }
}
