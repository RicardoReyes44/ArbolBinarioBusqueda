
class ArbolBinarioBusqueda{
	
	private NodoArbol raiz;
	
	//1) Crear
	public ArbolBinarioBusqueda(){}
	
	public NodoArbol getRaiz() {return raiz;}
	
	public void insertar(int dato){
		raiz = insertar(dato, raiz);
	}
	
	//2) Agregar
	public NodoArbol insertar(int dato, NodoArbol padre) {
		if(padre==null)
			padre = new NodoArbol(dato);
		else if(padre.mayorQue(dato))
			padre.setNodoIzq(insertar(dato, padre.getNodoIzq()));
		else
			padre.setNodoDer(insertar(dato, padre.getNodoDer()));
		return padre;
	}
	
	//3) Eliminar (dato)
	public void eliminar(int dato) {
		raiz = eliminar(dato, raiz);
	}
	
	public NodoArbol eliminar(int dato, NodoArbol raiz) {
		if(raiz==null) {
			System.out.println("Elemento inexistente");
			return null;
		}else if(raiz.mayorQue(dato)){
			raiz.setNodoIzq(eliminar(dato, raiz.getNodoIzq()));
		}else if(raiz.menorQue(dato)){
			raiz.setNodoDer(eliminar(dato, raiz.getNodoDer()));
		}else {
			
			if(raiz.getNodoIzq()==null) {
				raiz = raiz.getNodoDer();
			}else if(raiz.getNodoDer()==null) {
				raiz = raiz.getNodoIzq();
			}
			else {
				eliminarConDobleNodo(dato, raiz);
			}
			System.out.println("Elemento eliminado");
		}

		return raiz;
	}
	
	public NodoArbol eliminarConDobleNodo(int dato, NodoArbol raiz) {
    	NodoArbol act, ant;
	    ant = raiz;
	   	act = raiz.getNodoIzq();
	    	
	   	while(act.getNodoDer() != null) {
	    	ant = act;
	   		act = act.getNodoDer();
	   	}
			
	    raiz.setDato(act.getDato());
	    	
	   	if(raiz == ant)
	   		ant.setNodoIzq(act.getNodoIzq());
	   	else
	   		ant.setNodoDer(act.getNodoIzq());
	   	return act;
	}
	
	//4) mostrar recorrido
		public void preorden(NodoArbol raiz) {
			if(raiz!=null) {
				System.out.println(raiz.getDato());
				preorden(raiz.getNodoIzq());
				preorden(raiz.getNodoDer());
			}
		}

		public void inorden(NodoArbol raiz) {
			if(raiz!=null) {
				inorden (raiz.getNodoIzq());
	            System.out.println(raiz.getDato());
	            inorden (raiz.getNodoDer());
			}
		}

		public void postorden(NodoArbol raiz) {
			if(raiz!=null) {
			    postorden(raiz.getNodoIzq());
			    postorden(raiz.getNodoDer());
			    System.out.println(raiz.getDato());
			}
		}

		public void buscar(int dato) {
			buscar(raiz, dato);
		}
		
		public void buscar(NodoArbol raiz, int dato) {
			if(raiz == null) {
				System.out.println("Elemento no encontrado");
			}else if(raiz.menorQue(dato)) {
				buscar(raiz.getNodoDer(), dato);
			}else if(raiz.mayorQue(dato)) {
				buscar(raiz.getNodoIzq(), dato);
			}else {
				System.out.println("encontrado");
			}
		}
}
