public class Adm extends Pessoa{

    String cargoBiblioteca;
    Boolean uniforme;
    Boolean cartãoCultural;

    public Adm (String cargoBiblioteca, Boolean uniforme, Boolean cartãoCultural, String nome, int idade, String sexo){
        super(nome, idade, sexo);
        this.cargoBiblioteca = cargoBiblioteca;
        this.uniforme = uniforme;
        this.cartãoCultural = cartãoCultural;
    }

    public Adm(){
        super();

    }
    public String getCargoBiblioteca() {
        return cargoBiblioteca;
    }

    public void setCargoBiblioteca(String cargoBiblioteca) {
        this.cargoBiblioteca = cargoBiblioteca;
    }

    public Boolean getUniforme() {
        return uniforme;
    }

    public void setUniforme(Boolean uniforme) {
        this.uniforme = uniforme;
    }

    public Boolean getCartãoCultural() {
        return cartãoCultural;
    }

    public void setCartãoCultural(Boolean cartãoCultural) {
        this.cartãoCultural = cartãoCultural;
    }

    public void relatorio (){

        super.relatorio();

        System.out.println("O seu cargo na biblioteca é "+cargoBiblioteca);
        System.out.println("Você usa uniforme: "+uniforme);
        System.out.println("Você possui o cartão cultural: "+cartãoCultural);
        System.out.println("\n");
    }
    

}