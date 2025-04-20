public class Estagiario extends Funcionarios {
    
    public Estagiario(String nome, int salario, String departamento, String cpf, String nascimento){
        SetNome(nome);
        SetSalario(salario);
        SetDepartamento(departamento);
        SetCPF(cpf);
        SetDataDeNascimento(nascimento);
    }

    public void fazerTarefa(){
        System.out.println("O "+ GetNome()+" está fazendo a tarefa.");
    }

    public void MostrarDados(){
        System.out.println("Dados do estagiário: \nNome: " + GetNome() + "\nSalário: "+ GetSalario() + "\nDepartamento: "+ GetDepartamento() + "\nCPF: " + GetCPF() + "\nData de nascimento: "+ GetDataDeNascimento());
    }
}