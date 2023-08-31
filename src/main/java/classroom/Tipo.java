package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	int codigo;
	String nombre;
	private Tipo(int codigo) {
		this(codigo, "");
		this.codigo = codigo;
		
	}
	private Tipo(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
