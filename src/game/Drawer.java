package game;
import processing.core.*;

public class Drawer extends PApplet{
	private int x;
	private int y;
	PImage kekFoEpulet;
	PImage kekSniperKepzo;
	PImage kekKorhaz;
	PImage kekHarcos;
	PImage kekSniper;
	PImage pirosFoEpulet;
	PImage pirosSniperKepzo;
	PImage pirosKorhaz;
	PImage pirosHarcos;
	PImage pirosSniper;
	PImage grass;
	PImage hGrass;
	PImage background;
	PImage kekHomokOra;
	PImage pirosHomokOra;
	PImage inaktivHomokOra;
	static Mezo[][] mezok=new Mezo[10][10];
	
	public Drawer(int x, int y){
		this.x=x;
		this.y=y;
		initImg();
	}
	
	private void initImg(){
		kekFoEpulet = loadImage(dataPath("")+"\\kekFoEpulet.png");
		pirosFoEpulet = loadImage(dataPath("")+"\\pirosFoEpulet.png");
		grass = loadImage(dataPath("")+"\\grass.png");
		hGrass = loadImage (dataPath("") + "\\hGrass.png");
		background = loadImage(dataPath("")+ "\\background.png" );
		kekHomokOra = loadImage(dataPath("")+ "\\kekHomokOra.png" );
		pirosHomokOra = loadImage(dataPath("")+ "\\pirosHomokOra.png" );
		inaktivHomokOra = loadImage(dataPath("")+ "\\szurkeHomokOra.png" );
		//sniperKepzo = loadImage("sniperKepzo.png") ;
		//korhaz = loadImage("korhaz.png") ;
		//harcos =  loadImage("harcos.png");
		//sniper =  loadImage("sniper.png");
	}
	
	public void drawMezo(Mezo m){
		imageMode(CORNER);
		switch (m.getowns()){
			case 1 : 
				image(kekFoEpulet,m.getX()+2,m.getY());
				break;
			case 5: 
				image(pirosFoEpulet,m.getX()+2,m.getY());
				break;
			default :
			if (!m.getisHighlighted()){
				image(grass,m.getX(),m.getY());
				break;
			}
			else {
				image(hGrass,m.getX(),m.getY());
				break;
			}
		}		
	}
	
	

	public void setup(){
		size(x,y);
		imageMode(CORNER);
		image(background,0,0);
		for (int i=0; i<10; i++)
			for (int j=0; j<10; j++){
				mezok[i][j] = new Mezo(150+i*50,50+j*50,50,50);
				drawMezo(mezok[i][j]);
			}
		Player p1 = new Player(false ,0,0);
		drawMezo(mezok[0][0]);
		Player p2 = new Player(true, 9,9);
		drawMezo(mezok[9][9]);
		p1.setActive(true);
		p2.setActive(false);
		imageMode(CORNER);
		image(kekHomokOra,2,2);
		image(inaktivHomokOra, 675 , 500);
		
	}
	
	int i = 0,j = 0;
	public void draw(){
		//main loop
		
		if (mouseX > 150 && mouseY > 50 &&
				mouseX < 650 && mouseY < 550){
			if (((mouseX-150)/50)!=i || ((mouseY-50)/50)!= j){
				mezok[i][j].setisHighlighted(false);
				drawMezo(mezok[i][j]);
			}
			i=(mouseX-150)/50;
			j=(mouseY-50)/50;
			mezok[i][j].setisHighlighted(true);
			drawMezo(mezok[i][j]);
		}
	}
}
