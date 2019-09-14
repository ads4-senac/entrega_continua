package dev.alexferreira.projetobasico.data.repository;

import dev.alexferreira.projetobasico.data.model.UserModel;

public interface IUserRepository {

    UserModel getUser(String id) throws RepositoryException;

    void saveUser(UserModel userModel) throws RepositoryException;

}
