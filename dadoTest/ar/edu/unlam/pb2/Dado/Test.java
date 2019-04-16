package ar.edu.unlam.pb2.Dado;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void testCrearUnDado() {
		Dado miDado = new Dado(6);
		assertNotNull(miDado);
	}
	
	@org.junit.Test
	public void testLanzarDado() {
		Dado miDado = new Dado(6);
		assertNotNull(miDado.lanzar());
	}
    
	@org.junit.Test
	public void testLanzarValorFueraDeRango() {
		Dado miDado = new Dado(6);
		Integer valorEsperado = 7;
		Integer valorObtenido = miDado.lanzar();
		assertNotEquals(valorEsperado, valorObtenido);
		
	}
	
    @org.junit.Test
    public void testLanzarDadoEntre1y6Caras() {
    	Dado miDado = new Dado(6);
    	Integer min=1;
    	Integer max=6;
    	Integer miCaraDado= miDado.lanzar();
    	
    	assertTrue( miCaraDado>=min && miCaraDado<=max);
    }
	//assertThat NO ME FUNCIONA 

}
