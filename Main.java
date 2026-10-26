import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetor com capacidade para 50 carros
        Carro[] carros = new Carro[50];

        int quantidade;

        // Solicita a quantidade de carros
        do {
            System.out.print("Quantos carros deseja cadastrar (1 a 50)? ");
            quantidade = scanner.nextInt();
            scanner.nextLine();

            if (quantidade < 1 || quantidade > 50) {
                System.out.println("Quantidade inválida! Digite um número entre 1 e 50.");
            }

        } while (quantidade < 1 || quantidade > 50);

        // Cadastro dos carros
        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nCadastro do carro " + (i + 1));

            System.out.print("Nome do carro: ");
            String nome = scanner.nextLine();

            System.out.print("Preço do carro: ");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            carros[i] = new Carro(nome, preco);
        }

        // Exibição dos carros e cálculo do total
        double somaPrecos = 0;

        System.out.println("\n===== RESUMO DO CADASTRO =====");

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Carro: " + carros[i].nome);
            System.out.printf("Preço: R$ %.2f%n", carros[i].preco);

            somaPrecos += carros[i].preco;
        }

        System.out.println("\nQuantidade total de carros: " + quantidade);
        System.out.printf("Soma dos preços: R$ %.2f%n", somaPrecos);

        scanner.close();
    }
}