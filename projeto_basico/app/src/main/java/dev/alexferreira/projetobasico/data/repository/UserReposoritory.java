package dev.alexferreira.projetobasico.data.repository;

import dev.alexferreira.projetobasico.data.model.UserModel;
import dev.alexferreira.projetobasico.data.source.IUserSource;

public class UserReposoritory implements IUserRepository {

    private IUserSource userSource;

    public UserReposoritory(IUserSource userSource) {
        this.userSource = userSource;
    }

    @Override
    public UserModel getUser(String id) throws RepositoryException {
        UserModel user;
        user = userSource.getUser(id);

        return user;
    }

    @Override
    public void saveUser(UserModel userModel) throws RepositoryException {
        try {
            userSource.saveUser(userModel);
        } catch (Exception e) {
            throw new RepositoryException(e);
        }
    }
}
