package dev.alexferreira.projetobasico.data.source;

import dev.alexferreira.projetobasico.data.model.UserModel;

public class UserSource implements IUserSource {

    @Override
    public UserModel getUser(String id) {
        // Poderia ser feito uma chamada para internet, e se tivesse sem internet, geraria uma exception em
        // tempo de execução, que deve ser tratada no repositorio
        return null;
    }

    @Override
    public void saveUser(UserModel userModel) {
        // Poderia ser feito uma chamada para internet, e se tivesse sem internet, geraria uma exception em
        // tempo de execução, que deve ser tratada no repositorio

        // Poderia ser feito uma chamada para um banco de dados e algum param unico retornar que já existe no banco uma coluna com aquele valor
    }
}
