public class Sis_Biblioteca {
    
    public static void main (String[] args){
        
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Adm adm = new Adm();
        Cadastro cad = new Cadastro();
        Livro livros = new Livro();
        Infos infos = new Infos();

        cad.cadastrar(aluno);
        cad.cadastrar(professor);
        cad.cadastrar(adm);

        infos.mostrarDados(aluno);
        infos.mostrarDados(professor);
        infos.mostrarDados(adm);
        
        /*Professor, ao invés de criarmos vários objetos para diferentes livros,
        criamos uma lista de array na classe Livro que vai armazenando os títulos dos livros nessa array
        conforme o método cadastrar() é invocado. Quando o método alugar() é invocado, o código confere
        se o nome do livro que usuário deseja está na lista (ou seja, se ele foi cadastrado), e se tiver, 
        informa que ele foi alugado com sucesso, caso contrário, informa que o livro não existe.*/


        livros.cadastrar();
        livros.cadastrar(); 
        livros.cadastrar();

        livros.alugar();
        livros.alugar();


    }
}