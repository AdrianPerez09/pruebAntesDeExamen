package modelo;
/**
 * 
 * @author Usuario
 *
 */
public class Persona {
	
	String nombre;
	int edad;
	char sexo;
	char origen;
	float peso;
	int altura;
	Persona pareja;
	
	
	public Persona() {
		
	}
		/**
		 * 
		 * @param nombre String que contiene el nombre de la persona
		 * @param edad entero que contiene la edad
		 * @param sexo	caracter que indica el sexo
		 * @param origen	caracter que indica el origen
		 * @param pareja	objeto que almacena los datos de una persona que es la pareja
		 * @param peso		float que contiene el peso con decimales
		 * @param altura	entero que contiene la altura en cm
		 */
		public Persona(String nombre, int edad, char sexo, char origen, Persona pareja, float peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.origen = origen;
		this.pareja = pareja;
		this.peso = peso;
		this.altura = altura;		
	}

	
		/**
		 * 
		 * @return devuelve el nombre
		 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @param nombre asigna el nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return devuelve la edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * 
	 * @param set para introducir edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	 /**
	  * 
	  * @return devuelve el caracter de su sexo
	  */
	public char getSexo() {
		return sexo;
	}

	/**
	 * 
	 * @param sexo introduce el sexo
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	
	/**
	 * 
	 * @return sirve para obtener el caracter del origen
	 */
	public char getOrigen() {
		return origen;
	}

	
	 /**
	  * 
	  * @param origen sirve para añadir el caracter origen
	  */
	public void setOrigen(char origen) {
		this.origen = origen;
	}
	
	/**
	 * 
	 * @return devuelve el objeto pareja
	 */
	public Persona getPareja() {
		return pareja;
	}

	/**
	 * 
	 * @param pareja sirve para añadir una pareja
	 */
	public void setPareja(Persona pareja) {
		this.pareja = pareja;
	}
		
	/**
	 * 
	 * @return sirve para obtener el entero peso
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * 
	 * @param peso sirve para añadir el peso 
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}

	/**
	 * 
	 * @return sirve para obtener la altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * 
	 * @param altura sirve para añadir la altura
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * 
	 * @param devuelve si la persona es mas joven que la otra
	 * @return
	 */
	public boolean esMasJovenQue(Persona p) {
		if(edad < p.getEdad())
			return true;
		else return false;
	}
	
	/**
	 * 
	 * @return devuelve si la persona es mas joven que su pareja
	 */
	public boolean esMasJovenQueSuPareja() {
		if(edad < pareja.getEdad())
			return true;
		else return false;
	}
	
	/**
	 * 
	 * @return devuelve el origen pero con más caracteres
	 */
	public String getOrigenFormatoLargo() {
		String origenLargo = new String();
		switch (origen){
		case 'N': origenLargo = "norte"; break;
		case 'S': origenLargo = "sur"; break;
		case 'E': origenLargo = "este"; break;
		case 'O': origenLargo = "oeste"; break;
		}
		return origenLargo;		
	}
	
	/**
	 * Muestra los datos de la persona y si es <b>M</b> es mujer y si es <b>H</b> es hombre
	 */
	public void mostrarDatos(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " +  edad);
		if (sexo == 'M')
			System.out.println("Sexo: hombre");
		else
			System.out.println("Sexo: mujer");
	}
	
	
	/**
	 * 
	 * @returndevuelve el indice de masa corporal
	 */
	public float calcularIMC(){
		float alturaMetros = altura / 100;
		return peso/((alturaMetros*alturaMetros));
	}
	
	
	/**
	 * 
	 * @return calcula si tiene sobrepeso
	 */
	public boolean tieneSobrepeso(){
		float imc = calcularIMC();
		if(imc > 25)
			return true;
		else 
			return false;
	}	}
