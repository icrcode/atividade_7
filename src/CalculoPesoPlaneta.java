import java.util.Scanner;

public class CalculoPesoPlaneta {
    public static void main(String[] args) {
        // solicita o peso da pessoa na Terra
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu peso em kg: ");
        double pesoNaTerra = scanner.nextDouble();

        // define os dados dos planetas
        PlanetaBase[] planetas = {new Mercurio(), new Venus(), new Terra(), new Marte(), new Jupiter(), new Saturno(), new Urano(), new Netuno()};

        // apresenta a lista de planetas disponíveis
        System.out.println("Escolha um planeta para viajar:");
        for (int i = 0; i < planetas.length; i++) {
            System.out.println(i + ". " + planetas[i].getNome());
        }

        // solicita a escolha do planeta
        System.out.print("Digite o número do planeta escolhido: ");
        int indexPlaneta = scanner.nextInt();

        if (indexPlaneta < 0 || indexPlaneta >= planetas.length) {
            System.out.println("Planeta inválido!");
        } else {
            PlanetaBase planetaEscolhido = planetas[indexPlaneta];
            double pesoNoPlaneta = planetaEscolhido.getPeso(pesoNaTerra);

            // apresenta o resultado
            System.out.println("Seu peso em " + planetaEscolhido.getNome() + " é de " + pesoNoPlaneta + " kg.");
        }

        // fecha o scanner
        scanner.close();
    }
}