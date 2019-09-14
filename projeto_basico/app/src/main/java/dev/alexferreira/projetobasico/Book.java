package dev.alexferreira.projetobasico;

public class Book {

    private String nome;
    private String codigoBarra;
    private String categoria;
    private String autor;
    private String isbn;

	public Book(String nome, String codigoBarra, String categoria, String autor, String isbn) {
		this.nome = nome;
		this.codigoBarra = codigoBarra;
		this.categoria = categoria;
		this.autor = autor;
		this.isbn = isbn;
	}

	public Book() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (nome != null ? !nome.equals(book.nome) : book.nome != null) return false;
        if (codigoBarra != null ? !codigoBarra.equals(book.codigoBarra) : book.codigoBarra != null)
            return false;
        if (categoria != null ? !categoria.equals(book.categoria) : book.categoria != null)
            return false;
        if (autor != null ? !autor.equals(book.autor) : book.autor != null) return false;
        return isbn != null ? isbn.equals(book.isbn) : book.isbn == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (codigoBarra != null ? codigoBarra.hashCode() : 0);
        result = 31 * result + (categoria != null ? categoria.hashCode() : 0);
        result = 31 * result + (autor != null ? autor.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nome='" + nome + '\'' +
                ", codigoBarra='" + codigoBarra + '\'' +
                ", categoria='" + categoria + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
