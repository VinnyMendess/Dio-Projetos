import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
            //Essa exceção foi sofrida
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage()); 
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("Erro: O segundo parâmetro deve ser maior que o primeiro");
        } else {
            System.out.println("O segundo parâmetro é maior que o primeiro");
            int contagem = parametroDois - parametroUm;
            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.println(i);
            }
        }
    }
}