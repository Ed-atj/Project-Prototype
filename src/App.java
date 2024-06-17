import java.util.Scanner;

import DAO.*;

import entity.*;

public class App {
  public static void main(String[] args) {
      UsuarioDAO usuarioDAO = new UsuarioDAO();
      LoginController loginController = new LoginController(usuarioDAO);
      loginController.login();
  }
}
