import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Estagiario> estagiarios = new ArrayList<>();
    static ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<>();
    static ArrayList<Gerente> gerentes = new ArrayList<>();

    public static void main(String[] args) {
        // declaração de variáveis
        int escolha = 1;
        int cargo;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println(
                    "1 - Cadastrar um novo funcionário\n2 - Exibição de dados de um funcionários em específico\n3 - Exibição de dados de funcionários de determinado cargo\n4 - Bater ponto\n5 - Fazer função do cargo\n0 - Sair\nInsira a opção desejada: ");
            escolha = teclado.nextInt();
            teclado.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println(
                            "\u001B[36m"+"1 - Gerente\n2 - Desenvolvedor\n3 - Estagiário\n"+"\u001B[0m"+"Qual será o cargo do funcionário cadastrado:");
                    cargo = teclado.nextInt();
                    teclado.nextLine();
                    cadastraFuncionario(cargo, teclado);
                    break;

                case 2:
                    System.out.println(
                            "\u001B[36m"+"1 - Gerente\n2 - Desenvolvedor\n3 - Estagiário\n"+"\u001B[0m"+"Qual será o cargo do funcionário desejado:");
                    cargo = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Qual o nome do funcionário desejado:");
                    String nome = teclado.nextLine();
                    mostraFuncionario(cargo, nome);
                    break;

                case 3:
                System.out.println(
                    "\u001B[36m"+"1 - Gerente\n2 - Desenvolvedor\n3 - Estagiário\n"+ "\u001B[0m" + "Qual será o cargo desejado:");
                    cargo = teclado.nextInt();
                    teclado.nextLine();
                    mostraFuncionarios(cargo, teclado);
                    break;

                case 4:
                    System.out.println(
                        "\u001B[36m"+"1 - Gerente\n2 - Desenvolvedor\n3 - Estagiário\n"+"\u001B[0m"+"Qual é o cargo do funcionário:");
                    cargo = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Qual é o nome do funcionário:");
                    String nome1 = teclado.nextLine();
                    baterPonto(cargo, nome1);
                    break;

                case 5:
                    System.out.println(
                        "\u001B[36m"+"1 - Gerente\n2 - Desenvolvedor\n3 - Estagiário\n"+"\u001B[0m"+"Qual é o cargo do funcionário que irá fazer a função:");
                    cargo = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Qual é o nome do funcionário:");
                    String nome2 = teclado.nextLine();
                    funcaoEspecifica(cargo, nome2);
                    break;
            
                case 0:
                    System.out.println("\u001B[31m"+ "Saindo..."+ "\u001B[0m");
                    break;

                default:
                    System.out.println("\u001B[31m"+"A opção inserida não está entre as alternativas."+"\u001B[0m");
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
                for (int i = 0; i < desenvolvedores.size(); i++) {
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
                System.out.println("Cargo inválido.");
                break;
        }
    }

    public static void mostraFuncionarios(int cargo, Scanner teclado){
        switch (cargo) {
            case 1:
                for (int i = 0; i < gerentes.size(); i++) {
                    Gerente gerenteAtual = gerentes.get(i);
                    System.out.println("\u001B[33m"+(i+1) + "º gerente :"+"\u001B[0m");
                    gerenteAtual.MostrarDados();
                }
                break;
            case 2:
                for (int i = 0; i < desenvolvedores.size(); i++) {
                    Desenvolvedor desenvolvedorAtual = desenvolvedores.get(i);
                    System.out.println("\u001B[33m"+(i+1) + "º desenvolvedor :"+"\u001B[0m");
                    desenvolvedorAtual.MostrarDados();
                }
                break;
        
            case 3:
                for (int i = 0; i < estagiarios.size(); i++) {
                    Estagiario estagiarioAtual = estagiarios.get(i);
                    System.out.println("\u001B[33m"+(i+1) + "º estagiário :"+"\u001B[0m");
                    estagiarioAtual.MostrarDados();
                }
                break;
        
            default:
                System.out.println("Cargo inválido.");
                break;
        }
    }

    public static void baterPonto(int cargo, String nome){
        switch (cargo) {
            case 1:
                for (int i = 0; i < gerentes.size(); i++) {
                    Gerente gerenteAtual = gerentes.get(i);
                    if (gerenteAtual.GetNome().equals(nome)) {
                        gerenteAtual.BaterPonto();
                    }
                }
                break;
            case 2:
                for (int i = 0; i < desenvolvedores.size(); i++) {
                    Desenvolvedor desenvolvedorAtual = desenvolvedores.get(i);
                    if (desenvolvedorAtual.GetNome().equals(nome)) {
                        desenvolvedorAtual.BaterPonto();
                    }
                }
                break;
            case 3:
                for (int i = 0; i < estagiarios.size(); i++) {
                    Estagiario estagiarioAtual = estagiarios.get(i);
                    if (estagiarioAtual.GetNome().equals(nome)) {
                        estagiarioAtual.BaterPonto();
                    }
                }
                break;

            default:
                System.out.println("Cargo inválido.");
                break;
        }
    }

    public static void funcaoEspecifica(int cargo, String nome){
        switch (cargo) {
            case 1:
                for (int i = 0; i < gerentes.size(); i++) {
                    Gerente gerenteAtual = gerentes.get(i);
                    if (gerenteAtual.GetNome().equals(nome)) {
                        gerenteAtual.realizarReuniao();
                    }
                }
                break;
            case 2:
                for (int i = 0; i < desenvolvedores.size(); i++) {
                    Desenvolvedor desenvolvedorAtual = desenvolvedores.get(i);
                    if (desenvolvedorAtual.GetNome().equals(nome)) {
                        desenvolvedorAtual.programar();
                    }
                }
                break;
            case 3:
                for (int i = 0; i < estagiarios.size(); i++) {
                    Estagiario estagiarioAtual = estagiarios.get(i);
                    if (estagiarioAtual.GetNome().equals(nome)) {
                        estagiarioAtual.fazerTarefa();
                    }
                }
                break;

            default:
                System.out.println("Cargo inválido.");
                break;
        }
    }
}