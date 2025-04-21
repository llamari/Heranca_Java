import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Funcionarios extends Pessoa{
    //declaração de variáveis
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
        System.out.println("Nome: " + GetNome() + "\nSalário: "+ GetSalario() + "\nDepartamento: "+ GetDepartamento() + "\nCPF: " + GetCPF() + "\nData de nascimento: "+ GetDataDeNascimento());
    }

    public void BaterPonto(){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String horaFormatada = agora.format(formatter);

        if (BateuPonto % 2 == 0) {
            System.out.println("\u001B[33m"+"O funcionário entrou para trabalhar em: "+horaFormatada+"\u001B[0m");
        } else {
            System.out.println("\u001B[33m"+"O funcionário saiu do trabalho em: "+ horaFormatada+"\u001B[0m");
        }
        BateuPonto = BateuPonto + 1;
    }
}