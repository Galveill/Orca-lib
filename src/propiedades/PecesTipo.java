package propiedades;

/**
 * Los distintos tipos de peces.
 * 
 * @author Adrián Fdez. Glez.
 * @version 1.0.0
 *
 */
public enum PecesTipo {
	BASE("Base"),
	NORMAL("Normal"),
	INVERSION("Inversión"),
	RIESGO("Riesgo");
	
	/** El texto a mostrar **/
	private String nombre;
	
	private PecesTipo(String nombre)
	{
		this.nombre = nombre;
	}
	
	/**
	 * @return El valor textual
	 */
	public String getValue() {
		return this.nombre;
	}
}
