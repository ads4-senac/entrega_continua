package dev.alexferreira;

import com.google.gson.Gson;
import dev.alexferreira.projetobasico.Book;
import dev.alexferreira.projetobasico.DaoInterface;
import dev.alexferreira.projetobasico.ImportJson;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

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
		// TODO: 14/09/19 Criar uma pasta no res

		// TODO: 14/09/19 Criar Uri de pasta, similar do test test_importaArquivo_comNomeDeArquivoValido()

		// TODO: 14/09/19 Criar arquivo com URI

		// TODO: 14/09/19 Substituir "dir" com file.getAbsolutePath()
    	 importJson.importJsonDir("dir");

    	 Mockito.verify(dao).create(Mockito.any(Book.class));
    }

    @Test
    public void validaArquivo_retornaTrue_arquivoValido() {
		// TODO: 14/09/19 Criar Uri de arquivo, similar do test test_importaArquivo_comNomeDeArquivoValido()

		// TODO: 14/09/19 Criar arquivo com URI

		// TODO: 14/09/19 Substituir null com file.getAbsolutePath()
		Assert.assertTrue(importJson.validateJsonFile(null));
    }

    @Test
    public void validaArquivo_retornaFalse_arquivoInvalido() {
		// TODO: 14/09/19 Criar Uri de arquivo, similar do test test_importaArquivo_comNomeDeArquivoValido()

		// TODO: 14/09/19 Criar arquivo com URI

		// TODO: 14/09/19 Substituir null com file.getAbsolutePath()
		Assert.assertFalse(importJson.validateJsonFile(null));
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
