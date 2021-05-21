import org.junit.Test;

import java.util.List;

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
    public void ct02_cadastrar_livro_com_isbn_ja_cadastrado() {
        //dado que nao existem livros cadastrados
        Biblioteca biblioteca = new Biblioteca();
        //quando um livro é cadastrado
        Livro umLivro = new Livro();
        umLivro.setAutor("Pressman");
        umLivro.setIsbn("1111");
        umLivro.setTitulo("Engenharia de Software");
        biblioteca.save(umLivro);
        List<Livro> lista = biblioteca.getLivros();
        //entao
        Livro re = new Livro();
        re.setAutor("Pressman");
        re.setIsbn("1111");
        re.setTitulo("Engenharia de Software");
        assertEquals(false, biblioteca.save(re));
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

    @Test
    public void ct04_nao_cadastrar_livro_com_titulo_em_branco() {
        Biblioteca biblioteca = new Biblioteca();
        //livro sendo cadastrado com titulo em branco
        Livro livroNovo = new Livro();
        livroNovo.setAutor("TioBob");;
        livroNovo.setIsbn("0001");
        livroNovo.setTitulo("");
        biblioteca.save(livroNovo);
        //A quantidade de livros cadastrados deve ser igual a 0
        assertEquals(0, biblioteca.size());
    }

}
