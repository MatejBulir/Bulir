import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class BossBullet extends ObjektHry{
	private Handler handler;
	Random r = new Random();
public BossBullet(int x, int y, ID id, Handler handler) {
	super(x,y,id);
	this.handler = handler;
	VelX = (r.nextInt(5- -5) + -5);
	VelY=5;
}
public Rectangle getBounds() {
	return new Rectangle(x,y,16,16);
}
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x += VelX;
		y += VelY;
		//if(y<=0||y>=Main.HEIGHT-32) VelY *= -1; 
		//if(x<=0||x>=Main.WIDTH-16) VelX *= -1; 
		if(y>= Main.HEIGHT) handler.removeObject(this);
		handler.addObject(new Trail(x,y,ID.Trail, Color.green,16,16,0.02f,handler));		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x,y,16,16);
	}

}
