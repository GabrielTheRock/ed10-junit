import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<Livro>();

    public List<Livro> getLivros() {
        return livros;
    }
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    public boolean save(Livro livro) {
        if (livros.stream().anyMatch(c -> c.getIsbn().equals(livro.getIsbn()))) {
            return false;
        }
        livros.add(livro);
        return true;
    }
    public int size() {
        return livros.size();
    }
}