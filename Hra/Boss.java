import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Boss extends ObjektHry{
	private Handler handler;
	Random r = new Random();
	private int timer = 100;
	private int timer2 = 50;
public Boss(int x, int y, ID id, Handler handler) {
	super(x,y,id);
	this.handler = handler;
	VelX=0;
	VelY=3;
}
public Rectangle getBounds() {
	return new Rectangle(x,y,64,64);
}
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x += VelX;
		y += VelY;
		if(timer <=0) VelY = 0;
		else timer --;
		if(timer <=0)timer2--;
		if(timer2<=0) {
			if(VelX == 0 ) VelX = 2;
	
		
			int spawn = r.nextInt(20);
			if(spawn == 0 ) handler.addObject(new BossBullet(x+48,y+48,ID.BasicEnemy, handler));
		}  	
		//if(y<=0||y>=Main.HEIGHT-32) VelY *= -1; 
		if(x<=0||x>=Main.WIDTH-48) VelX *= -1; 
		//handler.addObject(new Trail(x,y,ID.Trail, Color.orange,64,64,0.02f,handler));
}			
	@Override
	public void render(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(x,y,64,64);
	}
}