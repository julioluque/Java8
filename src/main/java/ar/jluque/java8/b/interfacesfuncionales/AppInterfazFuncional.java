package ar.jluque.java8.b.interfacesfuncionales;

public class AppInterfazFuncional implements IOperacion {

	public static void main(String[] args) {
		AppInterfazFuncional app = new AppInterfazFuncional();
		System.out.println(app.calcular(23, 5));
	}

	@Override
	public double calcular(double x, double y) {
		IOperacion op = (x1, y1) -> x1 + y1;
		return op.calcular(x, y);
	}


}