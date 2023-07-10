public class Flujo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    public static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    public static void metodo2() {
        System.out.println("Ini do metodo2");
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(i);
                if (i == 3) {
                    String test = null;
                    System.out.println(test.toString());
                }

                int num = 0;
                int resultado = i / num;
                System.out.println(resultado);

            } catch (NullPointerException | ArithmeticException e) {
                System.out.println(e);
            }
        }
        System.out.println("Fim do metodo2");
    }
}
