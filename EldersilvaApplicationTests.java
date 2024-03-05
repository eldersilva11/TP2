package br.edu.infnet.eldersilva;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.eldersilva.model.domain.Telescopio;

@SpringBootTest
class EldersilvaApplicationTests {
	
	private Telescopio telescopio; 
	
	@BeforeEach
	void steUp() {
	telescopio = new Telescopio();
	telescopio.setAbertura(200);
	telescopio.setDistancialFocal(1000);
	telescopio.setIsrefletor(true);
	telescopio.setMagnitude(13.5);
	}
	
	
	@Test
	void aberturaZero() {
		telescopio.setAbertura(0);
		assertEquals(0.0,telescopio.relacaoFocal());
	}
	
	
	@Test
	void distancialFocalZero() {
		telescopio.setDistancialFocal(0);
		assertEquals(0.0,telescopio.relacaoFocal());
	}
	
	
	@Test
	void distancialFocalAberturaMaiorZero() {
		assertEquals(5,telescopio.relacaoFocal());
	}

}
