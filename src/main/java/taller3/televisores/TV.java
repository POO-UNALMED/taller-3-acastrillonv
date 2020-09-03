package taller3.televisores;

public class TV {

	Marca marca;
	Control control;
	static int canal=1;
	static int precio=500;
	static boolean estado;
	static int volumen=1;
	static int numTV;
	
	public static int getNumTV() {
		return numTV;
	}

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}

	public TV(Marca marca,boolean estado) {
		this.marca=marca;
		estado=this.estado;
		++numTV;
	}
	
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
		
	}
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public static int getCanal() {
		return canal;
	}

	public static void setCanal(int canal) {
		if ((canal>=1) && (canal<=120)  && (TV.estado==true)){
			TV.canal = canal;
		}

	}

	public static int getPrecio() {
		return precio;
	}

	public static void setPrecio(int precio) {
		TV.precio = precio;
	}

	public static int getVolumen() {
		return volumen;
	}

	public static void setVolumen(int volumen) {
		if ((TV.estado==true) && (volumen>=0) && (volumen<=7)){
		TV.volumen = volumen;
		}
	}


	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if ((estado==true) && (canal>=1) && (canal<120)) {
		canal++;
		}
	}
	public void canalDown() {
		if ((estado==true) && (canal>1) && (canal<=120)) {
			canal--;
			}
	}
	
	public void volumenUp() {
		if ((estado==true) && (volumen>=0) && (volumen<7)) {
			volumen++;
			}
		
	}
	public void volumenDown() {
		if ((estado==true) && (volumen>0) && (volumen<=7)) {
			volumen--;
			}
	}
	


}
