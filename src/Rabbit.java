public class Rabbit extends Animal {


    void voice() {
        System.out.println("Кролик орет от голода");;
    }

    void  eat (String food) {
        switch (food) {
            case "Grass":
                System.out.println("Кролик любит кушать травку");
                break;
            default:
                System.out.println("Кролик веган, он это есть не будет" + food);
                break;
        }


//    void eat(String food) {
//        super.eat(food); {
//            if ("Grass".equals(food)) {
//                System.out.println("Кролик любит кушать травку");
//            } else {
//                System.out.println("Кролик веган, он это есть не будет" + food);
//            }
//        }
    }
}
