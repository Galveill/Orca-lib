package propiedades;

/**
 * Las propiedades de los peces.
 * 
 * @author Adrián Fdez. Glez.
 * @version 1.0.0
 *
 */
public enum PecesProps {

	OMNIVORO("Omnívoro"),
	FILTRADOR("Filtrador"),
	CARNIVORO("Carnívoro"),
	LONGEVO("Longevo"),
	VORAZ("Voraz"),
	ACTIVO("Activo"),
	COMEDIDO("Comedido");
	
	/** El texto a mostrar **/
	private String nombre;
	
	private PecesProps(String nombre)
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
