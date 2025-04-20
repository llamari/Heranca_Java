public class Gerente extends Funcionarios {
 
    public Gerente(String nome, int salario, String departamento, String cpf, String nascimento){
        SetNome(nome);
        SetSalario(salario);
        SetDepartamento(departamento);
        SetCPF(cpf);
        SetDataDeNascimento(nascimento);
    }

    public void realizarReuniao(){
        System.out.println("O gerente está realizando uma reuniãoS");
    }   

    public void MostrarDados(){
        System.out.println("Dados do gerente: \nNome: " + GetNome() + "\nSalário: "+ GetSalario() + "\nDepartamento: "+ GetDepartamento() + "\nCPF: " + GetCPF() + "\nData de nascimento: "+ GetDataDeNascimento());
    }
}