package ar.jluque.telmexhub.lambda;

import java.util.ArrayList;
import java.util.List;

public class Mock {

	public List<Persona> CargarDatos() {

		List<Persona> p = new ArrayList<>();
		Persona p1 = new Persona();
		p1.setId(1);
		p1.setNombre("Julio Luque");
		p1.setEdad(23);
		p1.setSexo(Sex.HH);
		p1.setTelefono(151121211);
		p1.setEmail("persona1@gmail.com");
		p1.setCodigoPostal(1702);
		p.add(p1);

		Persona p2 = new Persona();
		p2.setId(2);
		p2.setNombre("Delfina Luque");
		p2.setEdad(1);
		p2.setSexo(Sex.MM);
		p2.setTelefono(0);
		p2.setEmail("persona2@gmail.com");
		p2.setCodigoPostal(1702);
		p.add(p2);

		Persona p3 = new Persona();
		p3.setId(3);
		p3.setNombre("Saturnino Luque");
		p3.setEdad(65);
		p3.setSexo(Sex.HH);
		p3.setTelefono(1533333333);
		p3.setEmail("persona3@gmail.com");
		p3.setCodigoPostal(1702);
		p.add(p3);

		Persona p4 = new Persona();
		p4.setId(4);
		p4.setNombre("Cecilia Ortiz");
		p4.setEdad(29);
		p4.setSexo(Sex.MM);
		p4.setTelefono(1544444444);
		p4.setEmail("persona4@gmail.com");
		p4.setCodigoPostal(1702);
		p.add(p4);

		Persona p5 = new Persona();
		p5.setId(5);
		p5.setNombre("Julian Lopez");
		p5.setEdad(39);
		p5.setSexo(Sex.HH);
		p5.setTelefono(1555555555);
		p5.setEmail("persona5@gmail.com");
		p5.setCodigoPostal(1290);
		p.add(p5);

		Persona p6 = new Persona();
		p6.setId(6);
		p6.setNombre("Gaston Greco");
		p6.setEdad(25);
		p6.setSexo(Sex.HH);
		p6.setTelefono(1566666666);
		p6.setEmail("persona6@gmail.com");
		p6.setCodigoPostal(1554);
		p.add(p6);

		Persona p7 = new Persona();
		p7.setId(7);
		p7.setNombre("Camila Milagros");
		p7.setEdad(19);
		p7.setSexo(Sex.MM);
		p7.setTelefono(1577777777);
		p7.setEmail("persona7@gmail.com");
		p7.setCodigoPostal(1469);
		p.add(p7);

		Persona p8 = new Persona();
		p8.setId(8);
		p8.setNombre("Brenda Bucafusco");
		p8.setEdad(18);
		p8.setSexo(Sex.MM);
		p8.setTelefono(1588888888);
		p8.setEmail("persona8@gmail.com");
		p8.setCodigoPostal(1901);
		p.add(p8);

		Persona p9 = new Persona();
		p9.setId(9);
		p9.setNombre("Yordi Gonzalez");
		p9.setEdad(29);
		p9.setSexo(Sex.HH);
		p9.setTelefono(1510101010);
		p9.setEmail("persona9@gmail.com");
		p9.setCodigoPostal(1443);
		p.add(p9);

		Persona p10 = new Persona();
		p10.setId(10);
		p10.setNombre("Annie Luz");
		p10.setEdad(12);
		p10.setSexo(Sex.MM);
		p10.setTelefono(1544444444);
		p10.setEmail("persona10@gmail.com");
		p10.setCodigoPostal(1469);
		p.add(p10);
		
		return p;
	}

}
