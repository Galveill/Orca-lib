package propiedades;

import java.lang.reflect.Field;

/**
 * Almacén de todos los datos de los peces
 * @author Adrián Fdez. Glez.
 * @version 1.0.0
 *
 */
public class AlmacenPropiedades {

	//String nombre, String cientifico, PecesTipo tipo, int coste, int monedas, int huevos, int ciclo, int madurez, int optimo, PecesProps[] props, CriaTipo pisc
	//Río
	public static final PecesDatos CARPA = new PecesDatos("Carpa", "Cyprinus carpio", PecesTipo.NORMAL, 50, 45, 4, 5, 5, 20, new PecesProps[]{PecesProps.OMNIVORO, PecesProps.VORAZ}, CriaTipo.RIO);
	public static final PecesDatos KOI = new PecesDatos("Koi", "Cyprinus carpio var. Koi", PecesTipo.INVERSION, 300, 80, 2, 5, 10, 45, new PecesProps[]{PecesProps.OMNIVORO, PecesProps.LONGEVO}, CriaTipo.RIO);
	public static final PecesDatos CARPA_PLATEADA = new PecesDatos("Carpa plateada", "Hypophthalmichthys molitrix", PecesTipo.BASE, 35, 15, 4, 5, 5, 10, new PecesProps[]{PecesProps.FILTRADOR}, CriaTipo.RIO);
	public static final PecesDatos SALMON_CHINOOK = new PecesDatos("Salmón chinook", "Oncorhynchus tshawytscha", PecesTipo.NORMAL, 80, 20, 2, 5, 5, 10, new PecesProps[]{PecesProps.CARNIVORO}, CriaTipo.RIO);
	public static final PecesDatos TILAPIA_NILO = new PecesDatos("Tilapia del Nilo", "Oreochromis niloticus", PecesTipo.BASE, 25, 15, 1, 2, 1, 10, new PecesProps[]{PecesProps.FILTRADOR}, CriaTipo.RIO);
	public static final PecesDatos PEJERREY = new PecesDatos("Pejerrey ", "Odontesthes bonariensis", PecesTipo.BASE, 25, 10, 1, 1, 1, 5, new PecesProps[]{PecesProps.CARNIVORO}, CriaTipo.RIO);
	public static final PecesDatos SILURO_EUROPEO = new PecesDatos("Siluro europeo", "Silurus glanis", PecesTipo.INVERSION, 150, 50, 3, 5, 5, 20, new PecesProps[]{PecesProps.CARNIVORO, PecesProps.LONGEVO, PecesProps.VORAZ}, CriaTipo.RIO);
	public static final PecesDatos PERCA_EUROPEA = new PecesDatos("Perca europea", "Perca fluviatilis", PecesTipo.INVERSION, 100, 30, 2, 5, 3, 20, new PecesProps[]{PecesProps.CARNIVORO, PecesProps.ACTIVO}, CriaTipo.RIO);
	public static final PecesDatos LUCIO_NORTE = new PecesDatos("Lucio del norte", "Esox lucius", PecesTipo.INVERSION, 150, 35, 2, 5, 5, 25, new PecesProps[]{PecesProps.CARNIVORO, PecesProps.ACTIVO}, CriaTipo.RIO);
	public static final PecesDatos CARPIN_TRES_ESPINAS = new PecesDatos("Carpín de tres espinas", "Gasterosteus aculeatus", PecesTipo.BASE, 15, 6, 2, 1, 1, 3, new PecesProps[]{PecesProps.OMNIVORO, PecesProps.COMEDIDO}, CriaTipo.RIO);

	//Mar
	public static final PecesDatos RODABALLO = new PecesDatos("Rodaballo", "Scophthalmus maximus", PecesTipo.INVERSION, 250, 80, 2, 2, 5, 30, new PecesProps[]{PecesProps.CARNIVORO, PecesProps.VORAZ}, CriaTipo.MAR);
	public static final PecesDatos BESUGO = new PecesDatos("Besugo", "Pagellus bogaraveo", PecesTipo.NORMAL, 200, 55, 3, 5, 10, 40, new PecesProps[]{PecesProps.CARNIVORO}, CriaTipo.MAR);
	public static final PecesDatos ROBALO = new PecesDatos("Róbalo", "Centropomus undecimalis", PecesTipo.NORMAL, 180, 15, 5, 5, 5, 10, new PecesProps[]{PecesProps.CARNIVORO}, CriaTipo.MAR);
	public static final PecesDatos LENGUADO_EUROPEO = new PecesDatos("Lenguado europeo", "Solea solea", PecesTipo.INVERSION, 250, 40, 3, 8, 10, 25, new PecesProps[]{PecesProps.CARNIVORO}, CriaTipo.MAR);
	public static final PecesDatos CORVINA = new PecesDatos("Corvina", "Argyrosomus regius", PecesTipo.INVERSION, 300, 100, 2, 5, 10, 40, new PecesProps[]{PecesProps.CARNIVORO, PecesProps.VORAZ}, CriaTipo.MAR);
	public static final PecesDatos SARGO = new PecesDatos("Sargo", "Diplodus sargus", PecesTipo.INVERSION, 150, 25, 4, 2, 5, 12, new PecesProps[]{PecesProps.OMNIVORO}, CriaTipo.MAR);
	public static final PecesDatos LUBINA_RAYADA = new PecesDatos("Lubina rayada", "Morone saxatilis", PecesTipo.INVERSION, 200, 35, 3, 5, 5, 20, new PecesProps[]{PecesProps.CARNIVORO}, CriaTipo.MAR);
	public static final PecesDatos ARENQUE_ATLANTICO = new PecesDatos("Arenque del Atlántico", "Clupea harengus", PecesTipo.BASE, 50, 15, 3, 5, 5, 10, new PecesProps[]{PecesProps.FILTRADOR}, CriaTipo.MAR);
	public static final PecesDatos CABALLA = new PecesDatos("Caballa", "Scomber scombrus", PecesTipo.BASE, 30, 10, 3, 2, 2, 5, new PecesProps[]{PecesProps.CARNIVORO}, CriaTipo.MAR);
	public static final PecesDatos ABADEJO = new PecesDatos("Abadejo", "Pollachius pollachius", PecesTipo.BASE, 80, 30, 2, 5, 8, 25, new PecesProps[]{PecesProps.CARNIVORO, PecesProps.COMEDIDO}, CriaTipo.MAR);
	public static final PecesDatos COBIA = new PecesDatos("Cobia", "Rachycentron canadum", PecesTipo.RIESGO, 100, 60, 5, 5, 5, 30, new PecesProps[]{PecesProps.CARNIVORO, PecesProps.VORAZ, PecesProps.COMEDIDO}, CriaTipo.MAR);

	//Doble
	public static final PecesDatos TRUCHA_ARCOIRIS = new PecesDatos("Trucha arcoíris", "Oncorhynchus mykiss", PecesTipo.BASE, 60, 10, 1, 2, 2, 8, new PecesProps[]{PecesProps.CARNIVORO}, CriaTipo.DOBLE);
	public static final PecesDatos SALMON_ATLANTICO = new PecesDatos("Salmón atlántico", "Salmo salar", PecesTipo.INVERSION, 200, 30, 2, 2, 3, 10, new PecesProps[]{PecesProps.CARNIVORO}, CriaTipo.DOBLE);
	public static final PecesDatos DORADA = new PecesDatos("Dorada", "Sparus aurata", PecesTipo.NORMAL, 160, 45, 3, 5, 5, 30, new PecesProps[]{PecesProps.OMNIVORO}, CriaTipo.DOBLE);
	public static final PecesDatos LUBINA_EUROPEA = new PecesDatos("Lubina europea", "Dicentrarchus labrax", PecesTipo.BASE, 60, 25, 2, 5, 5, 20, new PecesProps[]{PecesProps.CARNIVORO}, CriaTipo.DOBLE);
	public static final PecesDatos BAGRE_CANAL = new PecesDatos("Bagre de canal", "Ictalurus punctatus", PecesTipo.INVERSION, 250, 75, 1, 5, 5, 30, new PecesProps[]{PecesProps.CARNIVORO, PecesProps.VORAZ}, CriaTipo.DOBLE);

	/**
	 * Devuelve los datos en base al nombre del pez. Este tiene que llamarse exactamente igual al del documento.
	 * @param nombre El nombre del pez tal cual el documento facilitado.
	 * @return Los datos de dicho pez o null si no existe.
	 */
	public static PecesDatos getPropByName(String nombre)
	{
		try {
			Field[] props = AlmacenPropiedades.class.getFields();
			for(Field prop : props)
			{
				PecesDatos act = (PecesDatos) prop.get(null);
				if(act.getNombre().toLowerCase().equals(nombre.toLowerCase()))
				{
					return act;
				}
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			System.err.println("Error en la reflexión de getPropByName");
		}
		return null;
	}
	
	/**
	 * Devuelve los datos en base al nombre científico del pez. Este tiene que ser igual al del documento.
	 * @param nombre El nombre científico del pez tal cual el documento facilitado.
	 * @return Los datos de dicho pez o null si no existe.
	 */
	public static PecesDatos getPropByScientificName(String nombre)
	{
		try {
			Field[] props = AlmacenPropiedades.class.getFields();
			for(Field prop : props)
			{
				PecesDatos act = (PecesDatos) prop.get(null);
				if(act.getCientifico().toLowerCase().equals(nombre.toLowerCase()))
				{
					return act;
				}
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			System.err.println("Error en la reflexión de getPropByScientificName");
		}
		return null;
	}
}
