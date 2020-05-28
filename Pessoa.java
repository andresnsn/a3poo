public class Pessoa {
    
    String nome;
    int idade;
    String sexo;


    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Pessoa () {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void relatorio(){
        System.out.println("O seu nome é "+nome);
        System.out.println("A sua idade é "+idade);
        System.out.println("O seu sexo é "+sexo);
    }



}

