import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaArbolBinarioBusqueda{
	
	public static byte mostrar() {
		Scanner entrada = new Scanner(System.in);
		
		while(true) {
			System.out.println("-------------Sub menu------------");
	    	System.out.println("1.- Inorden");
	    	System.out.println("2.- Preorden");
	    	System.out.println("3.- Postorde");
			System.out.println("Introduce forma a mostrar datos: ");
			byte opcion = entrada.nextByte();
			
			if(opcion==1 || opcion==2 || opcion==3) {
				return opcion;
			}else {
				System.out.println("Opcion inexistente, por favor prueba de nuevo");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
		
		boolean candado = true;
		byte dato = 0;
		
	    while(candado) {
	    	
	    	System.out.println("-------------Menu------------");
	    	System.out.println("1.- Crear nuevo arbol");
	    	System.out.println("2.- Insertar nodo");
	    	System.out.println("3.- Eliminar nodo");
	    	System.out.println("4.- Mostrar nodos");
	    	System.out.println("5.- Mostrar dato mayor");
	    	System.out.println("6.- Mostrar dato menor");
	    	System.out.println("7.- Buscar dato");
	    	System.out.println("8.- Ver cantidad de nodos hoja");
	    	System.out.println("9.- Salir");
	    	System.out.println("Introduce opcion: ");
	    	
	    	try {
	    	byte opcion = entrada.nextByte();
	    	
	    	switch(opcion){
	    	case 1:
	    		abb = new ArbolBinarioBusqueda();
	    		break;
	    	
	    	case 2:
	    		System.out.println("Introduce un numero: ");
	    		dato = entrada.nextByte(); 
	    		
	    		abb.insertar(dato);
	    		break;
	    		
	    	case 3:
	    		System.out.println("Introduce un numero: ");
	    		dato = entrada.nextByte(); 
	    		
	    		abb.eliminar(dato);
	    		break;
	    	
	    	case 4:
	    		if(abb.getRaiz()==null) {
	    			System.out.println("No hay elementos");
	    		}else {
                    byte subOpcion = mostrar();
		    		
                    System.out.println("Elementos: ");
		    		if(subOpcion==1) {
		    			abb.inorden(abb.getRaiz());
		    		}else if(subOpcion==2) {
		    			abb.preorden(abb.getRaiz());
		    		}else {
		    			abb.postorden(abb.getRaiz());
		    		}
	    		}
	    		break;
	 
	    	case 5:
	    		abb.mayor();
	    		break;
	    	
	    	case 6:
	    		abb.menor();
	    		break;
	    		
	    	case 7:
	    		System.out.println("Introduce un numero: ");
	    		dato = entrada.nextByte(); 
	    		
	    		abb.buscar(dato);
	    		break;
	    	
	    	case 8:
	    		System.out.println(abb.contarHojas());
	    		break;
	    		
	    	case 9:
	    		candado = false;
	    		break;
	    		
	    	default:
	    		System.out.println("Opcion inexistente, por favor prueba de nuevo");
	    		break;
	    	}
	    	}catch(InputMismatchException error) {
	    		System.out.println("Error <" + error + "> por favor prueba de nuevo");
	    	    entrada.nextLine();
	    	}
	    	System.out.println();
	    	System.out.println("-------------------------------------");
	    }
	    System.out.println("... vuelva pronto");

	}
	
}
