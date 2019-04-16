package ar.edu.unlam.pb2.Dado;

public class Dado {
   
	private  Integer valor;

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	public Dado(Integer valor ) {
		this.valor = valor;
		
	}
	
	public Integer lanzar() {
		return (int) (Math.random()*6)+1; 
 	}
}


// math.random lanza un nnumero random
//*6 es hasta el numero que quiero que llege, porque mi dado tiene
//6 caras y +1 para que nunca me tire un 0