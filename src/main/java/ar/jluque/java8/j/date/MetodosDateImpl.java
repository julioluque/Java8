package ar.jluque.java8.j.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class MetodosDateImpl implements IMetodosDate {

	public void compararFechas(int version) {
		if (version == 7) {
			Calendar fecha1 = Calendar.getInstance();
			Calendar fecha2 = Calendar.getInstance();
			fecha1.set(2014, 07, 29);
			System.out.println(fecha1.after(fecha2));
		} else if (version == 8) {
			LocalDate fecha1 = LocalDate.of(2020, 07, 28);
			LocalDate fechaHoy = LocalDate.now();
			System.out.println(fecha1.isAfter(fechaHoy));

			LocalTime hora1 = LocalTime.of(23, 35, 59);
			LocalTime horaActual = LocalTime.now();
			System.out.println(hora1.isBefore(horaActual));

			LocalDateTime fechaHora = LocalDateTime.of(2019, 05, 26, 13, 40, 15);
			LocalDateTime fechaHoraActual = LocalDateTime.now();
			System.out.println(fechaHora.isAfter(fechaHoraActual));
		}
	}

	public void medirLapsosTiempo(int version) throws InterruptedException {
		if (version == 7) {
			long inicio = System.currentTimeMillis();
			Thread.sleep(1000);
			long fin = System.currentTimeMillis();
			System.out.println(inicio - fin);

		} else if (version == 8) {
			Instant inicio = Instant.now();
			Thread.sleep((int) (Math.random() * 1000));
			Instant fin = Instant.now();
			System.out.println(Duration.between(inicio, fin).toMillis());
		}
	}

	public void medirLapsosFechas(int version) {

		if (version == 7) {
			Calendar nacimiento = Calendar.getInstance();
			Calendar hoy = Calendar.getInstance();

			nacimiento.set(1985, 07, 12);
			hoy.set(2020, 6, 8);

			int anios = 0;

			while (nacimiento.before(hoy)) {
				nacimiento.add(Calendar.YEAR, 1);
				if (nacimiento.before(hoy)) {
					anios++;
				}
			}
			System.out.println(anios);
		} else if (version == 8) {
			LocalDate nacimiento = LocalDate.of(1985, 8, 12);
			LocalDate hoy = LocalDate.now();
			Period periodo = Period.between(nacimiento, hoy);

			System.out.println("Trancurrieron " + periodo.getYears() + " años, " + periodo.getMonths() + " meses y "
					+ periodo.getDays() + " dias, desde " + nacimiento + " hasta " + hoy);
		}
	}

	public void convertirFechas(int version) throws ParseException {

		if (version == 7) {
			String fechaTexto = "25/12/1999";
			DateFormat formateadorDeFechas = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaConvertida = formateadorDeFechas.parse(fechaTexto);
			System.out.println(fechaConvertida);

			Date fechaActual = Calendar.getInstance().getTime();
			formateadorDeFechas = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
			String fechaTextoNuevo = formateadorDeFechas.format(fechaActual);
			System.out.println(fechaTextoNuevo);
		} else if (version == 8) {
			String fechaTexto = "25/12/1999";
			DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechaConvertida = LocalDate.parse(fechaTexto, formateador);
			System.out.println(fechaConvertida);
			System.out.println(formateador.format(fechaConvertida));
		}
	}
}
