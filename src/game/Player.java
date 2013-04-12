package game;

public class Player {
	private static int lastID = 0;
	private boolean szin;
	private int jp;
	private int id;
	private int epuletekSzama;
	private boolean isActive;
	
	public Player(boolean szin,int i,int j){
		epuletekSzama = 1;
		isActive = false;
		this.szin = szin;
		if (lastID<2)
			lastID++;
		id = lastID;
		if (szin == false)
			Drawer.mezok[0][0].setowns(1);
		else Drawer.mezok[9][9].setowns(5);
		jp=100;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public void switchPlayer(Player p1, Player p2){
		if (p1.isActive()){
			p1.setActive(false);
			p2.setActive(true);
		}
		else {
			p2.setActive(false);
			p1.setActive(true);
		}
	}
	
	
}
