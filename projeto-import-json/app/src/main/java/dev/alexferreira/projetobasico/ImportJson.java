package dev.alexferreira.projetobasico;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class ImportJson implements IIMportJson {

    private DaoInterface dao;
    private Gson gson;

    public ImportJson(DaoInterface dao, Gson gson) {
        this.dao = dao;
        this.gson = gson;
    }

    /**
     *   Abrir o arquivo com o nome fileName
     *  Validar json
     *  Importar book
     *  Tentar salvar book com a interface dao
     * @param fileName
     */
    @Override
    public void importJsonFile(String fileName) {
        File file = new File(fileName);
		try {
			byte[] bytes = Files.readAllBytes(file.toPath());
			String fileText = new String(bytes);
			Book book = gson.fromJson(fileText, Book.class);
			dao.create(book);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    /**
     *
     * @param fileDir
     */
    @Override
    public void importJsonDir(String fileDir) {

    }

    @Override
    public void validateJsonFile(String fileName) {

    }

    @Override
    public void validateJsonDir(String fileDir) {

    }
}
