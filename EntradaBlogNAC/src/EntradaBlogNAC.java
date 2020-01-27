
/**Clase para manejar las entradas de un blog.
 * @author Nieves
 * @version 2.4
 */

public class EntradaBlogNAC {
	//separador es el ccar�cter que separa ENTRADA DE del
	//nombre del autor
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	//Constructor de la clase. recibe el n�mero de entrada, el nombre del autor
	//de la entrada y el texto que contiene la entrada. Si el n�mero de entrada
	//es negativo, lanza una excepci�n.
	/**
	 * Constructor de la clase. 
	 * @param id recibe el n�mero de entrada.
	 * @param autor recibe el nombre del autor.
	 * @param texto recibe el texto que contiene la entrada.
	 * @throws IllegalArgumentException si el n�mero de entrada es negativo, lanza una excepci�n.
	 */
	public EntradaBlogNAC(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * M�todo que devuelve el n�mero de la entrada.
	 * @return Devuelve el n�mero de la entrada.
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * Metodo que devuelve el texto completo de la entrada.
	 * @return devuelve el texto completo de la entrada.
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * Metodo que devuelve el nombre del autor de la entrada en may�sculas.
	 * @return devuelve el nombre del autor de la entrada en may�sculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**
	 * M�todo que devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	 * @return devuelve el nombre del autor.
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * M�todo main que crea el constructor.
	 * @param args No tiene porqu� tener argumentos.
	 */
	public static void main(String[] args) {
                //Modificar.
		EntradaBlogNAC e1=new EntradaBlogNAC (3,"ana","�ltimas noticias, est� disponible BixBy 2.0");
		System.out.println(e1);
	}
}
