package br.gov.workmade.repository;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.Test;

public class ConnectionEntityManagerTest {
	@Inject
	private ConnectionEntityManager c;
	@Test
	public void departamentos() {
		assertEquals(2, c.departamentos().size());
	}

}
