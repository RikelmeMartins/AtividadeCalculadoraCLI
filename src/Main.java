public class Main {

    public static int somar(int num1, int num2){
        return num1 + num2;
    }

    public static int sub(int num1, int num2){
        return num1 - num2;
    }

    public static int mult(int num1, int num2){
        return num1 * num2;
    }

    public static double div(int num1, int num2){
        return (float) num1 / num2;
    }

    public static double pot(int num1, int num2){
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {

        String op = args[1];
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);

        switch (op){

            case "+" -> {
                int resultado = somar(num1, num2);
                System.out.printf("O resultado da soma é: %d", resultado);
            }

            case "-" -> {
                int resultado = sub(num1, num2);
                System.out.printf("O resultado da subtração é: %d", resultado);
            }

            case "*" -> {
                int resultado = mult(num1, num2);
                System.out.printf("O resultado da multiplicação é: %d", resultado);
            }

            case ":" -> {
                double resultado = div(num1, num2);
                if (num2 == 0){
                    System.out.println("Não é possivel dividir por 0.");
                } else {
                    System.out.printf("O resultado da divisão é: %.1f", resultado);
                }
            }

            case "^" -> {
                double resultado = pot(num1, num2);
                System.out.printf("O resultado da exponenciação é: %.0f", resultado);
            }

            default -> System.out.println("Oporeção invalida!");
        }
    }
}
