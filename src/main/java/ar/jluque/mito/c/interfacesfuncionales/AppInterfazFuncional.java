package ar.jluque.mito.c.interfacesfuncionales;

public class AppInterfazFuncional implements IOperacion {

	public static void main(String[] args) {
		AppInterfazFuncional app = new AppInterfazFuncional();
		app.iniciado();
		app.ejecutar();
		System.out.println(app.calcular(23, 5));
		
	}

	@Override
	public double calcular(double x, double y) {
		IOperacion op = (x1, y1) -> x1 + y1;
		return op.calcular(x, y);
	}


}
