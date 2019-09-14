package dev.alexferreira;

import com.google.gson.Gson;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

import dev.alexferreira.projetobasico.Book;
import dev.alexferreira.projetobasico.DaoInterface;
import dev.alexferreira.projetobasico.ImportJson;

public class ImportJsonTest {

    private ImportJson importJson;
    @Mock
    private DaoInterface dao;

    private Gson gson;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        gson = new Gson();
        importJson = new ImportJson(dao, gson);
    }

    @Test
    public void test_importaArquivo_comNomeDeArquivoValido() throws URISyntaxException {
        /**
         *   Abrir o arquivo com o nome fileName
         *  Validar json
         *  Importar book
         *  Tentar salvar book com a interface dao
         * **/
		URI jsonUri = getClass().getResource("/import_json_valid.json").toURI();
		File file = new File(jsonUri);
		importJson.importJsonFile(file.getAbsolutePath());

        Book book = new Book();
        book.setNome("Alex");
        book.setAutor("Rabelo Ferreira");
        Mockito.verify(dao).create(book);
    }

    @Test
    public void importaArquivosDaPasta_comNomeDeArquivoValido() {

    }

    @Test
    public void validaArquivo_retornaTrue_arquivoValido() {

    }

    @Test
    public void validaArquivo_retornaFalse_arquivoInvalido() {

    }

    @Test
    public void importaArquivo_geraExcecao_quandoNomeDeArquivoInvalido() {

    }

    @Test
    public void importaArquivo_geraExcecao_quandoJsonVazio() {

    }

    @Test
    public void importaArquivo_geraExcecao_quandoPastaVazia() {

    }

    @Test
    public void importaArquivo_geraExcecao_quandoConversaoDeJsonParaObjGerarErro() {

    }
}
