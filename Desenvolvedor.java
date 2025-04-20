public class Desenvolvedor extends Funcionarios{
    
    public Desenvolvedor(String nome, int salario, String departamento, String cpf, String nascimento){
        SetNome(nome);
        SetSalario(salario);
        SetDepartamento(departamento);
        SetCPF(cpf);
        SetDataDeNascimento(nascimento);
    }

    public void programar(){
        System.out.println("O desenvolvedor está programando" );
    }

    public void MostrarDados(){
        System.out.println("Dados do desenvolvedor: \nNome: " + GetNome() + "\nSalário: "+ GetSalario() + "\nDepartamento: "+ GetDepartamento() + "\nCPF: " + GetCPF() + "\nData de nascimento: "+ GetDataDeNascimento());
    }
}