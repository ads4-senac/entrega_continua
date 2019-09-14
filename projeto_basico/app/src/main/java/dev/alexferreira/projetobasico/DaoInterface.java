package dev.alexferreira.projetobasico;

public interface DaoInterface {

    void create(Book book);

    Book recover(String id);

    void update(Book book);

    void delete(Book book);
}
