package propiedades;


/**
 * Los datos de cada pez.
 * @author Adrián Fdez. Glez.
 * @version 1.0.0
 *
 */
public class PecesDatos {
	/** El nombre común del pez. **/
	private final String nombre;
	/** El nombre científico del pez. **/
	private final String cientifico;
	/** El tipo de pez. **/
	private final PecesTipo tipo;
	
	/** El precio de compra del pez. **/
	private final int coste;
	/** La cantidad de monedas que da al venderlo. **/
	private final int monedas;
	
	/** La cantidad de huevos que pone. **/
	private final int huevos;
	
	/** El número de días tras los que se vuelve a reproducir. **/
	private final int ciclo;
	/** El número de días que tarda en llegar a la edad adulta. **/
	private final int madurez;
	/** El número de días tras los cuales se vende. **/
	private final int optimo;

	/** El tipo de piscifactoría en la que puede criarse. */
	private final CriaTipo piscifactoria;
	
	/** Las propiedades de los peces **/
	private final PecesProps[] propiedades;
	
	
	/**
	 * Constructor básico para las plantas.
	 * 
	 * @param nombre El nombre común del pez.
	 * @param cientifico El nombre científico del pez.
	 * @param tipo El tipo de planta.
	 * @param coste El precio de compra del pez.
	 * @param monedas La cantidad de monedas que da al venderlo.
	 * @param huevos La cantidad de huevos que pone.
	 * @param ciclo El número de días tras los que se vuelve a reproducir.
	 * @param madurez El número de días que tarda en llegar a la edad adulta.
	 * @param optimo El número de días tras los cuales se vende.
	 * @param props Las propiedades de los peces.
	 * @param pisc El tipo de piscifactoría en la que puede criarse.
	 */
	public PecesDatos(String nombre, String cientifico, PecesTipo tipo, int coste, int monedas, int huevos, int ciclo, int madurez, int optimo, PecesProps[] props, CriaTipo pisc) {
		this.nombre = nombre;
		this.cientifico = cientifico;
		this.tipo = tipo;
		this.coste = coste;
		this.monedas = monedas;
		this.huevos = huevos;
		this.ciclo = ciclo;
		this.madurez = madurez;
		this.optimo = optimo;
		this.propiedades = props;
		this.piscifactoria = pisc;
	}

	/**
	 * @return El nombre del pez
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * @return El nombre científico del pez.
	 */
	public String getCientifico() {
		return this.cientifico;
	}

	/**
	 * @return El tipo de pez.
	 */
	public PecesTipo getTipo() {
		return this.tipo;
	}

	/**
	 * @return El precio de compra del pez.
	 */
	public int getCoste() {
		return this.coste;
	}

	/**
	 * @return La cantidad de monedas que da al venderlo.
	 */
	public int getMonedas() {
		return this.monedas;
	}

	/**
	 * @return La cantidad de huevos que pone.
	 */
	public int getHuevos() {
		return this.huevos;
	}

	/**
	 * @return El número de días tras los que se vuelve a reproducir.
	 */
	public int getCiclo() {
		return this.ciclo;
	}

	/**
	 * @return El número de días que tarda en llegar a la edad adulta.
	 */
	public int getMadurez() {
		return this.madurez;
	}

	/**
	 * @return El número de días tras los cuales se vende.
	 */
	public int getOptimo() {
		return this.optimo;
	}

	/**
	 * @return Las propiedades del pez.
	 */
	public PecesProps[] getPropiedades() {
		return this.propiedades;
	}

	/**
	 * @return El tipo de piscifactoría en la que puede criarse
	 */
	public CriaTipo getPiscifactoria() {
		return this.piscifactoria;
	}
}
