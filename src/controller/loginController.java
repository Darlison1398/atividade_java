
//  Todo controller, ocntrola uma view no sistema;
package controller;

import controller.Helper.LoginHelper;
import model.usuario;
import view.Tela_GUI;

public class loginController {

    private final Tela_GUI view;
    
    private LoginHelper helper;

    public loginController(Tela_GUI view) {
        this.view = view;
        
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        // o sistema deve pegar o usuário da view;
        // e depois, deve pegar a senha;
        /* caso o usuário da view tiver o mesmo usuário e senha do banco,
        ele vai ser redirecinado para a próxima página/menu principal. Se não,
        deve ser mostrado uma mensagem ao usuário que seus dados estão incorretos.
        */
        
        usuario usuario1 = helper.obterModelo();
        
        
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
}
