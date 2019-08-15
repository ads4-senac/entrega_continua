package dev.alexferreira.projetobasico.data.source;

import dev.alexferreira.projetobasico.data.model.UserModel;

public interface IUserSource {

    UserModel getUser(String id);

    void saveUser(UserModel userModel);
}
