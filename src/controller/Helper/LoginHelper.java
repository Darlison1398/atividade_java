
package controller.Helper;

import model.usuario;
import view.Tela_GUI;

public class LoginHelper {
    private final Tela_GUI view;

    public LoginHelper(Tela_GUI view) {
        this.view = view;
    }

   
    
    
    public usuario obterModelo(){
                
        String nome = view.getUsuario().getText();
        String senha = view.getSenha().getText();
        
        usuario modelo = new usuario(0, nome, senha);
        
        return modelo;
    }
    
    public void setarModelo(usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getUsuario().setText(nome);
        view.getSenha().setText(senha);
    }
    
    public void limparTela(){
        view.getUsuario().setText("");
        view.getSenha().setText("");
    }
}
