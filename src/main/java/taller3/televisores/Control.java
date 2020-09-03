package taller3.televisores;

public class Control {
	TV tv;
	
	public Control() {

	}
	public void turnOn() {
		if (tv.estado==false) {
			tv.estado=true;
		}
	}
	public void turnOff() {
		if (tv.estado==true){
			tv.estado=false;
		}
	}
	public void canalUp() {
		if ((tv.estado==true) && (tv.canal >= 1) && (tv.canal < 120)) {
			tv.canalUp();
		}
	}
	public void canalDown() {
		if ((tv.estado==true) && (tv.canal>1) && (tv.canal<=120)) {
			tv.canalDown();
			}
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void setCanal(int canal) {
		if ((canal>=1) && (canal<=120)  && (tv.estado==true)){
			tv.canal=canal;
		}

	}

	public void enlazar(TV tv1){

		tv=tv1;
		tv.setControl(this);

	}

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}


}
