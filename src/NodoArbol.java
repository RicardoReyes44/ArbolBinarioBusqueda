
class NodoArbol{

	private NodoArbol nodoIzq;
	private int dato;
	private NodoArbol nodoDer;
	
	public NodoArbol(int dato) {
		this.dato = dato;
	}
	
	public NodoArbol getNodoIzq() {
		return nodoIzq;
	}

	public void setNodoIzq(NodoArbol nodoIzq) {
		this.nodoIzq = nodoIzq;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public NodoArbol getNodoDer() {
		return nodoDer;
	}

	public void setNodoDer(NodoArbol nodoDer) {
		this.nodoDer = nodoDer;
	}

	@Override
	public String toString() {
		return "NodoArbol [dato=" + dato + "]";
	}
	
	public boolean igualQue(int dato) {
		return this.dato==dato;
	}

	public boolean menorQue(int dato) {
		return this.dato<dato;
	}
	
	public boolean menorIgualQue(int dato) {
		return this.dato<=dato;
	}

	public boolean mayorQue(int dato) {
		return this.dato>dato;
	}

	public boolean mayorIgualQue(int dato) {
		return this.dato>=dato;
	}

}
