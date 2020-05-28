public class Professor extends Pessoa {
    
    String especialidade;
    Boolean doutorado;
    int qtdTurmas;

    public Professor(String especialidade, Boolean doutorado, int qtdTurmas, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.doutorado = doutorado;
        this.qtdTurmas = qtdTurmas;
    }

    public Professor (){
        super();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Boolean getDoutorado() {
        return doutorado;
    }

    public void setDoutorado(Boolean doutorado) {
        this.doutorado = doutorado;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

    public void relatorio (){

        super.relatorio();

        System.out.println("A sua especialidade é "+especialidade);
        System.out.println("Você possui doutorado: "+doutorado);
        System.out.println("A sua quantidade de turmas "+qtdTurmas);
        System.out.println("\n");
        
    }




    

}