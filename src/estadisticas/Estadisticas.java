package estadisticas;

import java.util.HashMap;
import java.util.Map;

import propiedades.AlmacenPropiedades;
import propiedades.PecesDatos;

/**
 * Clase que gestiona las estadísticas de los peces del sistema.
 * 
 * @author Adrián Fdez. Glez.
 * @version 1.2.0
 *
 */
public class Estadisticas {
	
	/** El número de peces vendidos de cada uno de los peces del sistema **/
	private final HashMap<String, Integer> vendidos;
	
	/** El número de peces criados de cada uno de los peces del sistema **/
	private final HashMap<String, Integer> criados;

	/** El número de monedas ganadas de cada uno de los peces del sistema **/
	private final HashMap<String, Integer> ganado;
	
	/**
	 * Constructor básico.
	 * 
	 * @param nombres El array con los nombres de los peces del sistema.
	 * @throws IllegalArgumentException Si alguno de los nombres no coincide con los del documento. Estos pueden ser revisados en la clase <code>AlmacenPropiedades</code>.
	 */
	public Estadisticas(String[] nombres) throws IllegalArgumentException
	{
		this(nombres, "");
	}

	/**
	 * Constructor parametrizado que importa los datos de los peces para poder restaurar una partida guardada.
	 * @param nombres El array con los nombres de los peces del sistema.
	 * @param datos Los datos a importar. Tienen que estar generados por <code>exportarDatos</code>.
	 * @throws IllegalArgumentException Si el formato de los datos no es el adecuado o si alguno de los nombres no coincide con los del documento. Estos pueden ser revisados en la clase <code>AlmacenPropiedades</code>.
	 */
	public Estadisticas(String[] nombres, String datos) throws IllegalArgumentException
	{
		HashMap<String, Integer> v = new HashMap<>();
		HashMap<String, Integer> c = new HashMap<>();
		HashMap<String, Integer> g = new HashMap<>();

		boolean empty = (datos == "" || datos == null);
		String[] pData = {};

		if(!empty)
		{
			pData = datos.split(";");
		}

		for(int i = 0; i < nombres.length; i++)
		{
			String nombre = nombres[i];
			if(AlmacenPropiedades.getPropByName(nombre) != null)
			{
				String[] info = {};
				if(!empty)
				{
					info = pData[i].split(",");
				}
				v.put(nombre, (empty ? 0 : Integer.parseInt(info[0])));
				c.put(nombre, (empty ? 0 : Integer.parseInt(info[1])));
				g.put(nombre, (empty ? 0 : Integer.parseInt(info[2])));
			}else{
				throw new IllegalArgumentException();
			}
		}
		
		this.vendidos = v;
		this.criados = c;
		this.ganado = g;
	}
	
	/**
	 * Registra una venta de un pez.
	 * @param nombre El nombre del pez
	 * @param monedas La cantidad de monedas ganadas con la venta
	 */
	public void registrarVenta(String nombre, int monedas)
	{
		if(this.vendidos.containsKey(nombre))
		{
			this.vendidos.replace(nombre, this.vendidos.get(nombre) + 1);
			this.ganado.replace(nombre, this.ganado.get(nombre) + monedas);
		}
	}

	/**
	 * Registra el nacimiento de un pez.
	 * @param nombre El nombre del pez
	 */
	public void registrarNacimiento(String nombre)
	{
		if(this.criados.containsKey(nombre))
		{
			this.criados.replace(nombre, this.criados.get(nombre) + 1);
		}
	}
	
	/**
	 * Muestra las estadísticas desglosadas por lugar de cría.
	 */
	public void mostrar()
	{
		String[] info = {"Río\n", "Mar\n", "Río o mar\n"};
		int[] numVen = new int[info.length];
		int[] numCria = new int[info.length];
		int[] numGan = new int[info.length];
		
		for(Map.Entry<String, Integer> cos : this.vendidos.entrySet())
		{
			String nom = cos.getKey();
			PecesDatos data = AlmacenPropiedades.getPropByName(nom);
			int v = cos.getValue();
			int c = this.criados.get(nom);
			int g = this.ganado.get(nom);
			
			String txt = data.getNombre() + " (" + data.getCientifico() + ") " + " Críados: " + c + " Vendidos: " + v + " Ganado: " + g + " monedas.\n";
			int idx = data.getPiscifactoria().getValue();
			info[idx] += txt;
			numVen[idx] += v;
			numCria[idx] += c;
			numGan[idx] += g;
		}
		
		for(int i = 0; i < info.length; i++)
		{
			System.out.print(info[i]);
			System.out.println("Total: " + numCria[i] + " criados. " + numVen[i] + " vendidos. " + numGan[i] + " monedas ganadas.");
		}
	}

	/**
	 * Genera y devuelve una codificación de las estadísticas almacenadas para ser guardadas en memoria.
	 * @param nombres El array con los nombres de los peces del sistema.
	 * @return La codificación de los datos guardados en Orca en formato String.
	 */
	public String exportarDatos(String[] nombres)
	{
		//vendidos,criados,ganado;
		String texto = "";
		for(String nom : nombres)
		{
			if(this.vendidos.get(nom) != null)
			{
				texto += this.vendidos.get(nom) + "," + this.criados.get(nom) + "," + this.ganado.get(nom) + ";";
			}
		}
		return texto.substring(0, texto.length()-1);
	}
}
