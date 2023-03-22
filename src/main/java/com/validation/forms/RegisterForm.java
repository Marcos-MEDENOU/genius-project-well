package com.validation.forms;

import javax.servlet.http.HttpServletRequest;

public class RegisterForm {
	
	private String resultat; 
//	private String password;
//	private String passwordConfirm; 
//	private String email; 
//	private String pseudo; 
//	private String nomComplet;
	
	
	/**
	 * @getter and settter respose
	 * */
	public String getResultat() {
		return resultat;
	}

//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getPasswordConfirm() {
//		return passwordConfirm;
//	}
//
//	public void setPasswordConfirm(String passwordConfirm) {
//		this.passwordConfirm = passwordConfirm;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPseudo() {
//		return pseudo;
//	}
//
//	public void setPseudo(String pseudo) {
//		this.pseudo = pseudo;
//	}
//
//	public String getNomComplet() {
//		return nomComplet;
//	}
//
//	public void setNomComplet(String nomComplet) {
//		this.nomComplet = nomComplet;
//	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	
	public boolean isEmpty(String password, String passwordConfirm, String email, String pseudo, String nomComplet) {
		if(password.isBlank() || passwordConfirm.isBlank() || email.isBlank() || pseudo.isBlank() || nomComplet.isBlank()) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean selectionEmptyCheck(String nomComplet) {
		if(nomComplet.isBlank()) {
			return true;
		}else {
			return false; 
		}
	}
	
	public boolean isNormalSize(String nomComplet, String pseudo, String password) {
		if(nomComplet.length()>3 && pseudo.length()>3 && password.length()>6) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean emailVerificated(String email) {
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        if( m.matches()) {
        	return true;
        }else {
        	return false;
        }
	}
	
	
	public boolean samePasswordCheck(String password, String passwordConfirm) {
		if(password.equals(passwordConfirm)) {
			return true;
		}else {
			return false;
		}
	}

	public void verificateIdentifiants(HttpServletRequest request) {
		
		String completName = request.getParameter("Nomcomplet");
		String pseudo = request.getParameter("Pseudo");
		String email = request.getParameter("Email");
		String password = request.getParameter("Password");
		String passwordConfirm = request.getParameter("ConfirmPassword");
		
		if(password.equals(passwordConfirm) 
				&& this.isEmpty(password, passwordConfirm, email, pseudo, completName)
					&& this.isNormalSize(completName, pseudo, passwordConfirm)
					&& this.emailVerificated(email)) {
			resultat="Authentification reussi";
		}else {
			resultat ="Authentification échoué";
		}
		
		
//		if(this.isEmpty(password, passwordConfirm, email, pseudo, completName)) {
//			resultat=" car un ou plusieurs chaine sont vides";
//		}
		
	}

	public RegisterForm() {
		
	}
}
