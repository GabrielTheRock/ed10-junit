import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testes {

    @Test
    public void ct01_quando_dados_validos_cadastra_com_sucesso() {
        //dado que nao existem livros cadastrados
        Biblioteca biblioteca = new Biblioteca();
        //quando um livro é cadastrado
        Livro umLivro = new Livro();
        umLivro.setAutor("Pressman");
        umLivro.setIsbn("1111");
        umLivro.setTitulo("Engenharia de Software");
        biblioteca.save(umLivro);
        //entao o total de livros cadastrados igual 1
        assertEquals (1, biblioteca.size());
    }
    
    @Test
    public void ct03_nao_cadastrar_livro_com_isbn_em_branco() {
        Biblioteca biblioteca = new Biblioteca();
        //livro sendo cadastrado com isbn em branco
        Livro livroNovo = new Livro();
        livroNovo.setAutor("TioBob");;
        livroNovo.setIsbn("");
        livroNovo.setTitulo("Clean Code");
        biblioteca.save(livroNovo);
        //A quantidade de livros cadastrados deve ser igual a 0
        assertEquals(0, biblioteca.size());
    }


}
