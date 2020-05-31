import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class FastEnemy extends ObjektHry{
	private Handler handler;
public FastEnemy(int x, int y, ID id, Handler handler) {
	super(x,y,id);
	this.handler = handler;
	VelX=2;
	VelY=9;
}
public Rectangle getBounds() {
	return new Rectangle(x,y,16,16);
}
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x += VelX;
		y += VelY;
		if(y<=0||y>=Main.HEIGHT-32) VelY *= -1; 
		if(x<=0||x>=Main.WIDTH-16) VelX *= -1; 
		handler.addObject(new Trail(x,y,ID.Trail, Color.blue,16,16,0.02f,handler));
		
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x,y,16,16);
	}

}
