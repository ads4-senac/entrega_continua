package dev.alexferreira.projetobasico;

public interface IIMportJson {
    void importJsonFile(String fileName);
    void importJsonDir(String fileDir);
    void validateJsonFile(String fileName);
    void validateJsonDir(String fileDir);
}
