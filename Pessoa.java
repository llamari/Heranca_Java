public class Pessoa {
    private int CPF;
    private String DataDeNascimento;

    //SETTER
    public void SetCPF (int CPF){
        this.CPF = CPF;
    }

    public void SetDataDeNascimento (String DataDeNascimento){
        this.DataDeNascimento = DataDeNascimento;
    }

    //GETTER
    public String GetDataDeNascimento (){
        return DataDeNascimento;
    }

    public int GetCPF(){
        return CPF;
    }
}