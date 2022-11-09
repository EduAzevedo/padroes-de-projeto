public class Livro implements Cloneable {
    private String titulo;
    private String autor;
    private String categoria;
    private String dedicatoria;
    private String isbn;

    public Livro(String titulo, String autor, String categoria, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.isbn = isbn;
    }

    public void setDedicatoria(String dedicatoria) {
        this.dedicatoria = dedicatoria;
    }

    @Override
    protected Livro clone() throws CloneNotSupportedException {
        return (Livro) super.clone();
    }

    @Override
    public String toString() {
        return titulo + " | " + categoria
                + "\nMuito obrigado pela aquisição deste livro, " + dedicatoria + ". Desejo tudo de bom em sua vida!"
                + "\nass: " + autor + "\nISBN: " + isbn;
    }
}
