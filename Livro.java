import java.util.Scanner;
import java.util.ArrayList;

public class Livro {
    

    ArrayList<String> lista = new ArrayList<String>();


    Scanner input_string = new Scanner(System.in);


    public void cadastrar(){
        System.out.println("Qual nome do livro que você quer cadastrar?");
        this.lista.add(input_string.nextLine());

        System.out.println("Livro cadastrado com sucesso!");
    }

    public void alugar(){
        System.out.println("Qual livro você quer alugar?");
        String livro = input_string.nextLine();
        if (this.lista.contains(livro)){
            System.out.println("Este livro existe! Alugado com sucesso!");
        } else {
            System.out.println("Não achamos este livro no cadastro, tente novamente.");
        }

    }

}