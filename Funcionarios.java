public class Funcionarios extends Pessoa{
    private String nome;
    private float salario;
    private String departamento;
    private int BateuPonto = 0;

    //SETTER
    public void SetNome (String nome){
        this.nome = nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();
    }

    public void SetSalario (float salario){
        this.salario = salario;
    }

    public void SetDepartamento (String departamento){
        this.departamento = departamento;
    }

    //GETTER
    public String GetNome (){
        return nome;
    }

    public float GetSalario(){
        return salario;
    }

    public String GetDepartamento(){
        return departamento;
    }

    //MÉTODOS
    public void MostrarDados(){
        System.out.println("Nome: " + GetNome() + "\nSalário: "+ GetSalario() + "\nDepartamento: "+ GetDepartamento() + "CPF: " + GetCPF() + "Data de nascimento: "+ GetDataDeNascimento());
    }

    public void BaterPonto(){
        if (BateuPonto % 2 == 0) {
            System.out.println("O funcionário entrou para trabalhar.");
        }
        BateuPonto = BateuPonto + 1;
    }
}