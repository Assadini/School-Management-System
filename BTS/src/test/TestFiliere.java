package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Domaine.classe.Filiere;

public class TestFiliere {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//System.out.println("Debut de la calsse de test");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//System.out.println("Fin de la calsse de test");
	}

	@Before
	public void setUp() throws Exception {
		//System.out.println("Debut de chaque test");
	}

	@After
	public void tearDown() throws Exception {
		//System.out.println("Fin de chaque test");
	}

	@Test
	public void testGetCode() {
		//System.out.println("test de getCode");
		Filiere f = new Filiere();
		f.setCode("DSI");
		assertEquals("DSI",f.getCode());
	}
	@Test
	public void testGetNom() {
		//System.out.println("test de getNom");
		Filiere f = new Filiere();
		f.setNom_Fr("DSI");
		assertEquals("DSI",f.getNom_Fr());
	}

}
