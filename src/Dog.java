public class Dog extends  Animal {


    void voice() {
        System.out.println("Собака гавкает и просит есть");
    }

    void  eat (String food) {
        switch (food) {
            case "Meat":
                System.out.println("Собак ест мясо");
                break;
            default:
                System.out.println("Собака не ест" + food);
                break;
        }


//    void eat(String food) {
//        super.eat(food); {
//            if ("Meat".equals(food)) {
//                System.out.println("Собак ест мясо");
//            } else {
//                System.out.println("Собака не ест" + food);
//            }
//        }
    }
}
