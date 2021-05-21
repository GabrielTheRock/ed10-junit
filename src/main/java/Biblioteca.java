import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void save(Livro livro) {
        if (!livros.stream().anyMatch(c -> c.getIsbn().equals(livro.getIsbn())) &&
                !livro.getIsbn().equals("") && !livro.getAutor().equals("") && !livro.getTitulo().equals("")) {
            livros.add(livro);
        }
    }

    public int size() {
        if (!livros.isEmpty()) {
            return livros.size();
        }
        return 0;
    }
}