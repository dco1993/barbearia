package barbearia.test;

import barbearia.entity.Administrador;
import barbearia.service.AdministradorService;

public class PopulaConta {

	public static void main(String[] args) {

		AdministradorService as = new AdministradorService();
		Administrador admin1 = new Administrador();
//		Administrador admin2 = new Administrador();
//		Administrador admin3 = new Administrador();

//		admin.setId(1);
		admin1.setLogin("luispaulojr");
		admin1.setSenha("123");
		as.save(admin1);
		
//		admin2.setLogin("lpjr");
//		admin2.setSenha("123");

//		admin3.setLogin("lpjunior");
//		admin3.setSenha("123");

//		admin = as.busca(Administrador.class, admin.getId());
//		as.save(admin1);
//		as.save(admin2);
//		as.save(admin3);
//		System.out.println(admin.getLogin());
//		as.buscaLogin("l").forEach(System.out::println);
	}
}
