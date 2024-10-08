package propiedades;

import estadisticas.Estadisticas;

public class Main {

	public static void main(String[] args) {
		
		//PecesDatos salmon = AlmacenPropiedades.getPropByName("Salmón atlántico");
		
		//System.out.println(salmon.getCientifico());

		String[] peces = {
			AlmacenPropiedades.CARPA.getNombre(),
			AlmacenPropiedades.CARPIN_TRES_ESPINAS.getNombre(),
			AlmacenPropiedades.KOI.getNombre(),
			AlmacenPropiedades.PEJERREY.getNombre(),
			AlmacenPropiedades.SALMON_CHINOOK.getNombre(),
			AlmacenPropiedades.ABADEJO.getNombre(),
			AlmacenPropiedades.BESUGO.getNombre(),
			AlmacenPropiedades.CABALLA.getNombre(),
			AlmacenPropiedades.RODABALLO.getNombre(),
			AlmacenPropiedades.SARGO.getNombre(),
			AlmacenPropiedades.DORADA.getNombre(),
			AlmacenPropiedades.TRUCHA_ARCOIRIS.getNombre()
		};
		
		Estadisticas st = new Estadisticas(peces);
		st.registrarNacimiento(AlmacenPropiedades.DORADA.getNombre());
		st.registrarVenta("Salmón chinook", 5000);
		st.mostrar();
		System.out.println("===========================");
		String save = st.exportarDatos(peces);
		System.out.println(save);

		Estadisticas s2 = new Estadisticas(peces, save);

		s2.mostrar();
	}

}
