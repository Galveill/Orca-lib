package propiedades;

/**
 * El tipo de piscifactoría en la que puede criar el pez.
 * 
 * @author Adrián Fdez. Glez.
 * @version 1.0.0
 *
 */
public enum CriaTipo {

    RIO("Río", 0),
	MAR("Mar", 1),
	DOBLE("Río y mar", 2);
	
	/** El texto a mostrar **/
	private String nombre;
	/** El valor numérico */
	private int val;
	
	private CriaTipo(String nombre, int value)
	{
		this.nombre = nombre;
		this.val = value;
	}
	
	/**
	 * @return El valor textual
	 */
	public String getName() {
		return this.nombre;
	}

	/**
	 * @return El valor numérico
	 */
	public int getValue() {
		return this.val;
	}
}
