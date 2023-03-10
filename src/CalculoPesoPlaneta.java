import java.util.Scanner;

abstract class PlanetaBase {
    private final String nome;
    private final double fatorGravidade;

    public PlanetaBase(String nome, double fatorGravidade) {
        this.nome = nome;
        this.fatorGravidade = fatorGravidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso(double pesoNaTerra) {
        return pesoNaTerra * fatorGravidade;
    }
}

class Mercurio extends PlanetaBase {
    public Mercurio() {
        super("Mercúrio", 0.38);
    }
}

class Venus extends PlanetaBase {
    public Venus() {
        super("Vênus", 0.91);
    }
}

class Terra extends PlanetaBase {
    public Terra() {
        super("Terra", 1.0);
    }
}

class Marte extends PlanetaBase {
    public Marte() {
        super("Marte", 0.38);
    }
}

class Jupiter extends PlanetaBase {
    public Jupiter() {
        super("Júpiter", 2.34);
    }
}

class Saturno extends PlanetaBase {
    public Saturno() {
        super("Saturno", 0.93);
    }
}

class Urano extends PlanetaBase {
    public Urano() {
        super("Urano", 0.92);
    }
}

class Netuno extends PlanetaBase {
    public Netuno() {
        super("Netuno", 1.12);
    }
}

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