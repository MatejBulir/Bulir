import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class SmartEnemy extends ObjektHry{
	private Handler handler;
	private ObjektHry player;
public SmartEnemy(int x, int y, ID id, Handler handler) {
	super(x,y,id);
	this.handler = handler;
	
	for (int i = 0; i< handler.object.size(); i++) {
		if(handler.object.get(i).getId() == ID.Player) player = handler.object.get(i);
	}

}
public Rectangle getBounds() {
	return new Rectangle(x,y,16,16);
}
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x += VelX;
		y += VelY;
		
		float diffX = x - player.getX() - 8; 
		float diffY = y - player.getY() - 8;
		float distance = (float) Math.sqrt((x-player.getX())*(x-player.getX())+(y-player.getY()) * (y-player.getY()));
  		VelX = (int) ((-1.0/distance)*diffX*3);
  		VelY = (int) ((-1.0/distance)*diffY*3);
  		
		if(y<=0||y>=Main.HEIGHT-32) VelY *= -1; 
		if(x<=0||x>=Main.WIDTH-16) VelX *= -1; 
		handler.addObject(new Trail(x,y,ID.Trail, Color.yellow,16,16,0.02f,handler));
		
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x,y,16,16);
	}

}