import java.util.Scanner;

public class Cadastro {

    Scanner input_string = new Scanner(System.in);
    Scanner input_bool = new Scanner(System.in);
    Scanner input_int = new Scanner(System.in);

    public void cadastrar(Aluno aluno){

        System.out.println("Vamos cadastrar um ALUNO!");

        System.out.println("Qual seu nome?");
        aluno.setNome(input_string.nextLine());
        System.out.println("Qual seu sexo?");
        aluno.setSexo(input_string.nextLine());
        System.out.println("Qual sua idade?");
        aluno.setIdade(input_int.nextInt());
        System.out.println("Qual seu R.A.?");
        aluno.setRa(input_string.nextLine());
        System.out.println("Qual seu curso?");
        aluno.setCurso(input_string.nextLine());
        System.out.println("Qual seu período?");
        aluno.setPeríodo(input_string.nextLine());

    }

    public void cadastrar(Professor professor){

        System.out.println("Vamos cadastrar um PROFESSOR!");

        System.out.println("Qual seu nome?");
        professor.setNome(input_string.nextLine());
        System.out.println("Qual seu sexo?");
        professor.setSexo(input_string.nextLine());
        System.out.println("Qual sua idade?");
        professor.setIdade(input_int.nextInt());
        System.out.println("Qual a sua especialidade/área?");
        professor.setEspecialidade(input_string.nextLine());
        System.out.println("Você possui doutorado? (True/False)");
        professor.setDoutorado(input_bool.nextBoolean());
        System.out.println("Quantas turmas você tem?");
        professor.setQtdTurmas(input_int.nextInt());

    }

    public void cadastrar (Adm adm){

        System.out.println("Vamos cadastrar um ADM!");

        System.out.println("Qual seu nome?");
        adm.setNome(input_string.nextLine());
        System.out.println("Qual seu sexo?");
        adm.setSexo(input_string.nextLine());
        System.out.println("Qual sua idade?");
        adm.setIdade(input_int.nextInt());
        System.out.println("Qual seu cargo na biblioteca?");
        adm.setCargoBiblioteca(input_string.nextLine());
        System.out.println("Você usa uniforme? (True/False)");
        adm.setUniforme(input_bool.nextBoolean());
        System.out.println("Você possui cartão cultural?");
        adm.setCartãoCultural(input_bool.nextBoolean());
    }

}