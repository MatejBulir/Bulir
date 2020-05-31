import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends ObjektHry {
	Random r = new Random();
Handler handler;
	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;

	}
public Rectangle getBounds() {
	return new Rectangle(x,y,32,32);
}
	public void tick() {
		x += VelX;
		y += VelY;
		x = Main.clamp(x, 0, Main.WIDTH-32);
		y = Main.clamp(y, 0, Main.HEIGHT-32);
		
		collision();
		handler.addObject(new Trail(x,y,ID.Trail, Color.white,32,32,0.1f,handler));
	}
public void collision() {
	for( int  i = 0; i<handler.object.size(); i++){
		ObjektHry tempObject = handler.object.get(i);
		if(tempObject.getId() == ID.BasicEnemy||tempObject.getId() == ID.FastEnemy||tempObject.getId() == ID.SmartEnemy) {
			if(getBounds().intersects(tempObject.getBounds())) {
				//kod colize
				HUD.HEALTH -=2;
			}
		}
	}
}
	public void render(Graphics g) {
		if(id == ID.Player)	g.setColor(Color.white);	
		g.fillRect(x, y, 32, 32);
	}
	
	
}
