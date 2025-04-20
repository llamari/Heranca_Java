import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Estagiario> estagiarios = new ArrayList<>();
    static ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<>();
    static ArrayList<Gerente> gerentes = new ArrayList<>();

    public static void main(String[] args) {
        // declaração de variáveis
        int escolha = 1;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println(
                    "1 - Cadastrar um novo funcionário\n2 - Exibição de dados de um funcionários em específico\n3 - Exibição de dados de funcionários de determinado cargo\n0 - Sair\nInsira a opção desejada: ");
            escolha = teclado.nextInt();
            teclado.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println(
                            "1 - Gerente\n2 - Desenvolvedor\n3 - Estagiário\nQual será o cargo do funcionário cadastrado:");
                    int cargo = teclado.nextInt();
                    teclado.nextLine();
                    cadastraFuncionario(cargo, teclado);
                    break;

                case 2:
                    System.out.println(
                            "1 - Gerente\n2 - Desenvolvedor\n3 - Estagiário\nQual será o cargo do funcionário desejado:");
                    int cargo1 = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Qual o nome do funcionário desejado:");
                    String nome = teclado.nextLine();
                    mostraFuncionario(cargo1, nome);
                    break;
                default:
                    break;
            }
        } while (escolha != 0);
    }

    public static void cadastraFuncionario(int cargo, Scanner teclado) {
        System.out.println("Insira o nome do funcionário:");
        String nome = teclado.nextLine();

        System.out.println("Insira o salário:");
        int salario = teclado.nextInt();
        teclado.nextLine(); // limpa o buffer

        System.out.println("Insira o departamento:");
        String departamento = teclado.nextLine();

        System.out.println("Insira o CPF:");
        String cpf = teclado.nextLine();

        System.out.println("Insira a data de nascimento:");
        String nascimento = teclado.nextLine();

        switch (cargo) {
            case 1:
                gerentes.add(new Gerente(nome, salario, departamento, cpf, nascimento));
                break;
            case 2:
                desenvolvedores.add(new Desenvolvedor(nome, salario, departamento, cpf, nascimento));
                break;
            case 3:
                estagiarios.add(new Estagiario(nome, salario, departamento, cpf, nascimento));
                break;
            default:
                System.out.println("Cargo inválido.");
                break;
        }
    }

    public static void mostraFuncionario(int cargo, String nome) {
        switch (cargo) {
            case 1:
                for (int i = 0; i < gerentes.size(); i++) {
                    Gerente gerenteAtual = gerentes.get(i);
                    if (gerenteAtual.GetNome().equals(nome)) {
                        gerenteAtual.MostrarDados();
                    }
                }
                break;
            case 2:
                for (int i = 0; i < estagiarios.size(); i++) {
                    Desenvolvedor desenvolvedorAtual = desenvolvedores.get(i);
                    if (desenvolvedorAtual.GetNome().equals(nome)) {
                        desenvolvedorAtual.MostrarDados();
                    }
                }
                break;
            case 3:
                for (int i = 0; i < estagiarios.size(); i++) {
                    Estagiario estagiarioAtual = estagiarios.get(i);
                    if (estagiarioAtual.GetNome().equals(nome)) {
                        estagiarioAtual.MostrarDados();
                    }
                }
                break;

            default:
                break;
        }
    }
}