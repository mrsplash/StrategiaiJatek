package game;
import processing.core.*;

public class Mezo {
	/** Mezo - Field
	 *  It contains the data of Field.
	 *  (E.g.: x,y,size, highlight ... etc.)
	 * 	It's should be used as an array.
	 */
	private int x,y,sizeX,sizeY;
	private int owns;
	private boolean isHighlighted;
	public Mezo(int x,int y, int x2, int y2){
		this.x=x;
		this.y=y;
		this.sizeX=x2;
		this.sizeY=y2;
		owns=0;
		isHighlighted=false;
	}
	public int getX() {
		return x;
	}
	public void setX(int x1) {
		this.x = x1;
	}
	public boolean getisHighlighted() {
		return isHighlighted;
	}
	public void setisHighlighted(boolean b) {
		isHighlighted = b;
	}
	public int getY() {
		return y;
	}
	public void setY(int y1) {
		this.y = y1;
	}
	public int getSizeX() {
		return sizeX;
	}
	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}
	public int getSizeY() {
		return sizeY;
	}
	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}
	public int getowns(){
		return owns;
	}
	public void setowns(int s){
		/** Gives value tells what the field owns.
		 *  0 means the field is empty.
		 *  1 means there is a MainBuilding on it.
		 *  2 means there is a SniperBuilding on it.
		 *  3 means there is a Hospital on it.
		 *  4 means there is a Soldier on it.
		 */
		
		if (s>=0 || s<=8)
			owns=s;
		//else
		//valid values 0-4; 
	}
}
