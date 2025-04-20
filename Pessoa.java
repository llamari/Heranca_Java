public class Pessoa {
    private String CPF;
    private String DataDeNascimento;

    //SETTER
    public void SetCPF (String CPF){
        this.CPF = CPF;
    }

    public void SetDataDeNascimento (String DataDeNascimento){
        this.DataDeNascimento = DataDeNascimento;
    }

    //GETTER
    public String GetDataDeNascimento (){
        return DataDeNascimento;
    }

    public String GetCPF(){
        return CPF;
    }
}