
package controller;

import model.Usuario;

public class Autenticacao {

    public boolean autenticar(String user, String senha) {

        if ("admin".equals(user) && "admin".equals(senha)) {

            return true;

        } else {

            return false;
        }
    }

}
