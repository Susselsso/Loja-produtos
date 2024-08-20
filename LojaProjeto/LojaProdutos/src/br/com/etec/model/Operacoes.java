package br.com.etec.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Operacoes {
	@FXML
	private TextField txfUsuario;
	
	@FXML
	private PasswordField psfUsuario;
	
	@FXML
	private Button btnAcessar;
	
	@FXML
	private void acessarConta(ActionEvent event) {
		
		String nomeUsuario;
		nomeUsuario = txfUsuario.getText();
		
		String senhaUsuario;
		senhaUsuario = psfUsuario.getText();
		
		if(nomeUsuario.isEmpty() || senhaUsuario.isEmpty()) {
			mostrarMensagem(Alert.AlertType.WARNING,"FALTANDO DADOS", "SEM USUÁRIO OU SENHA");
			} // if
		else {
			mostrarMensagem(Alert.AlertType.WARNING,"FALTANDO DADOS", "INFORMAR SENHA");
		}
		
	}  // acessar conta
	
	//-------------------------------------------------------------------------------------------
	
	private void mostrarMensagem(Alert.AlertType tipo, String titulo, String mensagem) {
		Alert alerta = new Alert(tipo);
		alerta.setTitle(titulo);
		alerta.setHeaderText(null);
		alerta.setContentText(mensagem);
		alerta.showAndWait();
}
}
