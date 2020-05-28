public class Aluno extends Pessoa {
    
    String ra;
    String curso;
    String período;

    public Aluno (String ra, String curso, String período, String nome, int idade, String sexo){
        super(nome, idade, sexo);
        this.ra = ra;
        this.curso = curso;
        this.período  = período;
        
    }

    public Aluno (){
        super();
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeríodo() {
        return período;
    }

    public void setPeríodo(String período) {
        this.período = período;
    }

    public void relatorio(){

        super.relatorio();

        System.out.println("O seu R.A. é "+ra);
        System.out.println("O seu curso é "+curso);
        System.out.println("O seu período é "+período);
        System.out.println("\n");

        
    }

    
}