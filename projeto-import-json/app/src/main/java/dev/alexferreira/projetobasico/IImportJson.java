package dev.alexferreira.projetobasico;

import dev.alexferreira.exception.ImportJsonException;

import java.io.IOException;

public interface IImportJson {
    void importJsonFile(String fileName) throws ImportJsonException;
    void importJsonDir(String fileDir) throws ImportJsonException;
    boolean validateJsonFile(String fileName) throws IOException;
    boolean validateJsonDir(String fileDir);
}
