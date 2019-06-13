package br.gov.workmade;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import br.gov.workmade.repository.ConnectionEntityManager;
@Singleton
@Startup
public class InitData {

	@Inject
	private ConnectionEntityManager connectionEntityManager;
	
	@PostConstruct
	void teste() {
		System.out.println("=========");
		System.out.println("=========");
		System.out.println("=========");
	List<br.gov.workmade.model.Departamento> departamentos = connectionEntityManager.departamentos().stream()
			.map(m -> new br.gov.workmade.model.Departamento(
					((BigInteger)m[0]).longValue()
							, (String)m[1])).collect(Collectors.toList());
			System.out.println("Saida: "+departamentos.toString());
	}
	
}
