public class Celula {
	public Celula proxima;
	public Object elemento;
	
	public Celula(Celula proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = (Celula) elemento;
	}
	public Celula(Object elemento) {
		this.elemento = (Celula) elemento;
	}
	public Celula() {
		
	}
	public Celula getProxima() {
		return proxima;
	}
	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}
	public Object getElemento() {
		return elemento;
	}
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	
	
}