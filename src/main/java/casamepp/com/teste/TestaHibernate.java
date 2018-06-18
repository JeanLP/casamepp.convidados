package casamepp.com.teste;

import casamepp.com.DAO.PessoaDAO;
import casamepp.com.bean.Pessoa;

public class TestaHibernate {
	
	public static void main(String... args){
		PessoaDAO pdao = new PessoaDAO();
		Pessoa p = new Pessoa();
		p.setNome("Joao");
		p.setId(3);
		pdao.merge(p);
	}
		
}
