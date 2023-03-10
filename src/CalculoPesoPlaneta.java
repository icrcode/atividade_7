import java.util.Scanner;

interface Planeta {
    String getNome();
    double getPeso(double pesoNaTerra);
}

class Mercurio implements Planeta {
    public String getNome() {
        return "Mercúrio";
    }
    public double getPeso(double pesoNaTerra) {
        return pesoNaTerra * 0.38;
    }
}

class Venus implements Planeta {
    public String getNome() {
        return "Vênus";
    }
    public double getPeso(double pesoNaTerra) {
        return pesoNaTerra * 0.91;
    }
}

class Terra implements Planeta {
    public String getNome() {
        return "Terra";
    }
    public double getPeso(double pesoNaTerra) {
        return pesoNaTerra;
    }
}

class Marte implements Planeta {
    public String getNome() {
        return "Marte";
    }
    public double getPeso(double pesoNaTerra) {
        return pesoNaTerra * 0.38;
    }
}

class Jupiter implements Planeta {
    public String getNome() {
        return "Júpiter";
    }
    public double getPeso(double pesoNaTerra) {
        return pesoNaTerra * 2.34;
    }
}

class Saturno implements Planeta {
    public String getNome() {
        return "Saturno";
    }
    public double getPeso(double pesoNaTerra) {
        return pesoNaTerra * 0.93;
    }
}

class Urano implements Planeta {
    public String getNome() {
        return "Urano";
    }
    public double getPeso(double pesoNaTerra) {
        return pesoNaTerra * 0.92;
    }
}

class Netuno implements Planeta {
    public String getNome() {
        return "Netuno";
    }
    public double getPeso(double pesoNaTerra) {
        return pesoNaTerra * 1.12;
    }
}

public class CalculoPesoPlaneta {
    public static void main(String[] args) {
        // solicita o peso da pessoa na Terra
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu peso em kg: ");
        double pesoNaTerra = scanner.nextDouble();

        // define os dados dos planetas
        Planeta[] planetas = {new Mercurio(), new Venus(), new Terra(), new Marte(), new Jupiter(), new Saturno(), new Urano(), new Netuno()};

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
            Planeta planetaEscolhido = planetas[indexPlaneta];
            double pesoNoPlaneta = planetaEscolhido.getPeso(pesoNaTerra);
            // apresenta o resultado
            System.out.println("Seu peso em " + planetaEscolhido.getNome() + " é de " + pesoNoPlaneta + " kg.");
        }
        // fecha o scanner
        scanner.close();
    }
}