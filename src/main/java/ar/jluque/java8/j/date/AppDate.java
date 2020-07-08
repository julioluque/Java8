package ar.jluque.java8.j.date;

public class AppDate {

	public static void main(String[] args) {

		try {
			MetodosDateImpl met = new MetodosDateImpl();
			System.out.println("--- compararFechas -------");
			met.compararFechas(8);
			System.out.println("----medirLapsosTiempo------");
			met.medirLapsosTiempo(8);
			System.out.println("----medirLapsosTiempo------");
			met.medirLapsosFechas(8);
			System.out.println("----convertirFechas------");
			met.convertirFechas(8);
		} catch (Exception e) {

			System.out.println("algo salio mal");
		}
	}
}
