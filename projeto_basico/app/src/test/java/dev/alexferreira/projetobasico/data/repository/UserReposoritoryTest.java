package dev.alexferreira.projetobasico.data.repository;

import android.accounts.NetworkErrorException;
import dev.alexferreira.projetobasico.data.model.UserModel;
import dev.alexferreira.projetobasico.data.source.IUserSource;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class UserReposoritoryTest {

    @Mock private IUserSource userSource;
    @Mock private UserModel fakeUser;

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
        Mockito.doThrow(new NetworkErrorException(errorMsg)).when(userSource).saveUser(Mockito.any(UserModel.class));

        try {
            userReposoritory.saveUser(fakeUser);
        } catch (RepositoryException e) {
            if (e.getCause() instanceof NetworkErrorException) {
                Assert.assertEquals(errorMsg, e.getCause().getMessage());
            }
        }
    }
}