package dev.alexferreira.projetobasico.data.repository;

import dev.alexferreira.projetobasico.data.model.UserModel;
import dev.alexferreira.projetobasico.data.source.IUserSource;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.fail;

public class UserReposoritoryTest {

    @Mock
    private IUserSource userSource;
    @Mock
    private UserModel fakeUser;

    @InjectMocks
    private UserReposoritory userReposoritory;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getUser_recuperaUserWithoutError() throws RepositoryException {
        Mockito.when(userSource.getUser(Mockito.anyString())).thenReturn(fakeUser);

        UserModel fakeUserRetrieved = userReposoritory.getUser("fakeId");

        Assert.assertNotNull(fakeUserRetrieved);
    }

    @Test
    public void saveUser_withoutError() throws RepositoryException {
        Mockito.doNothing().when(userSource).saveUser(Mockito.any(UserModel.class));

        userReposoritory.saveUser(fakeUser);

        Mockito.verify(userSource, Mockito.only()).saveUser(fakeUser);
    }

    @Test
    public void saveUser_throwsErrorOfNet_repositoryWrapInException() {
        String errorMsg = "Erro de host não encontrado";
        Mockito.doThrow(new IllegalArgumentException(errorMsg)).when(userSource).saveUser(Mockito.any(UserModel.class));

        try {
            userReposoritory.saveUser(fakeUser);
        } catch (RepositoryException e) {
            if (e.getCause() instanceof IllegalArgumentException) {
                Assert.assertEquals(errorMsg, e.getCause().getMessage());
            } else {
                fail("Não lancou ex do tipo correto");
            }
        }
    }

    @Test
    public void saveUser_withNullUser_ThrowError() {
        String errorMsg = "Model passado é nulo";

        try {
            userReposoritory.saveUser(null);
            fail("Não lancou ex do tipo correto");
        } catch (RepositoryException e) {
            if (e.getCause() instanceof IllegalArgumentException) {
                Assert.assertEquals(errorMsg, e.getCause().getMessage());
            } else {
                fail("Não lancou ex do tipo correto");
            }
        }
    }

    @Test
    public void saveUser_throwsError_repositoryWrapInException() {
        String errorMsg = "Erro id invalido";
        Mockito.doThrow(new IllegalArgumentException(errorMsg)).when(userSource).getUser(Mockito.anyString());

        try {
            userReposoritory.saveUser(fakeUser);
        } catch (RepositoryException e) {
            if (e.getCause() instanceof IllegalArgumentException) {
                Assert.assertEquals(errorMsg, e.getCause().getMessage());
            } else {
                fail("Não lancou ex do tipo correto");
            }
        }
    }

    @Test
    public void getUser_throwsError_repositoryWrapInException() {
        String errorMsg = "Id passado é nulo";

        try {
            userReposoritory.getUser(null);
            fail("Não lancou ex do tipo correto");
        } catch (RepositoryException e) {
            if (e.getCause() instanceof IllegalArgumentException) {
                Assert.assertEquals(errorMsg, e.getCause().getMessage());
            } else {
                fail("Não lancou ex do tipo correto");
            }
        }
    }

}