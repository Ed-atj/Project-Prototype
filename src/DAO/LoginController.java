package DAO;

// Import do Java Scanner
// Import da classe Usuário do package "entity".
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import entity.Usuario;


public class LoginController {
    
    // "Private" pois outras classes não podem ter acesso.
    // Criaçao do campo "usuarioDAO" que interage com objetos de "UsuarioDAO". 
    private UsuarioDAO usuarioDAO;

    // "Public" pois outras classes precisam ter acesso.
    // Construtor LoginController que recebe os parâmetros de UsuarioDAO e usuarioDAO.
    // "This" usado para selecionar o campo "usuarioDAO" e atribui-lo como variável.
    // Dessa forma é possível acessar objetos da classe UsuarioDAO via usuarioDAO.
    public LoginController(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

/*  "Public Void" para não retornar valores e poder ser acessado por qualquer parte
    do código que tenha acesso à "public class LoginController".                     */  
    public void login() {
        Scanner scanner = new Scanner(System.in);
        boolean autenticacao = false;
        int attempts = 0;
        // Loop com o 'while', enquanto "autenticacao" for falsa.
        // Loop usado para repetir, login e senha, enquanto houver erro.
        while (!autenticacao) {
            System.out.println("Login:");
            String login = scanner.nextLine();

            System.out.println("Senha:");
            String password = scanner.nextLine();

            Usuario user = usuarioDAO.getUserByLogin(login);

            // Se o usúario for diferente de nulo E a senha inserida for a correta, então:
            //  -Login aceito;
            //  -Loop termina;
            //  -Notifica o redirecionamento para a página principal.
            // Se não:
            //  -Mensagem de login ou senha inválidos;                             
            if (user!= null && user.getSenha().equals(password)) {
                autenticacao = true;
                System.out.println("Login Efetuado!");
                System.out.println("Redirecionando para página principal...");
            } else {
				attempts++; // Contar o número de vezes que a senha foi incorreta.
                System.out.println();
                System.out.println("Login ou senha inválido. Tente novamente.");
                System.out.println();
                if (attempts == 3) {
                    System.out.println("Limite de tentativas excedido.");
                    System.out.println("Deseja recuperar sua senha?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    int opcao = scanner.nextInt();

                    if (opcao == 1) {
                        autenticacao = true;
                        System.out.println("Aguarde...");
                        loginRecuperacao(); // Call the password recovery method
                    } else {
                        System.out.println();
                        System.out.println("Deseja sair ou continuar o login?");
                        System.out.println("1 - Continuar");
                        System.out.println("2 - Sair");
                        int opcao1 = scanner.nextInt();
                        
                        if (opcao1 == 1) {
                            System.out.println("Redirecionando para página de login...");
                            System.out.println();
                            try {
								TimeUnit.SECONDS.sleep(3);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
                        } else{
                            autenticacao = true;
                            System.out.println("Saindo...");
                        }
                    }
                }
            }
        }
    }

    private int opcao;
    public int getOp(){
        return opcao;
    }
    public void loginRecuperacao (){
    }


}