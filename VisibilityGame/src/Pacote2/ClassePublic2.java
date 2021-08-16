package Pacote2;

import Pacote1.ClassePublic1;

public class ClassePublic2 {
	public void metodoPublic() {

	}

	protected void metodoProtected() {

	}

	void metodoDefault() {

	}

	private void metodoPrivate() {

	}

	public static void main(String[] args) {
		// ACESSO A TODOS OS SEUS METODOS
		ClassePublic2 cp2 = new ClassePublic2();
		cp2.metodoPublic();
		cp2.metodoProtected(); 
		cp2.metodoDefault(); 
		cp2.metodoPrivate(); 
		
		ClasseDefault2 cd2 = new ClasseDefault2();
		cd2.metodoPublic();
		cd2.metodoProtected();
		cd2.metodoDefault();
		//cd2.metodoPrivate(); NAO TEM ACESSO AO METODO PRIVATE, POIS PERTENCE A OUTRA CLASSE

		ClassePublic1 cp1 = new ClassePublic1();
		cp1.metodoPublic();
		//cp1.metodoProtected(); NAO TEM ACESSO AO METODO PROTECTED, POIS PERTENCE A OUTRO PACOTE
		//cp1.metodoDefault(); NAO TEM ACESSO AO METODO DEFAULT, POIS PERTENCE A OUTRO PACOTE
		//cp1.metodoPrivate(); NAO TEM ACESSO AO METODO PRIVATE, POIS PERTENCE A OUTRA CLASSE

		// NAO É POSSIVEL ACESSAR A CLASSE DEFAULT E NEM SEUS METODOS, POIS PERTENCEM A OUTRO PACOTE
		// ClasseDefault1 cd1 = new ClasseDefault1();

	}
}
