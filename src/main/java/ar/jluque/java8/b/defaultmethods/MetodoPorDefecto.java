package ar.jluque.java8.b.defaultmethods;

public class MetodoPorDefecto implements IVendedor, ICocinero {

	@Override
	public void caminar() {
		System.out.println("Esta persona empezo a caminar...");
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
//		ICocinero.super.hablar();
		System.out.println("Un requisito de los empleados es comunicarse mientras trabajan");
	}
	
	public static void main(String[] args) {
		MetodoPorDefecto app = new MetodoPorDefecto();
		app.caminar();
		app.respirar();
		app.hablar();
	}

}
