package Pacote1;

import Pacote2.ClassePublic2;

public class ClassePublic1 {

	public void metodoPublic() {

	}

	protected void metodoProtected() {

	}

	void metodoDefault() {

	}

	private void metodoPrivate() {

	}

	public static void main(String[] args) {
		//ACESSO A TODOS OS SEUS METODOS
		ClassePublic1 cp1 = new ClassePublic1();
		cp1.metodoPublic();
		cp1.metodoProtected();
		cp1.metodoDefault();
		cp1.metodoPrivate();
		
		ClasseDefault1 cd1 = new ClasseDefault1();
		cd1.metodoPublic();
		cd1.metodoProtected();
		cd1.metodoDefault();
		//cd1.metodoPrivate(); NAO TEM ACESSO AO METODO PRIVATE, POIS PERTENCE A OUTRA CLASSE

		ClassePublic2 cp2 = new ClassePublic2();
		cp2.metodoPublic();
		//cp2.metodoProtected(); NAO TEM ACESSO AO METODO PROTECTED, POIS PERTENCE A OUTRO PACOTE 
		//cp2.metodoDefault(); NAO TEM ACESSO AO METODO DEFAULT, POIS PERTENCE A OUTRO PACOTE
		//cp2.metodoPrivate(); NAO TEM ACESSO AO METODO PRIVATE, POIS PERTENCE A OUTRA CLASSE

		//NAO É POSSIVEL ACESSAR A CLASSE DEFAULT E NEM SEUS METODOS, POIS PERTENCEM A OUTRO PACOTE
		//ClasseDefault2 cd2 = new ClasseDefault2();

	}
}
